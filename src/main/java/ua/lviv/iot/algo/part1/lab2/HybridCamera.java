package ua.lviv.iot.algo.part1.lab2;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)
public class HybridCamera extends Camera {
    private String resolution;
    private String color;
    public HybridCamera(final String model, final String brand,
                        final String lens, final String resolution,
                        final String color) {
        super(model, brand, lens);
        this.resolution = resolution;
        this.color = color;
    }
    @Override
    public final String takePhoto() {
        return "Camera resolution: "
                + this.resolution
                + "\nCamera color: "
                + this.color + "\n";
    }
}
