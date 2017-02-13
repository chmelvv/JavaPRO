package hw3_3;

/**
 * Class to be partially saved/restored from file
 */
public class DataClassPartial {
    @Save
    private String text;
    private  Integer number;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}
