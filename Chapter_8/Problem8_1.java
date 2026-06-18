// Problem 8.1
// Sum elements column by column
// Chapter_8

import java.util.Scanner;

public class Problem8_1 {
    public static double sumColumn(double[][] m, int columnIndex) {
        double sum = 0;
        for (int i = 0; i < m.length; i++) {
            sum += m[i][columnIndex];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 3-by-4 matrix row by row:");
        double[][] m = new double[3][4];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                m[i][j] = input.nextDouble();
            }
        }
        for (int j = 0; j < 4; j++) {
            System.out.println("Sum of the elements at column " + j + " is " + sumColumn(m, j));
        }
        input.close();
    }
}
