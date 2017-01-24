import java.lang.reflect.*;

/**
 * Created by chmel on 24.01.2017.
 */
public class TestClass {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        PrivateClass pc = new PrivateClass();
       // System.out.println(pc.str); //error because of private modifier

        Class<?> cls = PrivateClass.class;

        Field field = cls.getDeclaredField("i");
        field.setAccessible(true);
        field.setInt(pc, 5);
        System.out.println( pc.getI() );

    }
}
