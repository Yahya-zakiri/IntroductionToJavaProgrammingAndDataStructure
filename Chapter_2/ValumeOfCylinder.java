
//Chapter 2
//Programming Exercises
//2.2

import java.util.Scanner;

public class ValumeOfCylinder {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of the cylinder base: ");
        double radius = input.nextDouble();
        System.out.print("Enter the length of the cylinder: ");
        double length = input.nextDouble();
        final double pi = Math.PI;

        double area = Math.pow(radius, 2) * pi;
        double volume = area * length;

        System.out.println("The area of the cylinder is: " + ((int) (area * 100)) / 100.0);
        System.out.println("The volume of the cylinder is: " + ((int) (volume * 100)) / 100.0);
    }
}
