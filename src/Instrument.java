/**
 * Created by LunaFlores on 11/30/16.
 */
public abstract class Instrument {
    private String type;
    private String color;

    public Instrument (String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public abstract String play();

    @Override
    public String toString() {
        return "Instrument{" +
                "type='" + type + '\'' +
                ", color='" + color + '\'' +
                '}'+ super.toString();
    }
}
