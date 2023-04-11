package ua.lviv.iot.algo.part1.lab2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public abstract class Camera {
    private String model; // Camera model
    private String brand; // Camera brand
    private String lens;  // Camera lens
    public abstract String takePhoto();  // Take photo
}
