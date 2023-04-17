package ua.lviv.iot.algo.part1.lab2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpeedCameraTest {

    @Test
    void getMaxSpeedDetection() {
        var speedCamera = new SpeedCamera("XS", "Axis", "Super",220,2000);
        assertEquals(220, speedCamera.getMaxSpeedDetection());
    }

    @Test
    void getPrice() {
         var speedCamera = new SpeedCamera("XS", "Axis", "Super",220,2000);
         assertEquals(2000, speedCamera.getPrice());
    }

    @Test
    void setMaxSpeedDetection() {
        var speedCamera = new SpeedCamera("XS", "Axis", "Super",220,2000);
        speedCamera.setMaxSpeedDetection(1000);
        assertNotEquals(220,speedCamera.getMaxSpeedDetection());
    }

    @Test
    void setPrice() {
        var speedCamera = new SpeedCamera("XS", "Axis", "Super",220,2000);
        speedCamera.setPrice(1999);
        assertTrue(speedCamera.getPrice() == 1999);
    }

    @Test
    void takePhoto() {
        var speedCamera = new SpeedCamera("XS", "Axis", "Super",220,2000);
        String result = "Max speed Detection: " + speedCamera.getMaxSpeedDetection() + "\nFine Price: " + speedCamera.getPrice() + "\n";
        assertEquals(result, speedCamera.takePhoto());
    }
}