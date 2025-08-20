package Assingments;

import java.util.Scanner;

public class SumAndAverage {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the First Number");
        double num1 = scanner.nextDouble();

        System.out.println("Enter the Second Number");
        double num2 = scanner.nextDouble();

        //calculate the sum of the two numbers.
        double sum = num1 + num2;
        double avg = sum /2;
        }

}
