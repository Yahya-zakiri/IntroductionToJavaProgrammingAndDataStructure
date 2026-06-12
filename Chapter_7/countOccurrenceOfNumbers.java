
//Chapter 7
//Programming exercises
//7.3

import java.util.Scanner;

public class countOccurrenceOfNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] counts = new int[101];

        System.out.print("Enter the numbers between 0-100 (Programme will ends 0): ");
        int number = input.nextInt();

        while (number != 0) {
            if (number >= 0 && number <= 100) {
                counts[number]++;
            }
            number = input.nextInt();
        }

        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > 0) {
                System.out.println(i + " occures " + counts[i] + (counts[number] > 1 ? " times." : " time."));
            }
        }
    }
}
