// Problem 8.14
// Explore matrix (rows/columns/diagonals with all 0s or 1s)
// Chapter_8

import java.util.Random;
import java.util.Scanner;

public class Problem8_14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size for the matrix: ");
        int n = in.nextInt();
        int[][] m = new int[n][n];
        Random rnd = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                m[i][j] = rnd.nextBoolean() ? 1 : 0;
                System.out.print(m[i][j]);
            }
            System.out.println();
        }

        boolean foundRow = false;
        for (int i = 0; i < n; i++) {
            boolean all0 = true, all1 = true;
            for (int j = 0; j < n; j++) {
                if (m[i][j] != 0)
                    all0 = false;
                if (m[i][j] != 1)
                    all1 = false;
            }
            if (all0) {
                System.out.println("All 0s on row " + (i + 1));
                foundRow = true;
            }
            if (all1) {
                System.out.println("All 1s on row " + (i + 1));
                foundRow = true;
            }
        }
        if (!foundRow)
            System.out.println("No same numbers on a row");

        boolean foundCol = false;
        for (int j = 0; j < n; j++) {
            boolean all0 = true, all1 = true;
            for (int i = 0; i < n; i++) {
                if (m[i][j] != 0)
                    all0 = false;
                if (m[i][j] != 1)
                    all1 = false;
            }
            if (all0) {
                System.out.println("All 0s on column " + (j + 1));
                foundCol = true;
            }
            if (all1) {
                System.out.println("All 1s on column " + (j + 1));
                foundCol = true;
            }
        }
        if (!foundCol)
            System.out.println("No same numbers on a column");

        boolean majAll0 = true, majAll1 = true;
        for (int i = 0; i < n; i++) {
            if (m[i][i] != 0)
                majAll0 = false;
            if (m[i][i] != 1)
                majAll1 = false;
        }
        if (majAll0)
            System.out.println("All 0s on the major diagonal");
        else if (majAll1)
            System.out.println("All 1s on the major diagonal");
        else
            System.out.println("No same numbers on the major diagonal");

        boolean subAll0 = true, subAll1 = true;
        for (int i = 0; i < n; i++) {
            if (m[i][n - 1 - i] != 0)
                subAll0 = false;
            if (m[i][n - 1 - i] != 1)
                subAll1 = false;
        }
        if (subAll0)
            System.out.println("All 0s on the sub-diagonal");
        else if (subAll1)
            System.out.println("All 1s on the sub-diagonal");
        else
            System.out.println("No same numbers on the sub-diagonal");

        in.close();
    }
}
