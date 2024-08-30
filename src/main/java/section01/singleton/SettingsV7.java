package section01.singleton;

import java.io.Serializable;

public class SettingsV7 implements Serializable {
    private SettingsV7() {
    }

    private static class SettingsHolder {
        private static final SettingsV7 INSTANCE = new SettingsV7();
    }

    public static SettingsV7 getInstance() {
        return SettingsHolder.INSTANCE;
    }

    //역직렬화 대응 방안
    protected Object readResolve() {
        return getInstance();
    }
}
