package model;

import com.sun.istack.internal.NotNull;
import com.sun.istack.internal.Nullable;
import model_params.ProjectType;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;

/**
 * Created by Ariel Ramati
 */
public class Project extends TableElement {

    @Id
    @GenericGenerator(name="generate" , strategy="increment")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int serialNumber;
    private String projectName;
    private int clientSerialNumber;
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

    public Project(){}
//
//    public Project (String projectName, int client, String projectAddress, Date startingDate,
//                    Date approximateFinishDate, Date actualFinishDate, String extras, ProjectType projectType,
//                    int estimatedCost, int actualCost) {
//        this.projectName = projectName;
//        this.clientSerialNumber = client;
//        this.projectAddress = projectAddress;
//        this.startingDate = startingDate;
//        this.approximateFinishDate = approximateFinishDate;
//        this.actualFinishDate = actualFinishDate;
//        this.extras = extras;
//        this.projectType = projectType;
//        this.estimatedCostForMe = estimatedCost;
//        this.actualCost = actualCost;
//    }

    public Project(@NotNull String projectName, @NotNull int clientSerialNumber, @Nullable String projectAddress,
                   @NotNull Date startingDate, @NotNull ProjectType projectType, @Nullable Integer estimatedCost,
                   @Nullable Integer firstPriceOffer, @Nullable Integer totalCostForClient, @NotNull int totalPayed) {
        this.projectName = projectName;
        this.clientSerialNumber = clientSerialNumber;
        this.projectAddress = projectAddress;
        this.startingDate = startingDate;
        this.approximateFinishDate = null;
        this.actualFinishDate = null;
        this.extras = null;
        this.projectType = projectType;
        this.estimatedCostForMe = estimatedCost != null ? estimatedCost : 0;
        this.actualCost = 0;
        this.firstPriceOffer = firstPriceOffer != null ? firstPriceOffer : 0 ;
        this.totalCostForClient = totalCostForClient != null ? totalCostForClient : 0 ;
        this.totalPayed = totalPayed;
        isFinish = false;
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

    public int getClientSerialNumber() {
        return clientSerialNumber;
    }

    public void setClientSerialNumber(int clientSerialNumber) {
        this.clientSerialNumber = clientSerialNumber;
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

    public int getEstimatedCostForMe () {
        return estimatedCostForMe;
    }

    public void setEstimatedCostForMe (int estimatedCostForMe) {
        this.estimatedCostForMe = estimatedCostForMe;
    }

    public int getActualCost() {
        return actualCost;
    }

    public void setActualCost(int actualCost) {
        this.actualCost = actualCost;
    }

    public int getFirstPriceOffer() {
        return firstPriceOffer;
    }

    public void setFirstPriceOffer(int firstPriceOffer) {
        this.firstPriceOffer = firstPriceOffer;
    }

    public int getTotalCostForClient() {
        return totalCostForClient;
    }

    public void setTotalCostForClient(int totalCostForClient) {
        this.totalCostForClient = totalCostForClient;
    }

    public int getTotalPayed() {
        return totalPayed;
    }

    public void setTotalPayed(int totalPayed) {
        this.totalPayed = totalPayed;
    }

    public boolean getIsFinish () {
        return isFinish;
    }

    public void setIsFinish (boolean finish) {
        isFinish = finish;
    }

    public String toString() {
        return this.getProjectName();
    }
}
