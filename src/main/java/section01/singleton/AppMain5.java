package section01.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class AppMain5 {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        //리플렉션을 사용하여 싱글톤 패턴을 깨뜨리기 -> ENUM 때문에 안됨.
        SettingsV8 settings1 = SettingsV8.INSTANCE;

        SettingsV8 settings2 = null;
        Constructor<?>[] constructors = SettingsV8.class.getDeclaredConstructors();
        for (Constructor<?> constructor : constructors) {
            constructor.setAccessible(true);
            settings2 = (SettingsV8) constructor.newInstance("INSTANCE");
        }

        System.out.println(settings1 == settings2);
    }
}
