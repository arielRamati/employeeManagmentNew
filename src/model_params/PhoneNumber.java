package model_params;

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
	
	public PhoneNumber(String phoneNumber) throws Exception{
		this.setPhoneNumber(phoneNumber);
	}
	
	public String getKidomet(){return kidomet;}
	
	public void setKidomet(String newKidomet) throws Exception {
		if (newKidomet.length() > 3 || newKidomet.length() < 2){
			throw new Exception("this kidomet length is wrong");
		}
		kidomet = newKidomet;
	}
	
	public String getNumber(){return number;}
	
	public void setNumber(String number) throws Exception {
		if (number.length() != 7){
			throw new Exception("wrong number length");
		}
		this.number = number; 
	}
	
	public String getPhoneNumer(){return kidomet+"-"+number;}
	
	public void setPhoneNumber(String phoneNumber) throws Exception{
		String[] splittednumer = phoneNumber.split("-");
		if (splittednumer.length>2){
			throw new Exception("wrong number");
		}
		setKidomet(splittednumer[0]);
		setNumber(splittednumer[1]);
		
	}
}
