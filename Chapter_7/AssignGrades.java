
//Chapter 7
//Programming Exercises
//7.1

import java.util.Scanner;

public class AssignGrades {
    public static void main(String[] args) {

        double[] scores = getScores();
        double bestScore = bestScore(scores);

        for (int i = 0; i < scores.length; i++) {
            System.out.println("Student " + (int) (i + 1) + " score is " + scores[i] + " and grade is: "
                    + grade(scores[i], bestScore));
        }

    }

    public static double[] getScores() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numOfStd = input.nextInt();

        double[] scores = new double[numOfStd];

        System.out.print("Enter " + numOfStd + " scores: ");

        for (int i = 0; i < scores.length; i++) {
            scores[i] = input.nextDouble();
        }

        return scores;
    }

    public static double bestScore(double[] scores) {
        double bestScore = scores[0];

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > bestScore) {
                bestScore = scores[i];
            }
        }

        return bestScore;
    }

    public static char grade(double score, double bestScore) {
        char grade = ' ';

        if (score >= (bestScore - 10)) {
            grade = 'A';
        } else if (score >= (bestScore - 20) && score < (bestScore - 10)) {
            grade = 'B';
        } else if (score >= (bestScore - 30) && score < (bestScore - 20)) {
            grade = 'C';
        } else if (score >= (bestScore - 40) && score < (bestScore - 30)) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        return grade;
    }
}
