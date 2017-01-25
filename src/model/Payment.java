package model;

import model_params.PaymentType;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;


/**
 * Created by Kobi on 1/24/2017.
 */
public class Payment extends TableElement{

    @Id
    @GenericGenerator(name = "generate", strategy = "increment")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int serialNumber;
    private PaymentType paymentType;
    private String receiver;
    private long paymentSum;
    private Date paymentDate;
    private String paymentMethod;
    private int numberOfPayments;
    private byte[] paymentImage;
    private String projectName;
    private String comment;

    public Payment() {
    }

    public Payment(PaymentType paymentType, String receiver, long sum, Date paymentDate, String paymentMethod,
                   int numberOfPayments, byte[] paymentImage, String projectName, String comment) {
        this.paymentType = paymentType;
        this.receiver = receiver;
        this.paymentSum = sum;
        this.paymentDate = paymentDate;
        this.paymentMethod = paymentMethod;
        this.numberOfPayments = numberOfPayments;
        this.paymentImage = paymentImage;
        this.projectName = projectName;
        this.comment = comment;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public long getPaymentSum() {
        return paymentSum;
    }

    public void setPaymentSum(long sum) {
        this.paymentSum = sum;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public int getNumberOfPayments() {
        return numberOfPayments;
    }

    public void setNumberOfPayments(int numberOfPayments) {
        this.numberOfPayments = numberOfPayments;
    }

    public byte[] getPaymentImage() {
        return paymentImage;
    }

    public void setPaymentImage(byte[] paymentImage) {
        this.paymentImage = paymentImage;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
