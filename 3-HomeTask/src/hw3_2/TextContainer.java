package hw3_2;

import java.io.*;

/**
 * 2. Написать класс TextContainer, который содержит в себе строку.
 С помощью механизма аннотаций указать:
 1) в какой файл должен сохраниться текст
 2) метод, который выполнит сохранение. Написать класс Saver,
 который сохранит поле класса TextContainer в указанный файл.

 @SaveTo(path=“c:\\file.txt”)
 class Container {
 String text = “…”;
 @Saver
 public void save(..) {…}
 }
 */

@SaveTo(path="c:\\temp\\file.txt")
public class TextContainer {
    static String text = ( (Double)(Math.random()*100000) ).toString(); //to generate different string every run

    @Saver
    public void save(String fileName) throws IOException {
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName)));
        out.write(this.text);
        out.close();
    }
}