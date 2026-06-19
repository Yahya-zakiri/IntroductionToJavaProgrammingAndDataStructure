// Problem12_21
// Chapter 12 - Exercise 12.21
// Check if strings in SortedStrings.txt are in increasing order

import java.nio.file.*;
import java.io.IOException;
import java.util.List;

public class Problem12_21 {
    public static void main(String[] args) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get("SortedStrings.txt"));
        for (int i = 1; i < lines.size(); i++) {
            if (lines.get(i - 1).compareTo(lines.get(i)) > 0) {
                System.out.println("Not sorted. Out of order: " + lines.get(i - 1) + " and " + lines.get(i));
                return;
            }
        }
        System.out.println("The file is sorted.");
    }
}
