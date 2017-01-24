package model_params;

/**
 * Created by Kobi on 1/24/2017.
 */
public enum SalaryType {
    GLOBAL("גלובלי"),
    MONTHLY("חודשי"),
    DAILY("יומי"),
    PER_HOUR("שעתי");

    private String value;

    SalaryType(String value) {
        this.value = value;
    }

    public String toString(){
        return value;
    }
}
