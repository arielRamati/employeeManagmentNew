package model_params.copy;

public enum EmployeeType {

	ELECTRICIAN("חשמלאי"),
	BUILDER("בנאי"),
	FLOOR_MAN("רצף"),
	PLASTERER("טייח"),
	REGULAR("פועל"),
	PAINTER("צבעי"),
	METALWORKER("מסגר"),
	PLUMBER("אינסטלטור"),
	ROOFMAN("גגן"),
	ALUMINUM("איש אלומיניום"),
	TRACTOR("טרקטור"),
	SEAL("איטום"),
	CLEANER("נקיון"),
	LAND_DEVELOPMENT("פיתוח"),
	AIR_CONDITIONING("מיזוג"),
	WOODMAN("נגר"),
	GARDEN("גנן"),
	GUARD("שומר"),
	FOREMAN("מנהל עבודה"),
	DRIVER("הסעות");
	
	
	
	String value;
	
	private EmployeeType(String value) {
		this.value = value;
	}
	
}
