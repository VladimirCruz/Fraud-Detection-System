package service;

import model.User;
import model.Transaction;

public class NamingRules {

    public int checkTransactionName(Transaction t, User u) { //user-id is received before this method is ever called
        User user = new User();
        Transaction transaction = new Transaction();

        //Copy function getters to 'types' so it's easy
        String userName = user.getName();
        String transactionName = transaction.getNameOnCard();
        transactionName.toUpperCase(); //Convert transactionName to ALLCAPS string for ease of checking

        int trRisk = 0;

        //Name is checked against transaction and actual user of card information
        if(!transactionName.equals(userName)) {
            //Point total increases by 50, which will alert user of purchase
            trRisk += 50;
        }

        return trRisk;
    }
}