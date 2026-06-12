
//Chapter 7
//Programming exercises
//7.1

import java.util.Scanner;

public class reverseNumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[10];

        System.out.print("Enter 10 numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        // Prints the array in reverse
        System.out.print("The numbers in reserved are: ");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + "  ");
        }
        System.out.println(" ");
    }
}
