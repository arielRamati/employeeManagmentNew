package Controller;

import java.io.IOException;
import java.util.Map;

import db.Db;

public class DbController {

	public DbController() {
//		Db.createDataBase();
	}
	
	public String getStringFromDB() {
		return "";
	}
	
	public static boolean saveData(Map<TableNames,Map<String, Object>> map){
		//TODO save the data in the data base
		//need to think how to know where to save it and how to find it
		Boolean saveResult = null;
		try {
			saveResult = Db.saveData(map);
		} catch (Exception e) {
			//catch every excption that happend durring the save and set the return value to false.
			//TODO- check how to return the error message to the user.
			saveResult = false;
		}
		return saveResult;
	}
}
