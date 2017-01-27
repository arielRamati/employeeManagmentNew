package Controller;

import java.io.IOException;
import java.util.Map;

import db.Db;
import model.TableElement;

public class DbController {

	public DbController() {
//		Db.createDataBase();
	}
	
	public String getStringFromDB() {
		return "";
	}
	
	public static boolean saveData(TableElement tableElement){
		//TODO save the data in the data base
		//need to think how to know where to save it and how to find it
		Boolean saveResult = null;
		try {
			saveResult = Db.saveData(tableElement);
		} catch (Exception e) {
			//catch every excption that happend durring the save and set the return value to false.
			//TODO- check how to return the error message to the user.
			saveResult = false;
		}
		return saveResult;
	}

	public static boolean findClient(String clientName){
		return Db.getInstance().findClient(clientName);
	}
}
