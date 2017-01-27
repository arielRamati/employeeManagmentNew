package model.exception;

/**
 * Created by Ariel Ramati
 */
public class CanNotCreateObjectException extends Exception {
    String objectType;

    public CanNotCreateObjectException(String objectType){
        this.objectType = objectType;
    }

    public String getObjectType(){
        return objectType;
    }
}
