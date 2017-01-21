package db;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import java.util.Map;

import Controller.TableNames;

public class Db {
	
	static final String FILE_LOCATION = "";

	public static void createDataBase(){
		
	}
	
	//the map is by-table name + values to save- ordered by argument name and its value
	public static boolean saveData(Map<TableNames, Map<String, Object>> map) throws IOException{
		
		boolean returnVal = true;
		
		for(TableNames tableName: map.keySet()){
			String fileLocation = FILE_LOCATION + tableName;
			File dataXml = new File(fileLocation);
			//if the file exists- can save the data in it o/w try to create a new file- if success save the data
			if (dataXml.exists() || dataXml.createNewFile()){
				returnVal = insertDataToFile(tableName, dataXml, map.get(tableName));	
			}
			else{
				returnVal = false;
			}
		}
		//could not find the file or create a new one- return false
		return returnVal;
	}
	
	private static boolean insertDataToFile(TableNames tableName, File file, Map<String, Object> map){
		//TODO xml write
		//need to create xml for each table in the sql
		switch (tableName){
		case EMPLOYEE_TABLE:
			saveEmployeeTable(map);
			
		}
		
		return true;
	}
	
	private static boolean saveEmployeeTable(Map<String, Object> map) {
		//i can cast to employee
		return false;
	}
}
