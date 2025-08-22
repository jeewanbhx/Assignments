package Assingments;

import java.util.Scanner;

public class Q10B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        double a = sc.nextDouble();
        System.out.println("Enter b: ");
        double b = sc.nextInt();
        System.out.println("Enter c: ");
        double c = sc.nextDouble();
        double s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s -a) * (s-b) * (s -c ));
        System.out.println("The are of the the triangle is "   +area );
    }
}
