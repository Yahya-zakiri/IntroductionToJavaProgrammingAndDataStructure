// Problem 11.9
// Largest rows and columns with most 1s
// Chapter_11

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Problem11_9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the array size n: ");
        int n = in.nextInt();
        int[][] m = new int[n][n];
        Random rnd = new Random();
        System.out.println("The random array is");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                m[i][j] = rnd.nextBoolean() ? 1 : 0;
                System.out.print(m[i][j]);
            }
            System.out.println();
        }
        int maxRowCount = -1;
        ArrayList<Integer> rows = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int cnt = 0;
            for (int j = 0; j < n; j++)
                cnt += m[i][j];
            if (cnt > maxRowCount) {
                maxRowCount = cnt;
                rows.clear();
                rows.add(i);
            } else if (cnt == maxRowCount)
                rows.add(i);
        }
        int maxColCount = -1;
        ArrayList<Integer> cols = new ArrayList<>();
        for (int j = 0; j < n; j++) {
            int cnt = 0;
            for (int i = 0; i < n; i++)
                cnt += m[i][j];
            if (cnt > maxColCount) {
                maxColCount = cnt;
                cols.clear();
                cols.add(j);
            } else if (cnt == maxColCount)
                cols.add(j);
        }
        System.out.print("The largest row index: ");
        for (int r : rows)
            System.out.print(r + " ");
        System.out.println();
        System.out.print("The largest column index: ");
        for (int c : cols)
            System.out.print(c + (cols.indexOf(c) == cols.size() - 1 ? "" : " , "));
        System.out.println();
        in.close();
    }
}