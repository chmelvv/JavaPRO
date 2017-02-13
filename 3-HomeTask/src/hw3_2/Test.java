package hw3_2;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args) throws IOException, IllegalAccessException, InstantiationException, InvocationTargetException {

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
