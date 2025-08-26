package Assingments;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {

                Scanner input = new Scanner(System.in);

                // Declare variables to store principal, time, and rate
                double principal;
                double time;
                double rate;
                double simpleInterest;

                System.out.print("Enter the principal amount: ");
                principal = input.nextDouble(); // Read the principal amount


                System.out.print("Enter the time in years: ");
                time = input.nextDouble(); // Read the time


                System.out.print("Enter the annual rate of interest (as a percentage): ");
                rate = input.nextDouble(); // Read the rate

                // Calculate simple interest using the formula: Simple Interest = (P * T * R) / 100
                simpleInterest = (principal * time * rate) / 100;

                System.out.println("The Simple Interest is: " + simpleInterest);

                // Close the scanner to release system resources
                input.close();
            }
        }
