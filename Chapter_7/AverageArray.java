//Chapter 7
//Programming exercises
//(Average an array)

import java.util.Scanner;

public class AverageArray {
    public static double average(int[] array) {
        double sum = 0;
        for (int v : array)
            sum += v;
        return sum / array.length;
    }

    public static double average(double[] array) {
        double sum = 0;
        for (double v : array)
            sum += v;
        return sum / array.length;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter ten integers:");
        int[] ints = new int[10];
        for (int i = 0; i < 10; i++)
            ints[i] = input.nextInt();
        System.out.printf("The average value of the integers is %.2f\n", average(ints));

        System.out.println("Enter ten double values:");
        double[] doubles = new double[10];
        for (int i = 0; i < 10; i++)
            doubles[i] = input.nextDouble();
        System.out.printf("The average value of the doubles is %.2f\n", average(doubles));

        input.close();
    }
}
