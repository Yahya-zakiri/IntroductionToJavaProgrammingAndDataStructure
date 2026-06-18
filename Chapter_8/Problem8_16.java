// Problem 8.16
// Sort two-dimensional array
// Chapter_8

import java.util.Arrays;
import java.util.Comparator;

public class Problem8_16 {
    public static void sort(int[][] m) {
        Arrays.sort(m, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                if (a[0] != b[0])
                    return Integer.compare(a[0], b[0]);
                return Integer.compare(a[1], b[1]);
            }
        });
    }

    public static void main(String[] args) {
        int[][] m = { { 4, 2 }, { 1, 7 }, { 4, 5 }, { 1, 2 }, { 1, 1 }, { 4, 1 } };
        sort(m);
        for (int[] row : m)
            System.out.println("{" + row[0] + ", " + row[1] + "}");
    }
}
