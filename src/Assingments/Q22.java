package Assingments;

import java.util.Scanner;

public class Q22 {
    //multiplication table of a given number.//

    public static void printTable(int number) {
        System.out.println("Multiplication Table of " + number + ":");
        for ( int i = 1; i <= 12; i++){
            System.out.println(number + " x " + i + " = " + (number * i));

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to print multiplication table: ");
        int num = sc.nextInt();

        printTable(num);
    }
}
