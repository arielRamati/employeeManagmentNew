package model;

import model_params.SalaryType;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;

/**
 * Created by Kobi on 1/24/2017.
 */
public class Salary extends TableElement{

    @Id
    @GenericGenerator(name="generate" , strategy="increment")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int serialNumber;
    private String employeeID;
    private SalaryType salaryType;
    private int fee;
    private Date startingFeeDate;
    private Date endFeeDate;

    public Salary(){}

    public Salary(String employeeID, SalaryType salaryType, int fee, Date startingFeeDate, Date endFeeDate) {
        this.employeeID = employeeID;
        this.salaryType = salaryType;
        this.fee = fee;
        this.startingFeeDate = startingFeeDate;
        this.endFeeDate = endFeeDate;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public SalaryType getSalaryType() {
        return salaryType;
    }

    public void setSalaryType(SalaryType salaryType) {
        this.salaryType = salaryType;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    public Date getStartingFeeDate() {
        return startingFeeDate;
    }

    public void setStartingFeeDate(Date startingFeeDate) {
        this.startingFeeDate = startingFeeDate;
    }

    public Date getEndFeeDate() {
        return endFeeDate;
    }

    public void setEndFeeDate(Date endFeeDate) {
        this.endFeeDate = endFeeDate;
    }
}
