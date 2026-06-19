// Problem12_28
// Chapter 12 - Exercise 12.28
// Rename files Exercisei_j to Exercise0i_j when i single digit (args: file list)

import java.nio.file.*;

public class Problem12_28 {
    public static void main(String[] args) throws Exception {
        for (String a : args) {
            Path p = Paths.get(a);
            String name = p.getFileName().toString();
            java.util.regex.Matcher m = java.util.regex.Pattern.compile("Exercise(\\d+)_(\\d+)").matcher(name);
            if (m.matches()) {
                int i = Integer.parseInt(m.group(1));
                if (i < 10) {
                    String newName = String.format("Exercise%02d_%s", i, m.group(2));
                    Files.move(p, p.resolveSibling(newName));
                }
            }
        }
        System.out.println("Renamed files where applicable.");
    }
}
