package model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by Kobi on 3/3/2017.
 */
public class IncomingPayments {
    @Id
    @GenericGenerator(name = "generate", strategy = "increment")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int serialNumber;
    private int projectSerialNumber;

}
