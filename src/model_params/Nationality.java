package model_params;

import javax.print.attribute.standard.MediaSize;

public enum Nationality {
	ISRAEL("ישראלי"),
	PALESTINIAN("פלסטיני");

	String value;

	Nationality(String value){
		this.value = value;
	}

	public String toString(){return value;}
}
