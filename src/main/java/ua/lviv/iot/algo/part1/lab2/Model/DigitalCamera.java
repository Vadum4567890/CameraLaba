package ua.lviv.iot.algo.part1.lab2.Model;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import ua.lviv.iot.algo.part1.lab2.Model.Camera;

@Getter
@Setter
@ToString(callSuper = true)
public final class DigitalCamera extends Camera {
    public  static final String HEADERS = ", resolution, zoom, "
                                        + "memoryCardType, photosCount";
    private String resolution;
    private double zoom;
    private String memoryCardType;
    private int photosCount;
    public DigitalCamera(final String model, final String brand,
                         final String lens, final String resolution,
                         final double zoom, final String memoryCardType,
                         final int photosCount) {
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

    public void changeSettings(final String resolution,
                                     final double zoom) {
        this.resolution = resolution;
        this.zoom = zoom;
    }

    public String getHeaders() {
        return super.getHeaders()
                + HEADERS
                + "\n";
    }
    public String toCSV() {
        return super.toCSV()
                + ", " + resolution
                + ", " + zoom
                + ", " + memoryCardType
                + "\n";

    }

    @Override
    public String takePhoto() {
        return "Camera resolution: "
                + this.resolution
                + "\nCamera zoom: "
                + this.zoom + "\n";
    }
}
