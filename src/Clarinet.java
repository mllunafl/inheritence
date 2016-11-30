import com.sun.org.apache.xpath.internal.operations.Bool;

/**
 * Created by LunaFlores on 11/30/16.
 */
public class Clarinet  extends Woodwind{
    private String brand;
    private Integer num;

    public Clarinet(String color, Integer notes, String brand) {
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
        return "blow";
    }

    @Override
    public String toString() {
        return "Clarinet{" +
                "brand='" + brand + '\'' +
                ", num=" + num +
                '}' + super.toString();
    }
}
