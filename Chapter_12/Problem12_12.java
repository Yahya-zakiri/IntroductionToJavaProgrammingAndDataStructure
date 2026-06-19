// Problem12_12
// Chapter 12 - Exercise 12.12
// Convert next-line brace style to end-of-line brace style for a Java file

import java.nio.file.*;
import java.io.IOException;

public class Problem12_12 {
    public static void main(String[] args) throws IOException {
        if (args.length != 1) {
            System.out.println("Usage: java Problem12_12 filename");
            return;
        }
        Path path = Paths.get(args[0]);
        String[] lines = new String(Files.readAllBytes(path)).split("\n");
        StringBuilder out = new StringBuilder();
        for (int i = 0; i < lines.length; i++) {
            String line = lines[i];
            String trimmed = line.trim();
            if (trimmed.equals("{") && out.length() > 0) {
                // move brace to previous line
                int last = out.lastIndexOf("\n");
                if (last >= 0) {
                    String prev = out.substring(last + 1);
                    out.setLength(last + 1);
                    out.append(prev).append(" {").append('\n');
                    continue;
                }
            }
            out.append(line).append('\n');
        }
        Files.write(path, out.toString().getBytes());
        System.out.println("Converted brace style for " + path);
    }
}
