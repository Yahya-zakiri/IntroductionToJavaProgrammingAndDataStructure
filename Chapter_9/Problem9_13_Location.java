// Problem 9.13
// Location class to locate largest value
// Chapter_9

import java.util.Scanner;

public class Problem9_13_Location {
    public static class Location {
        public int row;
        public int column;
        public double maxValue;

        public Location(int row, int column, double maxValue) {
            this.row = row;
            this.column = column;
            this.maxValue = maxValue;
        }
    }

    public static Location locateLargest(double[][] a) {
        int r = a.length, c = a[0].length;
        int ri = 0, ci = 0;
        double max = a[0][0];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                if (a[i][j] > max) {
                    max = a[i][j];
                    ri = i;
                    ci = j;
                }
        return new Location(ri, ci, max);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns in the array: ");
        int r = in.nextInt(), c = in.nextInt();
        System.out.println("Enter the array:");
        double[][] a = new double[r][c];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                a[i][j] = in.nextDouble();
        Location loc = locateLargest(a);
        System.out.printf("The location of the largest element is %.1f at (%d, %d)\n", loc.maxValue, loc.row,
                loc.column);
        in.close();
    }
}