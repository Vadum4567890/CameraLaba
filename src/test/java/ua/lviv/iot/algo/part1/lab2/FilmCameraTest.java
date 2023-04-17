package ua.lviv.iot.algo.part1.lab2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilmCameraTest {

    @Test
    void testSetFilmISO() {
        var filmcamera = new FilmCamera("7", "GoPro", "UltraHD", "sd",232123);
        filmcamera.setFilmISO(232612);
        assertEquals(232612,filmcamera.getFilmISO());
    }

    @Test
    void testSetFilmType() {
        var filmcamera = new FilmCamera("7", "GoPro", "UltraHD", "sd",232123);
        filmcamera.setFilmType("HD");
        assertEquals("HD",filmcamera.getFilmType());
    }

    @Test
    void testGetFilmType(){
        var filmcamera = new FilmCamera("7", "GoPro", "UltraHD", "sd",232123);
        assertEquals("sd", filmcamera.getFilmType());
    }

    @Test
    void testGetFilmISO(){
        var filmcamera = new FilmCamera("7", "GoPro", "UltraHD", "sd",232123);
        assertNotEquals(2321412,filmcamera.getFilmISO());
    }

    @Test
    void takePhoto() {
        var filmcamera = new FilmCamera("7", "GoPro", "UltraHD", "sd",232123);
        String result = "FilmType: " + filmcamera.getFilmType()+ "\n" + "FilmISO: " + filmcamera.getFilmISO() + "\n";
        assertEquals(result, filmcamera.takePhoto());
    }

}