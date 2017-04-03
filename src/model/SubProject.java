package model;

import model_params.ProjectType;

import java.sql.Date;

/**
 * Created by Kobi on 3/3/2017.
 */
public class SubProject extends TableElement {
    private int subProjectSerialNumber;
    private int fullProjectSerialNumber;
    private String projectName;
    private String projectAddress;
    private Date startingDate;
    private Date approximateFinishDate;
    private Date actualFinishDate;
    private String extras;
    private ProjectType projectType;
    private int estimatedCostForMe;
    private int actualCost;
    private int firstPriceOffer;
    private int totalCostForClient;
    private int totalPayed;
    private boolean isFinish;

    public SubProject (int fullProjectSerialNumber, String projectName, String projectAddress, ProjectType projectType, int estimatedCostForMe) {
        this.subProjectSerialNumber = subProjectSerialNumber;
        this.fullProjectSerialNumber = fullProjectSerialNumber;
        this.projectName = projectName;
        this.projectAddress = projectAddress;
        this.projectType = projectType;
        this.estimatedCostForMe = estimatedCostForMe;
    }

    public SubProject(){}

    public int getSubProjectSerialNumber () {
        return subProjectSerialNumber;
    }

    public void setSubProjectSerialNumber (int subProjectSerialNumber) {
        this.subProjectSerialNumber = subProjectSerialNumber;
    }

    public int getFullProjectSerialNumber () {
        return fullProjectSerialNumber;
    }

    public void setFullProjectSerialNumber (int fullProjectSerialNumber) {
        this.fullProjectSerialNumber = fullProjectSerialNumber;
    }

    public String getProjectName () {
        return projectName;
    }

    public void setProjectName (String projectName) {
        this.projectName = projectName;
    }

    public String getProjectAddress () {
        return projectAddress;
    }

    public void setProjectAddress (String projectAddress) {
        this.projectAddress = projectAddress;
    }

    public Date getStartingDate () {
        return startingDate;
    }

    public void setStartingDate (Date startingDate) {
        this.startingDate = startingDate;
    }

    public Date getApproximateFinishDate () {
        return approximateFinishDate;
    }

    public void setApproximateFinishDate (Date approximateFinishDate) {
        this.approximateFinishDate = approximateFinishDate;
    }

    public Date getActualFinishDate () {
        return actualFinishDate;
    }

    public void setActualFinishDate (Date actualFinishDate) {
        this.actualFinishDate = actualFinishDate;
    }

    public String getExtras () {
        return extras;
    }

    public void setExtras (String extras) {
        this.extras = extras;
    }

    public ProjectType getProjectType () {
        return projectType;
    }

    public void setProjectType (ProjectType projectType) {
        this.projectType = projectType;
    }

    public int getEstimatedCostForMe () {
        return estimatedCostForMe;
    }

    public void setEstimatedCostForMe (int estimatedCostForMe) {
        this.estimatedCostForMe = estimatedCostForMe;
    }

    public int getActualCost () {
        return actualCost;
    }

    public void setActualCost (int actualCost) {
        this.actualCost = actualCost;
    }

    public int getFirstPriceOffer () {
        return firstPriceOffer;
    }

    public void setFirstPriceOffer (int firstPriceOffer) {
        this.firstPriceOffer = firstPriceOffer;
    }

    public int getTotalCostForClient () {
        return totalCostForClient;
    }

    public void setTotalCostForClient (int totalCostForClient) {
        this.totalCostForClient = totalCostForClient;
    }

    public int getTotalPayed () {
        return totalPayed;
    }

    public void setTotalPayed (int totalPayed) {
        this.totalPayed = totalPayed;
    }

    public boolean isFinish () {
        return isFinish;
    }

    public void setFinish (boolean finish) {
        isFinish = finish;
    }

    @Override
    public boolean equals(Object object){
        if (object instanceof SubProject &&
                ((SubProject) object).getProjectName().equals(this.getProjectName()) &&
                ((SubProject) object).getSubProjectSerialNumber() == this.getSubProjectSerialNumber() &&
                ((SubProject) object).getFullProjectSerialNumber() == this.getFullProjectSerialNumber()) {
            return true;
        } else {
            return false;
        }
    }
}
