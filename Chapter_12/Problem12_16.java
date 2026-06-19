// Problem12_16
// Chapter 12 - Exercise 12.16
// Replace oldString with newString in file (overwrite original)

import java.nio.file.*;
import java.io.IOException;

public class Problem12_16 {
    public static void main(String[] args) throws IOException {
        if (args.length != 3) {
            System.out.println("Usage: java Problem12_16 filename oldString newString");
            return;
        }
        Path path = Paths.get(args[0]);
        String oldS = args[1];
        String newS = args[2];
        String content = new String(Files.readAllBytes(path));
        content = content.replace(oldS, newS);
        Files.write(path, content.getBytes());
        System.out.println("Replaced in " + path);
    }
}
