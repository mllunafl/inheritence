/**
 * Created by LunaFlores on 11/30/16.
 */
public class Flute extends Woodwind{

    private String brand;
    private Integer num;

    public Flute(String color, Integer notes, String brand) {
        super(color, notes);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public Integer getNum() {
        return num;
    }

    @Override
    public String play() {
        return "beep";
    }

    @Override
    public String toString() {
        return "Flute{" +
                "brand='" + brand + '\'' +
                ", num=" + num +
                '}' + super.toString();
    }
}
