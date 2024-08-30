package section01.singleton;

import java.io.Serializable;

public class SettingsV6 implements Serializable {
    private SettingsV6() {
    }

    private static class SettingsHolder {
        private static final SettingsV6 INSTANCE = new SettingsV6();
    }

    public static SettingsV6 getInstance() {
        return SettingsHolder.INSTANCE;
    }
}
