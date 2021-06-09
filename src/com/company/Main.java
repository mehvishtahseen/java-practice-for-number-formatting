package com.company;

import java.text.NumberFormat;

public class Main {

    public static void main(String[] args) {

       //Formatting numbers
        // use of formatting currency class to convert a input string to currency when needed
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String returnCurrency = currency.format(123456789.98765);
        System.out.println(returnCurrency);

        //Using the number formatting class to print the given input as a percentage
        NumberFormat percent = NumberFormat.getPercentInstance();
        String returnPercentage = percent.format(0.90);
        System.out.println(returnPercentage);

        //printing the percentage using the method chaining process where two methods are combined
        String returnPercent = NumberFormat.getPercentInstance().format(0.890);
        System.out.println(returnPercent);
    }
}
