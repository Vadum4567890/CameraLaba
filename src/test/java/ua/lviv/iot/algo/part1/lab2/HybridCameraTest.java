package ua.lviv.iot.algo.part1.lab2;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class HybridCameraTest {

    @Test
    void testHybridCameraTakePhoto() {
        var camera = new HybridCamera("model", "brand", "lens", "resolution", "red");
        String photo = camera.takePhoto();
        assertEquals("Camera resolution: resolution\nCamera color: red\n", photo);
    }

    @Test
    void getResolution() {
        var camera = new HybridCamera("model", "brand", "lens", "resolution", "red");
        assertEquals("resolution", camera.getResolution());
    }

    @Test
    void getColor() {
        var camera = new HybridCamera("model", "brand", "lens", "resolution", "red");
        assertNotEquals("blue",camera.getColor());
    }

    @Test
    void setResolution() {
        var camera = new HybridCamera("model", "brand", "lens", "resolution", "red");
        camera.setResolution("2004x200");
        assertNotEquals("resolution", camera.getResolution());
    }

    @Test
    void setColor() {
        var camera = new HybridCamera("model", "brand", "lens", "resolution", "red");
        camera.setColor("blue");
        assertEquals("blue", camera.getColor());
    }
}