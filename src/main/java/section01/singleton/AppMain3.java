package section01.singleton;

import java.io.*;
import java.lang.reflect.InvocationTargetException;

import static java.lang.System.out;

public class AppMain3 {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        //직렬화 & 역직렬화 사용하기
        SettingsV6 settings1 = SettingsV6.getInstance();
        SettingsV6 settings2 = null;

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("settings.obj"))) {
            out.writeObject(settings1);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInput in = new ObjectInputStream(new FileInputStream("settings.obj"))) {
            settings2 = (SettingsV6) in.readObject();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        System.out.println(settings1 == settings2);

    }
}
