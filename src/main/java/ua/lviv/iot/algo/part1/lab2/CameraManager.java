package ua.lviv.iot.algo.part1.lab2;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public final class CameraManager {
    private static final List<Camera> CAMERA_LIST = new ArrayList<>();
    public static void main(final String[] args) {
        final int photosCount = 10;
        final int photosCount2 = 20;
        final int filmISO = 124231;
        final int filmISO2 = 232123;
        final int speedDetection = 220;
        final int price = 2000;
        final int speedLimit21 = 240;
        final int speedLimit22 = 2500;

        addCamera(new DigitalCamera("XR", "Canon", "Nu",
                "1920", 0, "S", photosCount));
        addCamera(new DigitalCamera("XP", "Canon", "Nu",
                "1920", 2, "S", photosCount2));
        addCamera(new FilmCamera("Carma", "Sony", "Soft",
                "New", filmISO));
        addCamera(new FilmCamera("7", "GoPro", "UltraHD",
                "sd", filmISO2));
        addCamera(new SpeedCamera("XS", "Axis", "Super",
                speedDetection, price));
        addCamera(new SpeedCamera("DH", "Petya", "Super",
                speedLimit21, speedLimit22));
        addCamera(new HybridCamera("GV", "GHD", "Ultra",
                "4k", "White"));
        addCamera(new HybridCamera("GV", "GHD", "Ultra",
                "4k", "Black"));

        for (var camera : CAMERA_LIST) {
            System.out.println(camera);
            System.out.println(camera.takePhoto());
        }

        findAllWithSameBrand("Canon").forEach(System.out::println);
        findAllWithSameModel("XP").forEach(System.out::println);
    }

    public static void addCamera(final Camera camera) {
        CAMERA_LIST.add(camera);
    }
    public static List<Camera> findAllWithSameModel(final String model) {
        System.out.println("\nCameras with the model:  " + model + ":");
        return CAMERA_LIST.stream()
                          .filter(v -> Objects.equals(v.getModel(), model))
                          .collect(Collectors.toList());
    }

    public static List<Camera> findAllWithSameBrand(final String brand) {
        System.out.println("Cameras with the brand " + brand + ":");
        return CAMERA_LIST.stream()
                          .filter(v -> Objects.equals(v.getBrand(), brand))
                          .collect(Collectors.toList());
    }

    public static List<Camera> getAll() {
        return CAMERA_LIST;
    }
}
