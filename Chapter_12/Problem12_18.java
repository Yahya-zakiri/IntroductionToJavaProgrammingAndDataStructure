// Problem12_18
// Chapter 12 - Exercise 12.18
// Insert package chapteri; as first line for each Java file under chapteri directories

import java.nio.file.*;
import java.io.IOException;
import java.util.stream.*;

public class Problem12_18 {
    public static void main(String[] args) throws IOException {
        if (args.length != 1) {
            System.out.println("Usage: java Problem12_18 srcRootDirectory");
            return;
        }
        Path root = Paths.get(args[0]);
        Files.walk(root)
                .filter(p -> p.toString().endsWith(".java"))
                .forEach(p -> {
                    try {
                        Path parent = p.getParent();
                        if (parent == null)
                            return;
                        String dirName = parent.getFileName().toString();
                        String content = new String(Files.readAllBytes(p));
                        String pkg = "package " + dirName + ";\n";
                        if (!content.startsWith("package "))
                            Files.write(p, (pkg + content).getBytes());
                    } catch (Exception e) {
                    }
                });
        System.out.println("Inserted package statements where applicable.");
    }
}
