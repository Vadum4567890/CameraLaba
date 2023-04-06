package ua.lviv.iot.algo.part1.lab2;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString(callSuper = true)
public class SpeedCamera extends Camera {
    private double maxSpeedDetection;
    private double price;
    public SpeedCamera(String model,String brand, String lens, double maxSpeedDetection, double price){
        super(model,brand,lens);
        this.maxSpeedDetection = maxSpeedDetection;
        this.price = price;
    }

    @Override
    public String takePhoto() {
        return "Max speed Detection: " + maxSpeedDetection + "\nFine Price: " + price + "\n";
    }
}
