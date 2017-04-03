package gui_params;

public enum InsertDataOptions {

	ADD_EMPLOYEE("הוסף עובד"),
	ADD_SUPPLIER("הוסף ספק"),
	ADD_PROJECT("הוספת פרוייקט"),
	ENTER_WORKING_HOURS("הזנת שעות עבודה"),
	ADD_SUB_PROJECT("הוספת פרוייקט משנה"),
	ADD_INCOME("הוסף הכנסה"),
	DEFINE_SALARY("הגדר משכורת לעובד"),
	ENTER_FEE("הכנס תשלום");
	
	private String value;
	
	private InsertDataOptions(String value) {
		this.value = value;
	}
	
	public String toString(){
		return value;
	}
}
