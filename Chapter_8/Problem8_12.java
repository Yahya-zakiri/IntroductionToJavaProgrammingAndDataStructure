// Problem 8.12
// Compute tax using arrays
// Chapter_8

import java.util.Scanner;

public class Problem8_12 {
    static double[] rates = { 0.10, 0.15, 0.25, 0.28, 0.33, 0.35 };
    static int[][] brackets = {
            { 8350, 33950, 82250, 171550, 372950 },
            { 16700, 67900, 137050, 208850, 372950 },
            { 8350, 33950, 68525, 104425, 186475 },
            { 11950, 45500, 117450, 190200, 372950 }
    };

    public static double computeTax(int status, double income) {
        double tax = 0;
        int[] b = brackets[status];
        if (income <= b[0])
            return income * rates[0];
        tax += b[0] * rates[0];
        for (int i = 1; i < b.length; i++) {
            if (income <= b[i]) {
                tax += (income - b[i - 1]) * rates[i];
                return tax;
            } else {
                tax += (b[i] - b[i - 1]) * rates[i];
            }
        }
        tax += (income - b[b.length - 1]) * rates[rates.length - 1];
        return tax;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print(
                "Enter filing status (0-single,1-married joint or qualifying widow(er),2-married separate,3-head): ");
        int status = in.nextInt();
        System.out.print("Enter taxable income: ");
        double income = in.nextDouble();
        double tax = computeTax(status, income);
        System.out.printf("Tax is %.2f\n", tax);
        in.close();
    }
}