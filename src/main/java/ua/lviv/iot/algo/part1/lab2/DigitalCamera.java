package ua.lviv.iot.algo.part1.lab2;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)
public class DigitalCamera extends Camera{
    private String resolution;
    private double zoom;
    private String memoryCardType;
    private int photosCount;
    public DigitalCamera(String model,String brand, String lens, String resolution, double zoom, String memoryCardType, int photosCount) {
        super(model, brand, lens);
        this.resolution = resolution;
        this.zoom = zoom;
        this.memoryCardType = memoryCardType;
        this.photosCount = photosCount;
    }
    public void resetZoom() {
        this.zoom = 1;
    }
    public void eraseMemory() {
        this.photosCount = 0;
    }

    public void changeSettings(String resolution, double zoom) {
        this.resolution = resolution;
        this.zoom = zoom;
    }
    @Override
    public String takePhoto() {
        return "Camera resolution: " + this.resolution + "\nCamera zoom: " + this.zoom + "\n";
    }
}
