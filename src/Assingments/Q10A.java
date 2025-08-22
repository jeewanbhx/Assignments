package Assingments;

import java.util.Scanner;

public class Q10A {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter u: ");
        double u = sc.nextDouble();
        System.out.println("Enter a: ");
        double a = sc.nextDouble();
        System.out.println("Enter t: ");
        double t = sc.nextDouble();
        double s = u * t + 0.5 * a * Math.pow(t,2);
        System.out.println("s is " +s);
    }
}
