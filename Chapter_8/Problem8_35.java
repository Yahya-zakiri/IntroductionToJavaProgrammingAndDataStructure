// Problem 8.35
// Largest block (maximum square submatrix of 1s)
// Chapter_8

import java.util.Scanner;

public class Problem8_35 {
    public static int[] findLargestBlock(int[][] m) {
        int n = m.length;
        int[][] dp = new int[n][n];
        int maxSize = 0;
        int maxI = 0, maxJ = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (m[i][j] == 1) {
                    if (i == 0 || j == 0)
                        dp[i][j] = 1;
                    else
                        dp[i][j] = 1 + Math.min(dp[i - 1][j], Math.min(dp[i][j - 1], dp[i - 1][j - 1]));
                    if (dp[i][j] > maxSize) {
                        maxSize = dp[i][j];
                        maxI = i - maxSize + 1;
                        maxJ = j - maxSize + 1;
                    } else if (dp[i][j] == maxSize && maxSize > 0) {
                        int ti = i - dp[i][j] + 1;
                        int tj = j - dp[i][j] + 1;
                        if (ti < maxI || (ti == maxI && tj < maxJ)) {
                            maxI = ti;
                            maxJ = tj;
                        }
                    }
                }
            }
        }
        return new int[] { maxI, maxJ, maxSize };
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of rows in the matrix: ");
        int n = in.nextInt();
        int[][] m = new int[n][n];
        System.out.println("Enter the matrix row by row:");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                m[i][j] = in.nextInt();
        int[] res = findLargestBlock(m);
        System.out.println("The maximum square submatrix is at (" + res[0] + ", " + res[1] + ") with size " + res[2]);
        in.close();
    }
}
