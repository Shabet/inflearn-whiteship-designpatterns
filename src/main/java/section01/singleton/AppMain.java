package section01.singleton;

public class AppMain {

    public static void main(String[] args) {
        SettingsV1 instance1 = SettingsV1.getInstance();
        SettingsV1 instance2 = SettingsV1.getInstance();
        System.out.println(instance1 == instance2);

        //thread safe
        SettingsV2 instance3 = SettingsV2.getInstance();
        SettingsV2 instance4 = SettingsV2.getInstance();
        System.out.println(instance3 == instance4);

        //이른 초기화(eager initialization) 사용
        SettingsV3 instance5 = SettingsV3.getInstance();
        SettingsV3 instance6 = SettingsV3.getInstance();
        System.out.println(instance5 == instance6);

        //double checked locking 사용
        SettingsV4 instance7 = SettingsV4.getInstance();
        SettingsV4 instance8 = SettingsV4.getInstance();
        System.out.println(instance7 == instance8);

        //static innser 클래스 사용
        SettingsV5 instance9 = SettingsV5.getInstance();
        SettingsV5 instance10 = SettingsV5.getInstance();
        System.out.println(instance9 == instance10);
    }
}
