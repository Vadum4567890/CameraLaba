package ua.lviv.iot.algo.part1.lab2;

import org.junit.jupiter.api.*;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class CameraManagerTest {
    private CameraManager cameraManager;
    @BeforeEach
    public void setUp() {
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
    @AfterEach
    public void delete(){
        cameraManager.getAll().clear();
    }

    @Test
    public void testFindAllWithSameBrand() {
        List<Camera> cameras = cameraManager.findAllWithSameBrand("Canon");
        assertEquals(2, cameras.size());
        for (var camera:cameras) {
            assertTrue(camera.getBrand()=="Canon");
        }
    }
    @Test
    public void testIsEmptyManager() {
        List<Camera> cameras = cameraManager.getAll();
        assertFalse(cameras.size()==0);
    }

    @Test
    public void testFindAllWithSameModel() {
        List<Camera> cameras = cameraManager.findAllWithSameModel("XP");
        Assertions.assertEquals(1, cameras.size());
        for (var camera:cameras) {
            assertTrue(camera.getModel()=="XP");
        }
    }
    @Test
    public void testIsThatBrandInList() {
        List<Camera> cameras = cameraManager.findAllWithSameModel("AMD");
        Assertions.assertEquals(0, cameras.size());
    }

    @Test
    public void testGetAll() {
        assertEquals(8,cameraManager.getAll().size());
    }
}