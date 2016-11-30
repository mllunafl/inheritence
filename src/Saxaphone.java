/**
 * Created by LunaFlores on 11/30/16.
 */
public class Saxaphone extends Woodwind{
    private String brand;
    private Integer num;

    public Saxaphone(String color, Integer notes, String brand) {
        super(color, notes);
        this.brand = brand;
    }

    @Override
    public String play() {
        return "toot";
    }

    public String getBrand() {
        return brand;
    }

    public Integer getNum() {
        return num;
    }

    @Override
    public String toString() {
        return "Saxaphone{" +
                "brand='" + brand + '\'' +
                ", num=" + num +
                '}' + super.toString();
    }
}
