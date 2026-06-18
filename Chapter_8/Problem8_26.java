// Problem 8.26
// Row sorting
// Chapter_8

import java.util.Arrays;
import java.util.Scanner;

public class Problem8_26 {
    public static double[][] sortRows(double[][] m) {
        int r = m.length;
        int c = m[0].length;
        double[][] res = new double[r][c];
        for (int i = 0; i < r; i++) {
            res[i] = Arrays.copyOf(m[i], c);
            Arrays.sort(res[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a 3-by-3 matrix row by row:");
        double[][] m = new double[3][3];
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                m[i][j] = in.nextDouble();
        double[][] s = sortRows(m);
        System.out.println("The row-sorted array is");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                System.out.printf("%.3f ", s[i][j]);
            System.out.println();
        }
        in.close();
    }
}
