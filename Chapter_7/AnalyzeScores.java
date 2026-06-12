//Chapter 7
//Programming exercises
//7.4

import java.util.Scanner;

public class AnalyzeScores {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int MAX = 100;
        double[] scores = new double[MAX];
        int count = 0;
        System.out.println("Enter the students' scores (negative number to end):");

        while (count < MAX) {
            if (!input.hasNextDouble()) {
                // skip non-numeric tokens
                input.next();
                continue;
            }
            double s = input.nextDouble();
            if (s < 0) {
                break;
            }
            scores[count++] = s;
        }

        if (count == 0) {
            System.out.println("No scores were entered.");
            return;
        }

        double sum = 0;
        for (int i = 0; i < count; i++) {
            sum += scores[i];
        }
        double average = sum / count;

        int aboveOrEqual = 0;
        for (int i = 0; i < count; i++) {
            if (scores[i] >= average) {
                aboveOrEqual++;
            }
        }
        int below = count - aboveOrEqual;

        System.out.printf("Average score: %.2f\n", average);
        System.out.println("Number of scores = " + count);
        System.out.println("Number of scores >= average: " + aboveOrEqual);
        System.out.println("Number of scores below average: " + below);
    }
}
