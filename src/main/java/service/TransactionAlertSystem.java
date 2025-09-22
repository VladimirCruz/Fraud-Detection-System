package service;

import model.Transaction;
//import

public class TransactionAlertSystem {
    public void tr_alert_point_checker() {
        Transaction transaction = new Transaction();
        int riskPoints = transaction.getTrRiskPoints();

        String alert = "";

        //Name was entered incorrectly
        if(riskPoints >= 50 && riskPoints <= 99) {
            //Send out alert to user's bank app
            alert = "Mild";
        }

        if(riskPoints >= 100 && riskPoints <= 150) {
            //Send out alert to user's bank app
            alert = "Suspicious";
        }

        //Critical information error
        if(riskPoints >= 300) {
            //Send out critical alert to user's bank app
            alert = "Critical";
        }

        //alert_user_of_transaction(alert);
    }
}