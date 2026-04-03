
/*
    Chapter 2
    Listing 2.2
*/

import java.util.Scanner;

public class CircleAreaComputer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble();

        //Circle area formula
        // Area = radius ^ 2 * Pi
        double area = radius * radius * Math.PI;

        System.out.println("The area of the circle with " + radius + " is: " + area);
    }
}