package ua.lviv.iot.algo.part1.lab2;

import org.junit.jupiter.api.Test;
import ua.lviv.iot.algo.part1.lab2.DigitalCamera;

import static org.junit.jupiter.api.Assertions.*;

class DigitalCameraTest {

    @Test
    void notNullPhotosCount(){
        var digital = new DigitalCamera("XR", "Canon", "Nu", "1920x1080", 0,"Sap", 10);
        assertNotEquals(0, digital.getPhotosCount());
    }
    @Test
    void setPhotos(){
        var digital = new DigitalCamera("XR", "Canon", "Nu", "1920x1080", 0,"Sap", 10);
        digital.setPhotosCount(200);
        assertEquals(200, digital.getPhotosCount());
    }
    @Test
    void getResolution(){
        var digital = new DigitalCamera("XR", "Canon", "Nu", "1920x1080", 0,"Sap", 10);
        assertEquals("1920x1080", digital.getResolution());
    }
    @Test
    void testGetZoom(){
        var digital = new DigitalCamera("XR", "Canon", "Nu", "1920x1080", 0,"Sap", 10);
        assertEquals(0, digital.getZoom());
    }
    @Test
    void setMemoryCardType(){
        var digital = new DigitalCamera("XR", "Canon", "Nu", "1920x1080", 0,"Sap", 10);
        digital.setMemoryCardType("america");
        assertEquals("america", digital.getMemoryCardType());
    }
    @Test
    void testResetZoom() {
        var digital = new DigitalCamera("XR", "Canon", "Nu", "1920x1080", 0,"Sap", 10);
        digital.resetZoom();
        assertEquals(1,digital.getZoom());
    }

    @Test
    void eraseMemory() {
        var digital = new DigitalCamera("XR", "Canon", "Nu", "1920x1080", 0,"Sap", 10);
        digital.eraseMemory();
        assertEquals(0, digital.getPhotosCount());
    }

    @Test
    void changeSettings() {
        var digital = new DigitalCamera("XR", "Canon", "Nu", "1920x1080", 0,"Sap", 10);
        digital.changeSettings("1024x720",2);
        assertEquals("1024x720",digital.getResolution());
        assertEquals(2,digital.getZoom());
    }

    @Test
    void notNewCamera() {
        var digital = new DigitalCamera("XR", "Canon", "Nu", "1920x1080", 0,"Sap", 10);
        assertNotEquals(0,digital.getPhotosCount());
    }



    @Test
    void testGetMemoryCardType() {
            var digital = new DigitalCamera("XR", "Canon", "Nu", "1920x1080", 0,"Sap", 10);
            assertEquals("Sap",digital.getMemoryCardType());
    }



    @Test
    void testSetResolution() {
        var digital = new DigitalCamera("XR", "Canon", "Nu", "1920x1080", 0,"Sap", 10);
        digital.setResolution("4024x2040");
        assertNotEquals("1920x1080",digital.getResolution());
    }

    @Test
    void setZoom() {
        var digital = new DigitalCamera("XR", "Canon", "Nu", "1920x1080", 0,"Sap", 10);
        digital.setZoom(2);
        assertEquals(2,digital.getZoom());
    }
}