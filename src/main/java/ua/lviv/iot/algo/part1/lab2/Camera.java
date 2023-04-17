package ua.lviv.iot.algo.part1.lab2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.lang.reflect.Field;

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
    public String getHeaders() {
        return HEADERS;
    }
    public String getHeadersSmarty() {
        Class<? extends Camera> clazz =  this.getClass();
        try {
            Field fields[] = clazz.getFields();
            String result = new String();
            for(var field: fields)
            {
                result += field.getName();
            }
            return result;
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            return null;
        }
    }
    public String toCSV(){
        return model + ", " + brand + ", " + lens;
    }
}
