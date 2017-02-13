package hw3_3;

import java.io.Closeable;
import java.io.IOException;

/**
 * Class to be fully saved/restored from file
 */
public class DataClass implements Closeable{
    @Save
    private String text;
    @Save
    private  Double number;

    public DataClass(String text, Double number) {
        this.text = text;
        this.number = number;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Double getNumber() {
        return number;
    }

    public void setNumber(Double number) {
        this.number = number;
    }

    @Override
    public void close() throws IOException {

    }
}
