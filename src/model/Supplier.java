package model;

import model_params.PhoneNumber;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Supplier {

    @Id
    @GenericGenerator(name="generate" , strategy="increment")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int serialNumber;
	private String firstName;
	private String lastName;
	private String address;
	private PhoneNumber phoneNumber;

	public Supplier(String firstName, String lastName, String adress, PhoneNumber phoneNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = adress;
		this.phoneNumber = phoneNumber;
	}

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setPhoneNumber(PhoneNumber phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getAddress() {
		return address;
	}

	public PhoneNumber getPhoneNumber() {
		return phoneNumber;
	}

}
