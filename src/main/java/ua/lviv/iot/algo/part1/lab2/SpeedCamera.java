package ua.lviv.iot.algo.part1.lab2;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)
public class SpeedCamera extends Camera {
    public  static final String HEADERS =", maxSpeedDetection, price\n";
    private double maxSpeedDetection;
    private double price;
    public SpeedCamera(final String model, final String brand,
                       final String lens, final double maxSpeedDetection,
                       final double price) {
        super(model, brand, lens);
        this.maxSpeedDetection = maxSpeedDetection;
        this.price = price;
    }

    public String getHeaders(){
        return super.getHeaders()
                + HEADERS;
    }
    public String toCSV(){
        return super.toCSV()
                + ", " + maxSpeedDetection
                + ", " + price
                + "\n";
    }

    @Override
    public final String takePhoto() {
        return "Max speed Detection: "
                + this.maxSpeedDetection
                + "\nFine Price: "
                + this.price + "\n";
    }
}
