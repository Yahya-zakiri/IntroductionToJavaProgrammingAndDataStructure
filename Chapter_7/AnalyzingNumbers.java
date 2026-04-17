
//Chapter 7
//7.3
//Listing 7.1 Case Study

import java.util.Scanner;

public class AnalyzingNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Takes the data from the user
        System.out.print("How many numbers would you like to be analized: ");
        int leng = input.nextInt();

        double[] numbers = new double[leng];

        System.out.print("Enter the numbers seperated with space or Enter: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }

        // Calculates the average of the numbers
        double total = 0;
        double average = 0;
        for (int i = 0; i < numbers.length; i++) {
            total += numbers[i];
        }
        average = total / numbers.length;

        // Counts the numbers above average
        int counter = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > average) {
                counter++;
            }
        }

        // Outputs the number of elements above average and the average
        System.out.println("The average is: " + average);
        System.out.print("Number of elements above average is: " + counter + "\n");
    }
}
