package model;

import lombok.Data;

@Data
public class User {
    private String userId;
    private String name;

    private String location;
    private String browser; //Which browser(s) does user use
    private String ipAddress;

    private double balance;
    private Boolean isFlagged; //Is user suspicious
    private int riskPoints;
}
