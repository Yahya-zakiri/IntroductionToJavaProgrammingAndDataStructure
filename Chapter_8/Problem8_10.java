// Problem 8.10
// Largest row and column of 1s
// Chapter_8

import java.util.Random;

public class Problem8_10 {
    public static void main(String[] args) {
        int[][] m = new int[4][4];
        Random rnd = new Random();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                m[i][j] = rnd.nextBoolean() ? 1 : 0;
                System.out.print(m[i][j]);
            }
            System.out.println();
        }

        int maxRow = 0, maxRowCount = -1;
        for (int i = 0; i < 4; i++) {
            int cnt = 0;
            for (int j = 0; j < 4; j++)
                cnt += m[i][j];
            if (cnt > maxRowCount) {
                maxRowCount = cnt;
                maxRow = i;
            }
        }

        int maxCol = 0, maxColCount = -1;
        for (int j = 0; j < 4; j++) {
            int cnt = 0;
            for (int i = 0; i < 4; i++)
                cnt += m[i][j];
            if (cnt > maxColCount) {
                maxColCount = cnt;
                maxCol = j;
            }
        }

        System.out.println("The largest row index: " + maxRow);
        System.out.println("The largest column index: " + maxCol);
    }
}