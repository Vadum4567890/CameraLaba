package ua.lviv.iot.algo.part1.lab2;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class CameraManager {
    private final static List<Camera> cameraList = new ArrayList<>();
    public static void main(String[] args) {
        addCamera(new DigitalCamera("XR", "Canon", "Nu", "1920x1080", 0, "Sap", 10));
        addCamera(new DigitalCamera("XP", "Canon", "Nu", "1920x1080", 2, "SGA", 20));
        addCamera(new FilmCamera("Carma", "Sony", "Soft", "New", 124231));
        addCamera(new FilmCamera("7", "GoPro", "UltraHD", "sd", 232123));
        addCamera(new SpeedCamera("XS", "Axis", "Super", 220, 2000));
        addCamera(new SpeedCamera("DH", "Petya", "Super", 240, 2500));
        addCamera(new HybridCamera("GV", "GHD", "Ultra", "4k", "White"));
        addCamera(new HybridCamera("GV", "GHD", "Ultra", "4k", "Black"));

        for(var camera : cameraList)
        {
            System.out.println(camera);

            System.out.println(camera.takePhoto());
        }

        findAllWithSameBrand("Canon").forEach(System.out::println);
        findAllWithSameModel("XP").forEach(System.out::println);
    }

    public static void addCamera(final Camera camera) {
        cameraList.add(camera);
    }
    public static List<Camera> findAllWithSameModel(final String model) {
        System.out.println("\nCameras with the model:  " + model + ":");
        return cameraList.stream().filter(v -> Objects.equals(v.getModel(), model)).collect(Collectors.toList());
    }

    public static List<Camera> findAllWithSameBrand(final String brand) {
        System.out.println("Cameras with the brand " + brand + ":");
        return cameraList.stream().filter(v -> Objects.equals(v.getBrand(), brand)).collect(Collectors.toList());
    }
    public List<Camera> getAll() {
        List<Camera> cameraList = new ArrayList<>();
        for (Camera camera : cameraList) {
            cameraList.add(camera);
        }
        return cameraList;
    }
}
