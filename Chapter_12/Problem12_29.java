// Problem12_29
// Chapter 12 - Exercise 12.29
// Rename files Exercisei_j to Exercisei_0j when j single digit (args: file list)

import java.nio.file.*;

public class Problem12_29 {
    public static void main(String[] args) throws Exception {
        for (String a : args) {
            Path p = Paths.get(a);
            String name = p.getFileName().toString();
            java.util.regex.Matcher m = java.util.regex.Pattern.compile("Exercise(\\d+)_(\\d+)").matcher(name);
            if (m.matches()) {
                int j = Integer.parseInt(m.group(2));
                if (j < 10) {
                    String newName = String.format("Exercise%s_%02d", m.group(1), j);
                    Files.move(p, p.resolveSibling(newName));
                }
            }
        }
        System.out.println("Renamed files where applicable.");
    }
}
