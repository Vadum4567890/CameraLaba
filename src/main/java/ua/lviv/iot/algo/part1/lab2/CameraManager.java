package ua.lviv.iot.algo.part1.lab2;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class CameraManager {
    private final static List<Camera> cameras= new ArrayList<>();
    public static void main(String[] args) {

        addCamera(new DigitalCamera("XR", "Canon", "Nu", "1920x1080", 0,"Sap", 10));
        addCamera(new DigitalCamera("XP", "Canon", "Nu", "1920x1080", 2,"SGA", 20));
        addCamera(new FilmCamera("Carsa", "Sony", "Soft", "New",124231));
        addCamera(new FilmCamera("7", "GoPro", "UltraHD", "sd",232123));
        addCamera(new SpeedCamera("XS", "Axis", "Super",220,2000));
        addCamera(new SpeedCamera("DH", "Dahua", "Super",240,2500));
        addCamera(new HybridCamera("GV", "GHD", "Ultra", "4k","White"));
        addCamera(new HybridCamera("GV", "GHD", "Ultra", "4k","Black"));

        for(var camera : cameras)
        {
            System.out.println(camera);
            System.out.println(camera.takePhoto());
        }

        findAllWithSameBrand("Canon").forEach(System.out::println);
        findAllWithSameModel("XP").forEach(System.out::println);
    }

    public static void addCamera(final Camera camera) {
        cameras.add(camera);
    }
    public static List<Camera> findAllWithSameModel(String model) {
        System.out.println("\nCameras with the model:  " + model + ":");
        var searched = cameras.stream().filter(v -> (Objects.equals(v.getModel(), model))).collect(Collectors.toList());
        return searched;
    }

    public static List<Camera> findAllWithSameBrand(String brand) {
        System.out.println("Cameras with the brand " + brand + ":");
        var searched = cameras.stream().filter(v -> (Objects.equals(v.getBrand(), brand))).collect(Collectors.toList());
        return searched;
    }
    public List<Camera> getAll(){
        return cameras;
    }
}
