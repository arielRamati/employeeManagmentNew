package Controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import db.Db;
import model.Client;
import model.Project;
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
		boolean saveResult;
		try {
			saveResult = Db.getInstance().saveData(tableElement);
		} catch (Exception e) {
			//catch every excption that happend durring the save and set the return value to false.
			//TODO- check how to return the error message to the user.
			saveResult = false;
		}
		return saveResult;
	}

	public static List<Client> getAllClients (){
		return Db.getInstance().getAllObjectsFromDB(Client.class);
	}

	public static List<Project> getAllProjects() {return Db.getInstance().getAllObjectsFromDB(Project.class);}
}
