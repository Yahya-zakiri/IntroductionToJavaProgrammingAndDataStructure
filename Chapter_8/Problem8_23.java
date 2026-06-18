// Problem 8.23
// Even number of 1s / find flipped cell
// Chapter_8

import java.util.Random;
import java.util.Scanner;

public class Problem8_23 {
    public static boolean allEven(int[][] m) {
        for (int i = 0; i < 6; i++) {
            int cnt = 0;
            for (int j = 0; j < 6; j++)
                cnt += m[i][j];
            if (cnt % 2 != 0)
                return false;
        }
        for (int j = 0; j < 6; j++) {
            int cnt = 0;
            for (int i = 0; i < 6; i++)
                cnt += m[i][j];
            if (cnt % 2 != 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Random rnd = new Random();
        int[][] m = new int[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                m[i][j] = rnd.nextBoolean() ? 1 : 0;
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("All rows and columns have even number of 1s: " + allEven(m));
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a 6-by-6 matrix row by row:");
        int[][] a = new int[6][6];
        for (int i = 0; i < 6; i++)
            for (int j = 0; j < 6; j++)
                a[i][j] = in.nextInt();
        int row = -1, col = -1;
        for (int i = 0; i < 6; i++) {
            int cnt = 0;
            for (int j = 0; j < 6; j++)
                cnt += a[i][j];
            if (cnt % 2 != 0) {
                row = i;
                break;
            }
        }
        for (int j = 0; j < 6; j++) {
            int cnt = 0;
            for (int i = 0; i < 6; i++)
                cnt += a[i][j];
            if (cnt % 2 != 0) {
                col = j;
                break;
            }
        }
        System.out.println("The flipped cell is at (" + row + ", " + col + ")");
        in.close();
    }
}