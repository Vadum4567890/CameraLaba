package ua.lviv.iot.algo.part1.lab2;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)
public class FilmCamera extends Camera {
    public  static final String HEADERS =", filmType, filmISO\n";
    private String filmType;
    private int filmISO;
    public FilmCamera(final String model, final String brand, final String lens,
                      final String filmType, final int filmISO) {
        super(model, brand, lens);
        this.filmType = filmType;
        this.filmISO = filmISO;
    }

    public String getHeaders(){
        return super.getHeaders()
                + HEADERS;
    }
    public String toCSV(){
        return super.toCSV()
                + ", " + filmType
                + ", " + filmISO
                + "\n";
    }

    @Override
    public final String takePhoto() {
        return "FilmType: " + this.filmType
                + "\n" + "FilmISO: " + this.filmISO + "\n";
    }
}
