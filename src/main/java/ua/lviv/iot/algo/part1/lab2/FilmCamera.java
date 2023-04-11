package ua.lviv.iot.algo.part1.lab2;
import lombok.*;

@Getter
@Setter
@ToString(callSuper = true)
public class FilmCamera extends Camera{
    private String filmType;
    private int filmISO;
    public FilmCamera(String model,String brand, String lens, String filmType, int filmISO) {
        super(model, brand, lens);
        this.filmType = filmType;
        this.filmISO = filmISO;
    }
    @Override
    public String takePhoto() {
        return "FilmType: " + this.filmType + "\n" + "FilmISO: " + this.filmISO + "\n";
    }
}
