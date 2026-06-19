// Problem12_14
// Chapter 12 - Exercise 12.14
// Read scores from a file and display total and average

import java.nio.file.*;
import java.io.IOException;
import java.util.Scanner;

public class Problem12_14 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter filename: ");
        String filename = sc.nextLine();
        String content = new String(Files.readAllBytes(Paths.get(filename)));
        String[] tokens = content.trim().split("\\s+");
        double sum = 0;
        int count = 0;
        for (String t : tokens) {
            if (t.isEmpty())
                continue;
            sum += Double.parseDouble(t);
            count++;
        }
        System.out.println("Total = " + sum);
        System.out.println("Average = " + (count > 0 ? sum / count : 0));
    }
}
