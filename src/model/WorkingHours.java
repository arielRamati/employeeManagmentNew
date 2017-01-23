package model;

import java.sql.Date;

public class WorkingHours {

	private Employee employeeName;
	private Date day;
	private int enteringHour;
	private int leavingHour;
	private String projectName;

	public WorkingHours(Employee employee, Date date, int start, int end, String projectName){
		this.employeeName = employee;
		this.day = date;
		this.enteringHour = start;
		this.leavingHour = end;
		this.projectName = projectName;
	}

	//deafult values for entering and leaving work
	public WorkingHours(Employee employee, Date date, String projectName) {
		this.employeeName = employee;
		this.projectName = projectName;
		this.day = date;
		this.enteringHour = 7;
		this.leavingHour = 4;
	}

	public Employee getEmployeeName() {
		return employeeName;
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

	public void setEmployeeName(Employee employeeName) {
		this.employeeName = employeeName;
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