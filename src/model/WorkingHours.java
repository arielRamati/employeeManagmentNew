package model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;

public class WorkingHours extends TableElement{

	@Id
	@GenericGenerator(name="generate" , strategy="increment")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int serialNumber;
	private int employeeID;
	private int projectSerialNumber;
	private Date day;
	private int enteringHour;
	private int leavingHour;

	public WorkingHours(){}

	public WorkingHours(int employeeID, int projectSerialNumber, Date date, int start, int end){
		this.employeeID = employeeID;
		this.projectSerialNumber = projectSerialNumber;
		this.day = date;
		this.enteringHour = start;
		this.leavingHour = end;

	}

	//deafult values for entering and leaving work
	public WorkingHours(int employeeID, int projectSerialNumber, Date date) {
		this.employeeID = employeeID;
		this.projectSerialNumber = projectSerialNumber;
		this.day = date;
		this.enteringHour = 7;
		this.leavingHour = 4;
	}

	public int getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
	}

	public Date getDay() {
		return day;
	}

	public int getEnteringHour() {
		return enteringHour;
	}

	public int getLeavingHour() {
		return leavingHour;
	}

	public int getProjectSerialNumber() {
		return projectSerialNumber;
	}

	public void setProjectSerialNumber(int projectSerialNumber) {
		this.projectSerialNumber = projectSerialNumber;
	}

	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeSerialNumber) {
		this.employeeID = employeeSerialNumber;
	}

	public void setDay(Date day) {
		this.day = day;
	}

	public void setEnteringHour(int enteringHour) {
		this.enteringHour = enteringHour;
	}

	public void setLeavingHour(int leavingHour) {
		this.leavingHour = leavingHour;
	}

}