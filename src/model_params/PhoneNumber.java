package model_params;

import model.exception.CanNotCreateObjectException;

/**
 * Created by Ariel Ramati
 */

public class PhoneNumber {

	private String kidomet;
	private String number;
	
	public PhoneNumber() {
		kidomet= null;
		number = null;
	}
	
	public PhoneNumber(Integer kidomet, Integer number) throws Exception{
		if (kidomet>999 || number > 9999999){
			throw new Exception("wrong number");
		}
		this.kidomet = kidomet.toString();
		this.number = number.toString();
	}
	
	public PhoneNumber(String kidomet, String number) throws Exception{
		if (kidomet.length() > 3 || kidomet.length() < 2 || number.length() != 7 ){
			throw new Exception("wrong number");
		}
		this.kidomet = kidomet.toString();
		this.number = number.toString();
	}
	
	public PhoneNumber(String phoneNumber) throws CanNotCreateObjectException{
		this.setPhoneNumber(phoneNumber);
	}
	
	public String getKidomet(){return kidomet;}
	
	public void setKidomet(String newKidomet) throws CanNotCreateObjectException {
		//if wanted kidomet of out of the country? - need to remove the "if"
		if (newKidomet.length() > 3 || newKidomet.length() < 2){
			throw new CanNotCreateObjectException("Phone number -this kidomet is not legal");
		}
		kidomet = newKidomet;
	}
	
	public String getNumber(){return number;}
	
	public void setNumber(String number) throws CanNotCreateObjectException {
		if (number.length() != 7){
			throw new CanNotCreateObjectException("Phone number - number is not in the right length");
		}
		this.number = number; 
	}
	
	public String getPhoneNumer(){return kidomet+"-"+number;}
	
	public void setPhoneNumber(String phoneNumber) throws CanNotCreateObjectException{
		String[] splittednumer = phoneNumber.split("-");
		if (splittednumer.length > 2){
			throw new CanNotCreateObjectException("Phone number");
		} else if (splittednumer.length == 1){ //entered a number without "-"
			splittednumer[0] = phoneNumber.substring(0, phoneNumber.length() - 7);
			splittednumer[1] = phoneNumber.substring(phoneNumber.length() - 7);
		}
		setKidomet(splittednumer[0]);
		setNumber(splittednumer[1]);
		
	}
}
