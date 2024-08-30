package section01.singleton;

public class SettingsV4 {
    private static volatile SettingsV4 instance;

    private SettingsV4() {
    }

    public static SettingsV4 getInstance() {
        if (instance == null) {
            synchronized (SettingsV4.class) {
                if (instance == null) {
                    instance = new SettingsV4();
                }
            }
        }

        return instance;
    }
}
