package service;

import model.User;
import model.Transaction;

public class NamingRules {

    User user = new User();
    Transaction transaction = new Transaction();

    //Copy function getters to 'types' so it's easy
    String userName = user.getName();
    String transactionName = transaction.getNameOnCard();
    int transactionRisk = transaction.getRiskPoints();

    //Convert transactionName to ALLCAPS string
    //transactionName

    //Name is checked against transaction and actual user of card information
    if(transactionName != userName) {
        //Point total increases by 50, which will alert user of purchase
        transactionRisk += 50;

    }
}