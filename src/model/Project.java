package model;

import model_params.ProjectType;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;

/**
 * Created by Ariel Ramati
 */
public class Project {

    @Id
    @GenericGenerator(name="generate" , strategy="increment")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int serialNumber;
    private String projectName;
    private String client;
    private String projectAddress;
    private Date startingDate;
    private Date approximateFinishDate;
    private Date actualFinishDate;
    private String extras;
    private ProjectType projectType;
    private int estimatedCost;
    private int actualCost;

    public Project(){}

    public Project(String projectName, String client, String projectAddress, Date startingDate, Date approximateFinishDate, Date actualFinishDate, String extras, ProjectType projectType, int estimatedCost, int actualCost) {
        this.projectName = projectName;
        this.client = client;
        this.projectAddress = projectAddress;
        this.startingDate = startingDate;
        this.approximateFinishDate = approximateFinishDate;
        this.actualFinishDate = actualFinishDate;
        this.extras = extras;
        this.projectType = projectType;
        this.estimatedCost = estimatedCost;
        this.actualCost = actualCost;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getProjectAddress() {
        return projectAddress;
    }

    public void setProjectAddress(String projectAddress) {
        this.projectAddress = projectAddress;
    }

    public Date getStartingDate() {
        return startingDate;
    }

    public void setStartingDate(Date startingDate) {
        this.startingDate = startingDate;
    }

    public Date getApproximateFinishDate() {
        return approximateFinishDate;
    }

    public void setApproximateFinishDate(Date approximateFinishDate) {
        this.approximateFinishDate = approximateFinishDate;
    }

    public Date getActualFinishDate() {
        return actualFinishDate;
    }

    public void setActualFinishDate(Date actualFinishDate) {
        this.actualFinishDate = actualFinishDate;
    }

    public String getExtras() {
        return extras;
    }

    public void setExtras(String extras) {
        this.extras = extras;
    }

    public ProjectType getProjectType() {
        return projectType;
    }

    public void setProjectType(ProjectType projectType) {
        this.projectType = projectType;
    }

    public int getEstimatedCost() {
        return estimatedCost;
    }

    public void setEstimatedCost(int estimatedCost) {
        this.estimatedCost = estimatedCost;
    }

    public int getActualCost() {
        return actualCost;
    }

    public void setActualCost(int actualCost) {
        this.actualCost = actualCost;
    }
}
