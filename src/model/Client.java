package model;

import model_params.PhoneNumber;

/**
 * Created by Ariel Ramati
 */
public class Client {

    private String firstName;
    private String lastname;
    private String address;
    private PhoneNumber phoneNumber;

    public Client(String firstName, String lastname, String address, PhoneNumber phoneNumber) {
        this.firstName = firstName;
        this.lastname = lastname;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(PhoneNumber phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
