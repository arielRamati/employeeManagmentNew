package model_params;

public enum PaymentType {

	PAYMENT("תשלום"),
	LOAN("הלוואה"),
	VENDOR_PAYMENT("תשלום לספק"),
	ADVANCE_PAYMENT("מקדמה"),
	OTHER("אחר");
	
	private String value;
	
	private PaymentType(String value) {
		this.value = value;
	}

	public String toString(){
		return value;
	}
	
}
