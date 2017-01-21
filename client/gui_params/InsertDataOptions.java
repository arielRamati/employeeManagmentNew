package gui_params;

import new_data_dialogs_and_panels.AddEmployeeDialog;
import new_data_dialogs_and_panels.AddNewProjectDialog;
import new_data_dialogs_and_panels.AddSuplierDialog;
import new_data_dialogs_and_panels.NewDataAbstractDialog;
import new_data_dialogs_and_panels.addPaymentDialog;
import new_data_dialogs_and_panels.addWorkingHoursDialog;

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
