package Assingments;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        //sum
        double sum = num1 + num2;

        //Average
        double average = sum / 2;

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);

    }
}
