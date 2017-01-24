package model;

import java.sql.Date;

public class WorkingHours {

	private int employeeSerialNumber;
	private Date day;
	private int enteringHour;
	private int leavingHour;
	private String projectName;

	public WorkingHours(){}

	public WorkingHours(int employeeSerialNumber, Date date, int start, int end, String projectName){
		this.employeeSerialNumber = employeeSerialNumber;
		this.day = date;
		this.enteringHour = start;
		this.leavingHour = end;
		this.projectName = projectName;
	}

	//deafult values for entering and leaving work
	public WorkingHours(int employeeSerialNumber, Date date, String projectName) {
		this.employeeSerialNumber = employeeSerialNumber;
		this.projectName = projectName;
		this.day = date;
		this.enteringHour = 7;
		this.leavingHour = 4;
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

	public String getProjectName() {
		return projectName;
	}

	public int getEmployeeSerialNumber() {
		return employeeSerialNumber;
	}

	public void setEmployeeSerialNumber(int employeeSerialNumber) {
		this.employeeSerialNumber = employeeSerialNumber;
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

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
}