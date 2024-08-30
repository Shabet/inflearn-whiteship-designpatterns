package section01.singleton;

public enum SettingsV8  {

    INSTANCE;

    SettingsV8() {

    }

    private Integer number;

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}
