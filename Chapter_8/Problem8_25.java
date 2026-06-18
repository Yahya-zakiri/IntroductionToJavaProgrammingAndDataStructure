// Problem 8.25
// Markov matrix
// Chapter_8

import java.util.Scanner;

public class Problem8_25 {
    public static boolean isMarkovMatrix(double[][] m) {
        int n = m.length;
        double eps = 1e-9;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                if (m[i][j] <= 0)
                    return false;
        for (int j = 0; j < n; j++) {
            double sum = 0;
            for (int i = 0; i < n; i++)
                sum += m[i][j];
            if (Math.abs(sum - 1.0) > 1e-6)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[][] m = new double[3][3];
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                m[i][j] = in.nextDouble();
        System.out.println(isMarkovMatrix(m) ? "It is a Markov matrix" : "It is not a Markov matrix");
        in.close();
    }
}