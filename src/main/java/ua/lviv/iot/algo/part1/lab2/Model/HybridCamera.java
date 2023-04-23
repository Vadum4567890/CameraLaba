package ua.lviv.iot.algo.part1.lab2.Model;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import ua.lviv.iot.algo.part1.lab2.Model.Camera;

@Getter
@Setter
@ToString(callSuper = true)
public class HybridCamera extends Camera {
    public  static final String HEADERS = ", resolution, color\n";
    private String resolution;
    private String color;
    public HybridCamera(final String model, final String brand,
                        final String lens, final String resolution,
                        final String color) {
        super(model, brand, lens);
        this.resolution = resolution;
        this.color = color;
    }

    /**
     *
     * @return HEADERS
     */
    public String getHeaders() {
        return super.getHeaders()
                + HEADERS;
    }

    /**
     *
     * @return toCSV
     */
    public String toCSV() {
        return super.toCSV()
                + ", " + resolution
                + ", " + color
                + "\n";
    }

    @Override
    public final String takePhoto() {
        return "Camera resolution: "
                + this.resolution
                + "\nCamera color: "
                + this.color + "\n";
    }
}
