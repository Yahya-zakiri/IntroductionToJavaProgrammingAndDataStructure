// Problem12_23
// Chapter 12 - Exercise 12.23
// Read scores from web URL and display total and average

import java.net.*;
import java.io.*;

public class Problem12_23 {
    public static void main(String[] args) throws Exception {
        URL url = new URL("http://liveexample.pearsoncmg.com/data/Scores.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
        String line;
        double sum = 0;
        int count = 0;
        while ((line = br.readLine()) != null) {
            for (String t : line.trim().split("\\s+"))
                if (!t.isEmpty()) {
                    sum += Double.parseDouble(t);
                    count++;
                }
        }
        br.close();
        System.out.println("Total = " + sum);
        System.out.println("Average = " + (count > 0 ? sum / count : 0));
    }
}
