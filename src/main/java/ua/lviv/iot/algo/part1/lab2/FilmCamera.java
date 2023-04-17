package ua.lviv.iot.algo.part1.lab2;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)
public class FilmCamera extends Camera {
    private String filmType;
    private int filmISO;
    public FilmCamera(final String model, final String brand, final String lens,
                      final String filmType, final int filmISO) {
        super(model, brand, lens);
        this.filmType = filmType;
        this.filmISO = filmISO;
    }
    @Override
    public final String takePhoto() {
        return "FilmType: " + this.filmType
                + "\n" + "FilmISO: " + this.filmISO + "\n";
    }
}
