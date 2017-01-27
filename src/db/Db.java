package db;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Date;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

import Controller.TableNames;
import model.*;
import model_params.PaymentType;
import model_params.ProjectType;
import model_params.SalaryType;
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
			File pic = new File("C:\\Users\\Kobi\\Pictures\\f2fb2fcc3c9b2ada37cf02af881511b1.jpg");
			byte[] bFile = new byte[(int) pic.length()];
				FileInputStream fileInputStream = new FileInputStream(pic);
//				convert file into array of bytes
				fileInputStream.read(bFile);
				fileInputStream.close();
//				Employee employee = new Employee("Moshe", "Aloni", "3034034342", new Date(1495488470), Nationality.ISRAEL,
//						bFile, EmployeeType.AIR_CONDITIONING, "052-8913059", "Tel Aviv Dude", "Yossi The King", 250);
//			Db.getInstance().addObjToDB(employee);
//			Client client = new Client("Kobi", "Cohen", "Givatayim", "05289152554");
//			Db.getInstance().addObjToDB(employee);
//			List<Employee> employees = getInstance().getAllObjectsFromDB();
//
//			FileOutputStream fos = new FileOutputStream("C:\\Users\\Kobi\\Pictures\\test.jpg");
//			fos.write(employees.get(0).getIdImage());
//			fos.close();
			Date date = new Date(Calendar.getInstance().getTime().getTime());
			Payment payment = new Payment(PaymentType.LOAN, "Ariel Ramati", 2500, date, "אשראי", 3, bFile, "תוכנה", "אין");
			getInstance().addObjToDB(payment);

			Project project = new Project("תוכנה", "Ariel Ramati", "Alonei Shilo", date, date, date, "MA ZE OMER",
					ProjectType.BUILDING, 50000, 60000);
			getInstance().addObjToDB(project);

			Salary salary = new Salary("343443", "Yossi Moshe", SalaryType.GLOBAL, 5000, date, date);
			getInstance().addObjToDB(salary);

			Supplier supplier = new Supplier("Adon", "Shlomo", "Tel Aviv University", "111111111");
			getInstance().addObjToDB(supplier);

			WorkingHours workingHours = new WorkingHours(1, date, "Building");
			getInstance().addObjToDB(workingHours);
//			List<WorkingHours> workingHoursList = getInstance().getAllObjectsFromDB(WorkingHours.class);
//
//			List<Payment> payments = getInstance().getAllObjectsFromDB(Payment.class);
//
//			FileOutputStream fos = new FileOutputStream("C:\\Users\\Kobi\\Pictures\\test.jpg");
//			fos.write(payments.get(0).getPaymentImage());
//			fos.close();

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

	public <E> void addObjToDB(E addToDbObj) {
		Session session = null;
		Transaction transaction = null;
		try
		{
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			session.save(addToDbObj);
			transaction.commit();
		} catch(HibernateException e) {
			e.printStackTrace();
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

	private <E> List<E> getAllObjectsFromDB(Class objClass)
	{
		Session session = null;
		Transaction transaction = null;
		List dbList = null;
		try
		{
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			dbList = session.createCriteria(objClass).list();
		} catch(HibernateException e) {
			if (transaction!=null) transaction.rollback();
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

		return dbList;
	}


	public static boolean saveData(TableElement tableElement) throws IOException{
		
		boolean returnVal = true;
		//TODO- Kobi here you need to save the table element to the DB and return true false for the insert..


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

	public boolean findClient(String clientName){
		//TODO- Kobi add query to check if this client name exist in the DB
		return true;
	}
}
