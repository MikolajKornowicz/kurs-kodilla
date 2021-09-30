package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.SimpleCalculator;

public class TestingMain {

    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        System.out.println("Testing calculator: \n");
        SimpleCalculator calculator = new SimpleCalculator();

        calculator.add(10, 5);
        int addition = 15;
        if (addition == calculator.getAddresult()){
            System.out.println("Addition works");
        } else {
            System.out.println("Addition error");
        }

        calculator.subtract(10, 5);
        int subtraction = 5;
        if (subtraction == calculator.getSubresult()){
            System.out.println("Subtraction works");
        } else {
            System.out.println("Subtraction error");
        }
    }
}