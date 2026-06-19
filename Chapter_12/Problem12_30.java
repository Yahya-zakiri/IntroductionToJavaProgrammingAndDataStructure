// Problem12_30
// Chapter 12 - Exercise 12.30
// Count occurrences of each letter in a file (case-insensitive)

import java.nio.file.*;
import java.io.IOException;

public class Problem12_30 {
    public static void main(String[] args) throws IOException {
        if (args.length != 1) {
            System.out.println("Usage: java Problem12_30 filename");
            return;
        }
        String content = new String(Files.readAllBytes(Paths.get(args[0]))).toLowerCase();
        int[] counts = new int[26];
        for (char c : content.toCharArray())
            if (c >= 'a' && c <= 'z')
                counts[c - 'a']++;
        for (int i = 0; i < 26; i++)
            System.out.println("Number of " + (char) ('A' + i) + "s: " + counts[i]);
    }
}
