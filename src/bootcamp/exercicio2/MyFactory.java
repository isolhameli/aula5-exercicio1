package bootcamp.exercicio2;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

public class MyFactory {
    public static Sorter getInstance(String key) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream("./MyFactory.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return (Sorter) Class.forName(properties.get(key).toString()).getConstructor().newInstance();
    }
}
