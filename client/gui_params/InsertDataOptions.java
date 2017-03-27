package gui_params;

public enum InsertDataOptions {

	ADD_EMPLOYEE("הוסף עובד"),
	ADD_SUPPLIER("הוסף ספק"),
	ADD_PROJECT("הוספת פרוייקט"),
	ENTER_WORKING_HOURS("הזנת שעות עבודה"),
	ENTER_FEE("הכנס תשלום");
	
	private String value;
	
	private InsertDataOptions(String value) {
		this.value = value;
	}
	
	public String toString(){
		return value;
	}
}
