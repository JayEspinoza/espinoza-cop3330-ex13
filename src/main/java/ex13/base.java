/*
 *  UCF COP3330 Summer 2021 Assignment 13 Solution
 *  Copyright 2021 Julian Espinoza
 *
 *  Exercise 13 - Determining Compound Interest
 *  Write a program to compute the value of an investment compounded over time. The program should ask for the starting amount, the number of years to invest,
 *  the interest rate, and the number of periods per year to compound.
 *
 *  Constraint:
 *  Prompt for the rate as a percentage (like 15, not .15). Divide the input by 100 in your program.
 *  Ensure that fractions of a cent are rounded up to the next penny.
 *  Ensure that the output is formatted as money.
 *
 */

package ex13;
import java.util.Scanner;
import java.lang.Math;

public class base {
    public static void main(String [] args)
    {
        // Variable Initialization
        Scanner userInput = new Scanner(System.in);
        double principal, interest, total;
        int years, compound;

        // User Input Step
        System.out.printf("What is the principal amount? ");
        principal = userInput.nextDouble();

        // Rate asked as percentage
        System.out.printf("What is the rate? ");
        interest = userInput.nextDouble();

        System.out.printf("What is the number of years? ");
        years = userInput.nextInt();

        System.out.printf("What is the number of times the interest is compounded per year? ");
        compound = userInput.nextInt();

        // Calculations
        // Math.pow used to calculate exponent
        total = principal * Math.pow((1 + ((interest/100) / compound)), (compound * years));
        System.out.printf("$%.2f invested at %.1f%% for %d years compounded %d times per year is $%.2f.", principal, interest, years, compound, total);
    }
}

