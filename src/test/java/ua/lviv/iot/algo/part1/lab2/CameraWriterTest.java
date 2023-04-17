package ua.lviv.iot.algo.part1.lab2;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.List;
public class CameraWriterTest {
    private static final String RESULT_FILENAME = "result.csv";
    private static final String EXPECTED_FILENAME = "expected.csv";
    private CameraWriter writer;
    private List<Camera> cameraList;

    @BeforeEach
    public void setUp() throws IOException {
        writer = new CameraWriter(RESULT_FILENAME);
        cameraList = new ArrayList<>();
        cameraList.add(new DigitalCamera("XR", "Canon", "Nu",
                "1920", 0, "S", 10));
        cameraList.add(new DigitalCamera("XP", "Canon", "Nu",
                "1920", 2, "S", 20));
        cameraList.add(new FilmCamera("Carma", "Sony", "Soft",
                "New", 124231));
        cameraList.add(new SpeedCamera("XS", "Axis", "Super",
                220, 2000));

        Files.deleteIfExists(Path.of(RESULT_FILENAME));

        FileWriter fileWriter = new FileWriter(EXPECTED_FILENAME);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.close();
        fileWriter.close();
    }

    @AfterAll
    public static void tearDown() throws IOException {
        Files.deleteIfExists(Path.of(RESULT_FILENAME));
    }

    @Test
    public void testEmptyWrite() {
        writer = new CameraWriter(RESULT_FILENAME);
        try {
            writer.writeCamerasToFile(null);
            File file = new File(RESULT_FILENAME);
            Assertions.assertFalse(file.exists());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void testWriteListOfCameras() throws IOException {
        writer.writeCamerasToFile(cameraList);
        Path expected = new File(RESULT_FILENAME).toPath();
        Path actual = new File(EXPECTED_FILENAME).toPath();
        Files.copy(expected, actual, StandardCopyOption.REPLACE_EXISTING);

        Assertions.assertEquals(-1L, Files.mismatch(expected, actual));
    }

    @Test
    public void testFileOverride() throws IOException {
        testWriteListOfCameras();
    }

    @Test
    public void testWriteToFile() throws IOException {
        CameraWriter writer = new CameraWriter(RESULT_FILENAME);
        writer.writeCamerasToFile(cameraList);

        BufferedReader expectedReader = new BufferedReader(new FileReader(EXPECTED_FILENAME));
        BufferedReader actualReader = new BufferedReader(new FileReader(RESULT_FILENAME));
        String expectedLine;
        String actualLine;
        while ((expectedLine = expectedReader.readLine()) != null && (actualLine = actualReader.readLine()) != null) {
            Assertions.assertEquals(expectedLine, actualLine);
        }
        expectedReader.close();
        actualReader.close();
    }
}