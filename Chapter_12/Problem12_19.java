// Problem12_19
// Chapter 12 - Exercise 12.19
// Count words in Gettysburg address from URL

import java.net.*;
import java.io.*;

public class Problem12_19 {
    public static void main(String[] args) throws Exception {
        URL url = new URL("https://liveexample.pearsoncmg.com/data/Lincoln.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
        int words = 0;
        String line;
        while ((line = br.readLine()) != null) {
            if (!line.trim().isEmpty())
                words += line.trim().split("\\s+").length;
        }
        br.close();
        System.out.println("Words: " + words);
    }
}
