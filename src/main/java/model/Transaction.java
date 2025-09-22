package model;

import lombok.Data;

@Data
public class Transaction {
    private String userId;
    private String nameOnCard;

    private String location;
    private String browser;
    private String ipAddress;

    private double amount;
    private String timestamp;

    private int trRiskPoints;
}