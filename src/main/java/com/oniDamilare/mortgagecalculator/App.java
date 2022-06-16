package com.oniDamilare.mortgagecalculator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("WELCOME TO THE MORTGAGE CALCULATOR");
        System.out.println("This application helps to calculate monthly mortgage repayment");
        //Accept input parameters from users
        Scanner inputParam = new Scanner(System.in);
        System.out.print("Enter the Principal Amount: ");
        double princAmt = inputParam.nextDouble();
        System.out.print("Enter the Interest Rate: ");
        double irate = inputParam.nextDouble();
        System.out.print("Enter the Tenor (days): ");
        int iperiod = inputParam.nextInt();
        //Calling the mortgage calculator from the main method.
        mortgageCalculator(princAmt, irate, iperiod);
    }

    public static void mortgageCalculator(double principal, double rate, int period) {
        double monthlyRep, nom, denom = 0.00;
        rate = (rate / 1200);
        nom = Math.pow((1 + rate), period) * rate;
        System.out.println("The numerator: " + nom);
        denom = (Math.pow((1 + rate), period)) - 1;
        System.out.println("The Denominator:" + denom);
        monthlyRep = (nom / denom) * principal;
        System.out.println("The monthly repayment: " + monthlyRep);
    }
}
