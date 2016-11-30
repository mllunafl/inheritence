import java.time.LocalDate;

/**
 * Created by LunaFlores on 11/30/16.
 */
public class Woodwind extends Instrument {
    private LocalDate dob;
    private Integer notes;

    public Woodwind(String color, Integer notes) {
        super(color);
        this.notes = notes;
    }

    public LocalDate getDob() {
        return dob;
    }

    public Integer getNotes() {
        return notes;
    }

    @Override
    public String toString() {
        return "Woodwind{" +
                "dob=" + dob +
                ", notes=" + notes +
                '}' + super.toString();
    }
}
