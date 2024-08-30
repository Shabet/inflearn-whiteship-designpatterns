package section01.singleton;

public class SettingsV2 {
    private static SettingsV2 instance;

    private SettingsV2() {}

    public static synchronized SettingsV2 getInstance() {
        if (instance == null) {
            instance = new SettingsV2();
        }

        return instance;
    }
}
