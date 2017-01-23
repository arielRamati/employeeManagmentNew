package model;

import model_params.PhoneNumber;

public class Supplier {

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
