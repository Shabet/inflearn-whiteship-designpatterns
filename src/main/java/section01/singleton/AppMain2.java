package section01.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class AppMain2 {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        //리플렉션을 사용하여 싱글톤 패턴을 깨뜨리기
        SettingsV5 settings1 = SettingsV5.getInstance();

        Constructor<SettingsV5> constructor = SettingsV5.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        SettingsV5 settings2 = constructor.newInstance();

        System.out.println(settings1 == settings2);
    }
}
