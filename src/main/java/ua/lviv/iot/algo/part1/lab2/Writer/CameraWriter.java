package ua.lviv.iot.algo.part1.lab2.Writer;

import ua.lviv.iot.algo.part1.lab2.Model.*;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.List;

public class CameraWriter {

    private final String filePath;

    public CameraWriter() {
        filePath = "";
    }

    public CameraWriter(final String filePath) {
        this.filePath = filePath;
    }

    /**
     *
     * @param cameraList
     * @throws IOException
     */
    public void writeCamerasToFile(final List<Camera> cameraList,
                                   final String encoding)
            throws IOException {
        if (cameraList == null || cameraList.isEmpty()) {
            return;
        }
        FileOutputStream outputStream =
                new FileOutputStream(filePath);
        OutputStreamWriter outputStreamWriter =
                new OutputStreamWriter(outputStream, encoding);
        BufferedWriter bufferedWriter =
                new BufferedWriter(outputStreamWriter);
        boolean hasDigitalCameraHeader = false;
        boolean hasFilmCameraHeader = false;
        boolean hasSpeedCameraHeader = false;
        boolean hasHybridCameraHeader = false;

        for (Camera camera : cameraList) {
            if (camera instanceof DigitalCamera) {
                if (!hasDigitalCameraHeader) {
                    bufferedWriter.write(camera.getHeaders());
                    hasDigitalCameraHeader = true;
                }
                bufferedWriter.write(camera.toCSV());
            } else if (camera instanceof FilmCamera) {
                if (!hasFilmCameraHeader) {
                    bufferedWriter.write(camera.getHeaders());
                    hasFilmCameraHeader = true;
                }
                bufferedWriter.write(camera.toCSV());
            } else if (camera instanceof SpeedCamera) {
                if (!hasSpeedCameraHeader) {
                    bufferedWriter.write(camera.getHeaders());
                    hasSpeedCameraHeader = true;
                }
                bufferedWriter.write(camera.toCSV());
            } else if (camera instanceof HybridCamera) {
                if (!hasHybridCameraHeader) {
                    bufferedWriter.write(camera.getHeaders());
                    hasHybridCameraHeader = true;
                }
                bufferedWriter.write(camera.toCSV());
            }
        }

        bufferedWriter.close();
        outputStreamWriter.close();
        outputStream.close();
    }
}