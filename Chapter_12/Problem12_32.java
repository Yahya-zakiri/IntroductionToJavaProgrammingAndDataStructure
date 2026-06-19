// Problem12_32
// Chapter 12 - Exercise 12.32
// Display ranking summary table for first five boy and girl names for 2001-2010

import java.net.*;
import java.io.*;
import java.util.*;

public class Problem12_32 {
    public static void main(String[] args) throws Exception {
        Map<Integer, List<String>> topGirls = new TreeMap<>();
        Map<Integer, List<String>> topBoys = new TreeMap<>();
        for (int year = 2010; year >= 2001; year--) {
            BufferedReader r = new BufferedReader(new InputStreamReader(
                    new URL("http://liveexample.pearsoncmg.com/data/babynamesranking" + year + ".txt").openStream()));
            List<String> girls = new ArrayList<>(), boys = new ArrayList<>();
            String line;
            int count = 0;
            while ((line = r.readLine()) != null && count < 5) {
                if (line.trim().isEmpty())
                    continue;
                String[] t = line.trim().split("\\s+");
                boys.add(t[1]);
                girls.add(t[3]);
                count++;
            }
            topBoys.put(year, boys);
            topGirls.put(year, girls);
        }
        System.out.println("Girls Rank summary (Rank 1..5 by year 2010..2001):");
        for (int rank = 1; rank <= 5; rank++) {
            System.out.println("Rank " + rank);
            for (int year = 2010; year >= 2001; year--)
                System.out.println(topGirls.get(year).get(rank - 1));
        }
        System.out.println("Boys Rank summary:");
        for (int rank = 1; rank <= 5; rank++) {
            System.out.println("Rank " + rank);
            for (int year = 2010; year >= 2001; year--)
                System.out.println(topBoys.get(year).get(rank - 1));
        }
    }
}
