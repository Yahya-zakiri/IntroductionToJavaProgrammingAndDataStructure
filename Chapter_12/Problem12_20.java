// Problem12_20
// Chapter 12 - Exercise 12.20
// Remove package statement from Java files under chapteri directories

import java.nio.file.*;
import java.io.IOException;

public class Problem12_20 {
    public static void main(String[] args) throws IOException {
        if (args.length != 1) {
            System.out.println("Usage: java Problem12_20 srcRootDirectory");
            return;
        }
        Path root = Paths.get(args[0]);
        Files.walk(root)
                .filter(p -> p.toString().endsWith(".java"))
                .forEach(p -> {
                    try {
                        String content = new String(Files.readAllBytes(p));
                        if (content.startsWith("package ")) {
                            int nl = content.indexOf('\n');
                            String rest = nl >= 0 ? content.substring(nl + 1) : "";
                            Files.write(p, rest.getBytes());
                        }
                    } catch (Exception e) {
                    }
                });
        System.out.println("Removed package statements where present.");
    }
}
