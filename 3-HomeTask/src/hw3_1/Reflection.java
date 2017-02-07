package hw3_1;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Reflection {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Class<?> cls = Main.class;
        Method method = cls.getMethods()[0];

        Test testAnnotation = method.getAnnotation(Test.class);

        method.invoke(cls.newInstance(), testAnnotation.a(),testAnnotation.b());
    }
}
