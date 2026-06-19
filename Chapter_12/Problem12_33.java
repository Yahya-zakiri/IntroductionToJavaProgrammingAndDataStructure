// Problem12_33
// Chapter 12 - Exercise 12.33
// Web crawler that searches for a word starting from a URL and stops when found

import java.net.*;
import java.io.*;
import java.util.*;

public class Problem12_33 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter search word: "); String word = br.readLine().trim().toLowerCase();
        System.out.print("Enter starting URL: "); String start = br.readLine().trim();
        Set<String> visited = new HashSet<>();
        Queue<String> queue = new LinkedList<>();
        queue.add(start); visited.add(start);
        while (!queue.isEmpty()) {
            String url = queue.poll();
            try {
                BufferedReader r = new BufferedReader(new InputStreamReader(new URL(url).openStream()));
                String line; StringBuilder page = new StringBuilder();
                while ((line = r.readLine()) != null) page.append(line).append(' ');
                String txt = page.toString().toLowerCase();
                if (txt.contains(word)) { System.out.println("Found at: " + url); return; }
                // find links
                java.util.regex.Matcher m = java.util.regex.Pattern.compile("href=\\\"(http[^"]+)\\\"").matcher(page);
                while (m.find()) {
                    String link = m.group(1);
                    if (!visited.contains(link)) { visited.add(link); queue.add(link); }
                }
            } catch (Exception e) { /* ignore */ }
        }
        System.out.println("Word not found.");
    }
}
