package model_params;

/**
 * Created by Ariel Ramati
 */
public enum ProjectType {
    BUILDING("בניה"),
    SHIPUTZ("שיפוץ"),
    HARHAVA("הרחבה"),
    PITUACH("פיתוח"),
    TASHTIT("תשתיות");

    String value;

    ProjectType(String value) {
        this.value = value;
    }

    public String toString(){
        return value;
    }
}

