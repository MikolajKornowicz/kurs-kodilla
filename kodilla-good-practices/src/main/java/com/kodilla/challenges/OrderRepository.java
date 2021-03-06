package com.kodilla.challenges;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;



public class OrderRepository {


        public void writeStringToFile(String buyerName, String sellerName, String productName, BigDecimal price) {

                try {
                        BufferedWriter orderData = new BufferedWriter(new FileWriter("order.txt", true));
                        orderData.write(buyerName+ " bought from " + sellerName + " this product: " + productName + " for: " + price + " date: " + LocalTime.now() + "\n");
                        orderData.close();
                } catch (IOException e) {
                        System.out.println("Error with saving to file");
                }
        }
}
