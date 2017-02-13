package hw3_2;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by chmel on 10.02.2017.
 */
public class Test {
    public static void main(String[] args) throws IOException, IllegalAccessException, InstantiationException, InvocationTargetException {
       // Test class itself
//        TextContainer tc = new TextContainer();
//        tc.save("c:\\temp\\file.txt");

        Class<?> cls = TextContainer.class;

        Method method = null;
        //Try to find "saver"
        for (Method m: cls.getMethods()){
            if (m.getAnnotation(Saver.class) != null) {
                method = m;
            }
        }

        SaveTo saveToAnnotation = cls.getAnnotation(SaveTo.class);
        method.invoke(cls.newInstance(), saveToAnnotation.path());

    }
}
