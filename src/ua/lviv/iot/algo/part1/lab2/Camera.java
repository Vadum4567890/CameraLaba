package ua.lviv.iot.algo.part1.lab2;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public abstract class Camera {
    private String model;
    private String brand;
    private String lens;
    public abstract String takePhoto();


}