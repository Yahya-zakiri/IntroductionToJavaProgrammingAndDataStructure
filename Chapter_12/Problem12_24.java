// Problem12_24
// Chapter 12 - Exercise 12.24
// Create Salary.txt with 1000 lines of synthetic data

import java.nio.file.*;
import java.io.IOException;
import java.util.*;
import java.text.DecimalFormat;

public class Problem12_24 {
    public static void main(String[] args) throws IOException {
        Random r = new Random();
        String[] ranks = { "assistant", "associate", "full" };
        DecimalFormat df = new DecimalFormat("0.00");
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 1000; i++) {
            String first = "FirstName" + i, last = "LastName" + i;
            String rank = ranks[r.nextInt(ranks.length)];
            double sal;
            switch (rank) {
                case "assistant":
                    sal = 50000 + r.nextDouble() * 30000;
                    break;
                case "associate":
                    sal = 60000 + r.nextDouble() * 50000;
                    break;
                default:
                    sal = 75000 + r.nextDouble() * 55000;
                    break;
            }
            sb.append(first).append(' ').append(last).append(' ').append(rank).append(' ').append(df.format(sal))
                    .append('\n');
        }
        Files.write(Paths.get("Salary.txt"), sb.toString().getBytes());
        System.out.println("Created Salary.txt");
    }
}
