package ua.lviv.iot.algo.part1.lab2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CameraManagerTest {
    private CameraManager cameraManager;
    @BeforeEach
    void setUp() {
        cameraManager = new CameraManager();

        cameraManager.addCamera(new DigitalCamera("XR", "Canon", "Nu", "1920x1080", 0,"Sap", 10));
        cameraManager.addCamera(new DigitalCamera("XP", "Canon", "Nu", "1920x1080", 2,"SGA", 20));
        cameraManager.addCamera(new FilmCamera("Carsa", "Sony", "Soft", "New",124231));
        cameraManager.addCamera(new FilmCamera("7", "GoPro", "UltraHD", "sd",232123));
        cameraManager.addCamera(new SpeedCamera("XS", "Axis", "Super",220,2000));
        cameraManager.addCamera(new SpeedCamera("DH", "Dahua", "Super",240,2500));
        cameraManager.addCamera(new HybridCamera("GV", "GHD", "Ultra", "4k","White"));
        cameraManager.addCamera(new HybridCamera("GV", "GHD", "Ultra", "4k","Black"));
    }

    @Test
    void testFindAllWithSameBrand() {
        List<Camera> cameras = cameraManager.findAllWithSameBrand("Canon");
        assertEquals(2, cameras.size());
        assertTrue(cameras.get(0) instanceof DigitalCamera);
        assertTrue(cameras.get(1) instanceof DigitalCamera);
    }

    @Test
    void testFindAllWithSameModel() {
        List<Camera> cameras = cameraManager.findAllWithSameModel("XP");
        Assertions.assertEquals(2, cameras.size());
        assertTrue(cameras.get(0) instanceof DigitalCamera, "DigitalCamera");
    }

    @Test
    void testGetAll() {
        List<Camera> cameras = cameraManager.getAll();
        assertEquals(24, cameras.size(), "There should be 8 cameras");
    }
}