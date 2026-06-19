// Problem12_31
// Chapter 12 - Exercise 12.31
// Find ranking for a name and year by reading web file for that year

import java.net.*;
import java.io.*;
import java.util.*;

public class Problem12_31 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the year: ");
        int year = Integer.parseInt(br.readLine().trim());
        System.out.print("Enter the gender (M/F): ");
        String gender = br.readLine().trim();
        System.out.print("Enter the name: ");
        String name = br.readLine().trim();
        String url = "http://liveexample.pearsoncmg.com/data/babynameranking" + year + ".txt";
        BufferedReader r = new BufferedReader(new InputStreamReader(new URL(url).openStream()));
        String line;
        boolean found = false;
        while ((line = r.readLine()) != null) {
            if (line.trim().isEmpty())
                continue;
            // format: rank boyName boyCount girlName girlCount
            String[] t = line.trim().split("\\s+");
            String rank = t[0];
            String boy = t[1];
            String girl = t[3];
            if (gender.equalsIgnoreCase("M") && boy.equalsIgnoreCase(name)) {
                System.out.println(name + " is ranked #" + rank + " in year " + year);
                found = true;
                break;
            }
            if (gender.equalsIgnoreCase("F") && girl.equalsIgnoreCase(name)) {
                System.out.println(name + " is ranked #" + rank + " in year " + year);
                found = true;
                break;
            }
        }
        if (!found)
            System.out.println("The name " + name + " is not ranked in year " + year);
    }
}
