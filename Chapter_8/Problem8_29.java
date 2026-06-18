// Problem 8.29
// Identical arrays (same contents)
// Chapter_8

import java.util.Arrays;
import java.util.Scanner;

public class Problem8_29 {
    public static boolean equals(int[][] m1, int[][] m2) {
        int r = m1.length, c = m1[0].length;
        if (m2.length != r || m2[0].length != c)
            return false;
        int[] a = new int[r * c];
        int[] b = new int[r * c];
        int idx = 0;
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                a[idx++] = m1[i][j];
        idx = 0;
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                b[idx++] = m2[i][j];
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a, b);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter list1: ");
        int[][] a = new int[3][3];
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                a[i][j] = in.nextInt();
        System.out.print("Enter list2: ");
        int[][] b = new int[3][3];
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                b[i][j] = in.nextInt();
        System.out.println(equals(a, b) ? "The two arrays are identical" : "The two arrays are not identical");
        in.close();
    }
}
