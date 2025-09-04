package Assingments;

import java.util.Scanner;

public class Q7 {
    //Volume of a Cylinder

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the radius of the cylinder: ");
        double radius = scanner.nextDouble();

        System.out.println("Enter the length (height) of the cylinder: ");
        double length = scanner.nextDouble();

        //calculate volume
        double volume = Math.PI * Math.pow(radius, 2) * length;

        System.out.println("The volume of the cylinder is: " + volume);


    }
}
