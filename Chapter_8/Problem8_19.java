// Problem 8.19
// Four consecutive equal numbers
// Chapter_8

import java.util.Scanner;

public class Problem8_19 {
    public static boolean isConsecutiveFour(int[][] v) {
        int r = v.length, c = v[0].length;
        for (int i = 0; i < r; i++)
            for (int j = 0; j <= c - 4; j++)
                if (v[i][j] == v[i][j + 1] && v[i][j] == v[i][j + 2] && v[i][j] == v[i][j + 3])
                    return true;
        for (int i = 0; i <= r - 4; i++)
            for (int j = 0; j < c; j++)
                if (v[i][j] == v[i + 1][j] && v[i][j] == v[i + 2][j] && v[i][j] == v[i + 3][j])
                    return true;
        for (int i = 0; i <= r - 4; i++)
            for (int j = 0; j <= c - 4; j++)
                if (v[i][j] == v[i + 1][j + 1] && v[i][j] == v[i + 2][j + 2] && v[i][j] == v[i + 3][j + 3])
                    return true;
        for (int i = 0; i <= r - 4; i++)
            for (int j = 3; j < c; j++)
                if (v[i][j] == v[i + 1][j - 1] && v[i][j] == v[i + 2][j - 2] && v[i][j] == v[i + 3][j - 3])
                    return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int rows = in.nextInt();
        int cols = in.nextInt();
        int[][] m = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                m[i][j] = in.nextInt();
        System.out.println(isConsecutiveFour(m));
        in.close();
    }
}