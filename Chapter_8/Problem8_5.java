// Problem 8.5
// Add two matrices
// Chapter_8

import java.util.Scanner;

public class Problem8_5 {
    public static double[][] addMatrix(double[][] a, double[][] b) {
        int rows = a.length;
        int cols = a[0].length;
        double[][] c = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                c[i][j] = a[i][j] + b[i][j];
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

        double[][] c = addMatrix(a, b);

        System.out.println("The matrices are added as follows");
        for (int i = 0; i < 3; i++) {
            // print row of a
            for (int j = 0; j < 3; j++)
                System.out.printf("%.1f ", a[i][j]);
            // plus sign in middle row
            System.out.print(i == 1 ? "+ " : "  ");
            // print row of b
            for (int j = 0; j < 3; j++)
                System.out.printf("%.1f ", b[i][j]);
            // equals sign in middle row
            System.out.print(i == 1 ? "= " : "  ");
            // print row of c
            for (int j = 0; j < 3; j++)
                System.out.printf("%.1f ", c[i][j]);
            System.out.println();
        }
        input.close();
    }
}
