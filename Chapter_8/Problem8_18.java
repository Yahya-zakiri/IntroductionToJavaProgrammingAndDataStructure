// Problem 8.18
// Shuffle rows
// Chapter_8

import java.util.Random;
import java.util.Arrays;

public class Problem8_18 {
    public static void shuffle(int[][] m) {
        Random rnd = new Random();
        for (int i = m.length - 1; i > 0; i--) {
            int j = rnd.nextInt(i + 1);
            int[] tmp = m[i];
            m[i] = m[j];
            m[j] = tmp;
        }
    }

    public static void main(String[] args) {
        int[][] m = { { 1, 2 }, { 3, 4 }, { 5, 6 }, { 7, 8 }, { 9, 10 } };
        shuffle(m);
        for (int i = 0; i < m.length; i++)
            System.out.println(Arrays.toString(m[i]));
    }
}