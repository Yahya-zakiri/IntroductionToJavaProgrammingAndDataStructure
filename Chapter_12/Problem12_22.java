// Problem12_22
// Chapter 12 - Exercise 12.22
// Replace oldString with newString for all files in specified directory

import java.nio.file.*;
import java.io.IOException;

public class Problem12_22 {
    public static void main(String[] args) throws IOException {
        if (args.length != 3) {
            System.out.println("Usage: java Problem12_22 dir oldString newString");
            return;
        }
        Path dir = Paths.get(args[0]);
        String oldS = args[1], newS = args[2];
        Files.walk(dir)
                .filter(Files::isRegularFile)
                .forEach(p -> {
                    try {
                        String c = new String(Files.readAllBytes(p));
                        c = c.replace(oldS, newS);
                        Files.write(p, c.getBytes());
                    } catch (Exception ex) {
                    }
                });
        System.out.println("Replaced in directory " + dir);
    }
}
