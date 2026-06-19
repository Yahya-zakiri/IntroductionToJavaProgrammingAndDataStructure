// Problem12_13
// Chapter 12 - Exercise 12.13
// Count characters, words, and lines in a file (arg: filename)

import java.nio.file.*;
import java.io.IOException;

public class Problem12_13 {
    public static void main(String[] args) throws IOException {
        if (args.length != 1) {
            System.out.println("Usage: java Problem12_13 filename");
            return;
        }
        String content = new String(Files.readAllBytes(Paths.get(args[0])));
        int chars = content.length();
        String[] words = content.trim().isEmpty() ? new String[0] : content.split("\\s+");
        int lines = content.split("\r?\n").length;
        System.out.println("Characters: " + chars);
        System.out.println("Words: " + words.length);
        System.out.println("Lines: " + lines);
    }
}
