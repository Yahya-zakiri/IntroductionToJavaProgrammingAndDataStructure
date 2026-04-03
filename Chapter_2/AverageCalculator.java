
/*
    Chapter 2
    Listing: 2.3
 */

import java.util.Scanner;

public class AverageCalculator  {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three numbers seperated by space or enter: ");
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();

        // Average calculation formula: 
        // Average = (number 1 + number 2 + number3) / 3
        double average = (number1 + number2 + number3) / 3;

        System.out.println("The average of " + number1 + ", " + number2 + " and " + number3 + " is: " + average);
    }
}