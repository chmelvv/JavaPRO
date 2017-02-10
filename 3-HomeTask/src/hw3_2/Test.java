package hw3_2;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * Created by chmel on 10.02.2017.
 */
public class Test {
    public static void main(String[] args) throws IOException {
//        Test class itself
//        TextContainer tc = new TextContainer();
//        tc.save("c:\\temp\\file.txt");

        Class<?> cls = TextContainer.class;

        Method method = null;
        Method[] methods = cls.getMethods();
        for (Method m: methods){
           // if (m.getDeclaredAnnotations() != null && m.getDeclaredAnnotations().length !=0)
                System.out.println(m.getName());
        }

        Annotation Saver = null;
        Annotation SaveTo = null;

        SaveTo saveToAnnotation = cls.getAnnotation(SaveTo.class);
        Saver saverAnnotation = cls.getMethods()[0].getAnnotation(Saver.class);

       // method.invoke(cls.newInstance(), )



    }
}
