// Problem 8.6
// Multiply two matrices
// Chapter_8

import java.util.Scanner;

public class Problem8_6 {
    public static double[][] multiplyMatrix(double[][] a, double[][] b) {
        int rows = a.length;
        int cols = b[0].length;
        int n = a[0].length; // columns of a == rows of b
        double[][] c = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                double sum = 0;
                for (int k = 0; k < n; k++)
                    sum += a[i][k] * b[k][j];
                c[i][j] = sum;
            }
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter matrix1: ");
        double[][] a = new double[3][3];
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                a[i][j] = input.nextDouble();

        System.out.print("Enter matrix2: ");
        double[][] b = new double[3][3];
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                b[i][j] = input.nextDouble();

        double[][] c = multiplyMatrix(a, b);

        System.out.println("The multiplication of the matrices is");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                System.out.printf("%.1f ", a[i][j]);
            System.out.print(i == 1 ? "* " : "  ");
            for (int j = 0; j < 3; j++)
                System.out.printf("%.1f ", b[i][j]);
            System.out.print(i == 1 ? "= " : "  ");
            for (int j = 0; j < 3; j++)
                System.out.printf("%.1f ", c[i][j]);
            System.out.println();
        }
        input.close();
    }
}
