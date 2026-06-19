// Problem12_27
// Chapter 12 - Exercise 12.27
// Replace Exercisei_j with padded Exerciseii_jj in all files provided by * args

import java.nio.file.*;
import java.io.IOException;
import java.util.regex.*;

public class Problem12_27 {
    public static void main(String[] args) throws IOException {
        for (String a : args) {
            Path p = Paths.get(a);
            String c = new String(Files.readAllBytes(p));
            String updated = c.replaceAll("Exercise(\\d+)_(\\d+)", m -> {
                int i = Integer.parseInt(m.group(1));
                int j = Integer.parseInt(m.group(2));
                return String.format("Exercise%02d_%02d", i, j);
            });
            Files.write(p, updated.getBytes());
        }
        System.out.println("Replaced Exercisei_j patterns in provided files.");
    }
}
