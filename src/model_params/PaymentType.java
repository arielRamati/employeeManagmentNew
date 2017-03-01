package model_params;

/**
 * Created by Ariel Ramati
 */

public enum PaymentType {

	PAYMENT("תשלום משכורת"),
	LOAN("הלוואה"),
	VENDOR_PAYMENT("תשלום לספק"),
	ADVANCE_PAYMENT("מקדמה"),
	OTHER("אחר");
	
	private String value;
	
	PaymentType(String value) {
		this.value = value;
	}

	public String toString(){
		return value;
	}
	
}
