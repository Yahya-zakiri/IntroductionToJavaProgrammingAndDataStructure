// Problem 8.24
// Check Sudoku solution
// Chapter_8

import java.util.Scanner;

public class Problem8_24 {
    public static boolean validGroup(int[] g) {
        boolean[] seen = new boolean[10];
        for (int v : g) {
            if (v < 1 || v > 9 || seen[v])
                return false;
            seen[v] = true;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] m = new int[9][9];
        for (int i = 0; i < 9; i++)
            for (int j = 0; j < 9; j++)
                m[i][j] = in.nextInt();
        boolean valid = true;
        for (int i = 0; i < 9; i++) {
            int[] row = new int[9];
            for (int j = 0; j < 9; j++)
                row[j] = m[i][j];
            if (!validGroup(row))
                valid = false;
        }
        for (int j = 0; j < 9; j++) {
            int[] col = new int[9];
            for (int i = 0; i < 9; i++)
                col[i] = m[i][j];
            if (!validGroup(col))
                valid = false;
        }
        for (int bi = 0; bi < 3; bi++)
            for (int bj = 0; bj < 3; bj++) {
                int[] box = new int[9];
                int idx = 0;
                for (int i = 0; i < 3; i++)
                    for (int j = 0; j < 3; j++)
                        box[idx++] = m[bi * 3 + i][bj * 3 + j];
                if (!validGroup(box))
                    valid = false;
            }
        System.out.println(valid ? "Valid solution" : "Invalid solution");
        in.close();
    }
}