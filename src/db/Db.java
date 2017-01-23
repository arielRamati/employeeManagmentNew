package db;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.util.Map;

import Controller.TableNames;
import model.Employee;
import model_params.EmployeeType;
import model_params.Nationality;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.classic.Session;

public class Db {
	
	static final String FILE_LOCATION = "";
	private static Db instance;
	private SessionFactory sessionFactory = null;

	public static void main(String[] args) {
		try {
			Employee employee = new Employee(1, "Moshe", "Aloni", "3034034342", new Date(1495488470), Nationality.ISRAEL, EmployeeType.AIR_CONDITIONING,
					"052-8913059", "Tel Aviv Dude", "Yossi The King", 250);
			Db.getInstance().addEmployee(employee);
		} catch (Exception ignore) {}
	}

	private Db() {
		sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
	}

	public static Db getInstance() {
		if (instance == null) {
			instance = new Db();
		}
		return instance;
	}

	public void addEmployee(Employee employee) {
		Session session = null;
		Transaction transaction = null;
		try
		{
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			session.save(employee);
			transaction.commit();
		} catch(HibernateException e) {
			if (transaction != null) {
				transaction.rollback();
			}
		}
		finally {
			if (session != null)
			{
				try {
					session.close();
				} catch (HibernateException e) {
					//writing log message
				}
			}
		}
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
