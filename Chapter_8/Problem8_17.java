// Problem 8.17
// Financial tsunami: find unsafe banks
// Chapter_8

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem8_17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double limit = in.nextDouble();
        double[] balance = new double[n];
        double[][] borrowers = new double[n][n];
        for (int i = 0; i < n; i++) {
            balance[i] = in.nextDouble();
            int k = in.nextInt();
            for (int j = 0; j < k; j++) {
                int borrower = in.nextInt();
                double amount = in.nextDouble();
                borrowers[i][borrower] = amount;
            }
        }

        boolean[] unsafe = new boolean[n];
        boolean changed = true;
        while (changed) {
            changed = false;
            for (int i = 0; i < n; i++) {
                if (unsafe[i])
                    continue;
                double total = balance[i];
                for (int j = 0; j < n; j++)
                    total += borrowers[i][j];
                if (total < limit) {
                    unsafe[i] = true;
                    changed = true;
                    // set loans to this bank to zero
                    for (int lender = 0; lender < n; lender++) {
                        borrowers[lender][i] = 0;
                    }
                }
            }
        }

        List<Integer> unsafeList = new ArrayList<>();
        for (int i = 0; i < n; i++)
            if (unsafe[i])
                unsafeList.add(i);
        System.out.print("Unsafe banks are");
        for (int id : unsafeList)
            System.out.print(" " + id);
        System.out.println();
        in.close();
    }
}
