// Problem 8.28
// Strictly identical arrays
// Chapter_8

import java.util.Scanner;

public class Problem8_28 {
    public static boolean equals(int[][] m1, int[][] m2) {
        if (m1.length != m2.length)
            return false;
        if (m1[0].length != m2[0].length)
            return false;
        for (int i = 0; i < m1.length; i++)
            for (int j = 0; j < m1[0].length; j++)
                if (m1[i][j] != m2[i][j])
                    return false;
        return true;
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
        System.out.println(
                equals(a, b) ? "The two arrays are strictly identical" : "The two arrays are not strictly identical");
        in.close();
    }
}
