package Assingments;
import java.util.Scanner;

public class Q5Rectangle {
    public static void main(String[] args) {
        //Calculate the area of a rectangle
        double width = 0;
        double height = 0;
        double area = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the width: ");
        width = scanner.nextDouble();

        System.out.println("Enter the height:");
        height = scanner.nextDouble();

        area = width * height;
        System.out.println("The are is: " + area);
        
        scanner.close();
    }




}
