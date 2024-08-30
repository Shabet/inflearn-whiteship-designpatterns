package section01.singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class AppMain6 {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, IOException, ClassNotFoundException {

        //리플렉션을 사용하여 싱글톤 패턴을 깨뜨리기 -> ENUM 때문에 안됨.
        SettingsV8 settings1 = SettingsV8.INSTANCE;

        SettingsV8 settings2 = null;
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("settings.obj"))) {
            out.writeObject(settings1);
        }


        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("settings.obj"))) {
            settings2 = (SettingsV8) in.readObject();
        }

        System.out.println(settings1 == settings2);


    }
}
