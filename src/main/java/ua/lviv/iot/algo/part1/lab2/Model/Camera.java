package ua.lviv.iot.algo.part1.lab2.Model;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public abstract class Camera {
    public  static final String HEADERS = "model, brand, lens";
    private String model; // Camera model
    private String brand; // Camera brand
    private String lens;  // Camera lens
    public abstract String takePhoto();  // Take photo

    /**
     * @return HEADERS
     */
    public String getHeaders() {
        return HEADERS;
    }

    /**
     * @return toCSV
     */
    public String toCSV() {
        return model + ", " + brand + ", " + lens;
    }
}
