// Problem 8.11
// Nine heads and tails
// Chapter_8

import java.util.Scanner;

public class Problem8_11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 511: ");
        int num = in.nextInt();
        if (num < 0)
            num = 0;
        if (num > 511)
            num = 511;
        char[][] m = new char[3][3];
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                int pos = r * 3 + c; // 0..8
                int bit = (num >> (8 - pos)) & 1;
                m[r][c] = (bit == 0) ? 'H' : 'T';
            }
        }
        for (int i = 0; i < 3; i++) {
            System.out.printf("%c %c %c\n", m[i][0], m[i][1], m[i][2]);
        }
        in.close();
    }
}