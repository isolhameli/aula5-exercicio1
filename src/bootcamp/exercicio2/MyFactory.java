package bootcamp.exercicio2;

import java.io.InputStream;
import java.util.Properties;

public class MyFactory {
    public static Object getInstance(String objName) {
        System.out.println(System.getProperties());

        return new Object();
    }
}
