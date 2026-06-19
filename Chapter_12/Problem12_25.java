// Problem12_25
// Chapter 12 - Exercise 12.25
// Process Salary.txt from web and compute totals/averages by rank

import java.net.*;
import java.io.*;
import java.util.*;

public class Problem12_25 {
    public static void main(String[] args) throws Exception {
        URL url = new URL("http://liveexample.pearsoncmg.com/data/Salary.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
        String line;
        double total = 0;
        int count = 0;
        Map<String, Double> sum = new HashMap<>();
        Map<String, Integer> cnt = new HashMap<>();
        while ((line = br.readLine()) != null && !line.trim().isEmpty()) {
            String[] t = line.split("\\s+");
            String rank = t[2];
            double sal = Double.parseDouble(t[3]);
            sum.put(rank, sum.getOrDefault(rank, 0.0) + sal);
            cnt.put(rank, cnt.getOrDefault(rank, 0) + 1);
            total += sal;
            count++;
        }
        br.close();
        for (String rk : Arrays.asList("assistant", "associate", "full")) {
            double s = sum.getOrDefault(rk, 0.0);
            int c = cnt.getOrDefault(rk, 0);
            System.out.println(rk + " total=" + s + " avg=" + (c > 0 ? s / c : 0));
        }
        System.out.println("Faculty total=" + total + " avg=" + (count > 0 ? total / count : 0));
    }
}
