package com.kodilla.challenges;

import java.math.BigDecimal;


public class InformationService {


    public void sendEmail (String buyerName, String mail, String product, BigDecimal totalPrice){

        System.out.println("Send to: " + mail + "\n" + "Hello, " + buyerName +".\n"+
                "Thank You for using our shop. \n" +
                "Your oder of: " + product + " total price: " + totalPrice +  "PLN. has been completed");

    }
}
