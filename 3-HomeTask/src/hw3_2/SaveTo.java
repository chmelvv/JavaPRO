package hw3_2;

/**
 * Created by chmel on 07.02.2017.
 */

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value= ElementType.TYPE)
@Retention(value= RetentionPolicy.RUNTIME)
//Only with RUNTIME
//@Retention(value= RetentionPolicy.RUNTIME)
//you can read annotation via reflection, SOURCE and CLASS - do not fit ;(\
// see comments in java sources
public @interface SaveTo {
    String path();
}
