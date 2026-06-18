// Problem 8.13
// Locate the largest element
// Chapter_8

import java.util.Scanner;

public class Problem8_13 {
    public static int[] locateLargest(double[][] a) {
        int rows = a.length;
        int cols = a[0].length;
        int maxi = 0, maxj = 0;
        double max = a[0][0];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (a[i][j] > max) {
                    max = a[i][j];
                    maxi = i;
                    maxj = j;
                }
            }
        }
        return new int[] { maxi, maxj };
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns of the array: ");
        int r = input.nextInt();
        int c = input.nextInt();
        System.out.println("Enter the array:");
        double[][] a = new double[r][c];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                a[i][j] = input.nextDouble();
        int[] loc = locateLargest(a);
        System.out.println("The location of the largest element is at (" + loc[0] + ", " + loc[1] + ")");
        input.close();
    }
}
