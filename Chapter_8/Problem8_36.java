// Problem 8.36
// Latin square
// Chapter_8

import java.util.Scanner;

public class Problem8_36 {
    public static boolean isLatin(char[][] a, int n) {
        char start = 'A';
        for (int i = 0; i < n; i++) {
            boolean[] seen = new boolean[n];
            for (int j = 0; j < n; j++) {
                char ch = a[i][j];
                if (ch < start || ch >= start + n)
                    return false;
                int idx = ch - start;
                if (seen[idx])
                    return false;
                seen[idx] = true;
            }
        }
        for (int j = 0; j < n; j++) {
            boolean[] seen = new boolean[n];
            for (int i = 0; i < n; i++) {
                char ch = a[i][j];
                int idx = ch - start;
                if (seen[idx])
                    return false;
                seen[idx] = true;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number n: ");
        int n = in.nextInt();
        System.out.println("Enter " + n + " rows of letters separated by spaces:");
        char[][] a = new char[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                a[i][j] = in.next().charAt(0);

        char start = 'A';
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                if (a[i][j] < start || a[i][j] >= start + n) {
                    System.out.println("Wrong input: the letters must be from A to " + (char) (start + n - 1));
                    in.close();
                    return;
                }
        System.out
                .println(isLatin(a, n) ? "The input array is a Latin square" : "The input array is not a Latin square");
        in.close();
    }
}
