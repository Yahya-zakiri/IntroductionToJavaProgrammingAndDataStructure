// Problem 8.4
// Compute weekly hours for each employee (decreasing order)
// Chapter_8

import java.util.Arrays;

public class EmployeeWeeklyHours {
    public static void main(String[] args) {
        int[][] hours = {
                { 2, 4, 3, 4, 5, 8, 8 },
                { 7, 3, 4, 3, 3, 4, 4 },
                { 2, 3, 3, 4, 3, 3, 2 },
                { 9, 3, 4, 7, 3, 4, 1 },
                { 3, 5, 4, 3, 6, 3, 8 },
                { 5, 4, 4, 6, 3, 4, 4 },
                { 6, 3, 7, 4, 8, 3, 4 },
                { 6, 3, 5, 9, 2, 7, 9 }
        };

        int n = hours.length;
        int[] totals = new int[n];
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < hours[i].length; j++)
                sum += hours[i][j];
            totals[i] = sum;
        }

        Integer[] indices = new Integer[n];
        for (int i = 0; i < n; i++)
            indices[i] = i;

        Arrays.sort(indices, (a, b) -> Integer.compare(totals[b], totals[a]));

        for (int idx : indices) {
            System.out.println("Employee " + idx + ": " + totals[idx]);
        }
    }
}
