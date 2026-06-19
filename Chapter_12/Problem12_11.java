// Problem12_11
// Chapter 12 - Exercise 12.11
// Remove all occurrences of a specified string from a file (args: target filename)

import java.nio.file.*;
import java.io.IOException;

public class Problem12_11 {
    public static void main(String[] args) throws IOException {
        if (args.length != 2) {
            System.out.println("Usage: java Problem12_11 targetString filename");
            return;
        }
        String target = args[0];
        Path path = Paths.get(args[1]);
        String content = new String(Files.readAllBytes(path));
        content = content.replace(target, "");
        Files.write(path, content.getBytes());
        System.out.println("Removed occurrences of '" + target + "' in " + path);
    }
}
