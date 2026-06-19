// Problem12_17
// Chapter 12 - Exercise 12.17
// Hangman game reading words from hangman.txt (words delimited by spaces)

import java.nio.file.*;
import java.io.IOException;
import java.util.*;

public class Problem12_17 {
    public static void main(String[] args) throws IOException {
        List<String> words = Arrays.asList(new String(Files.readAllBytes(Paths.get("hangman.txt"))).split("\\s+"));
        Random r = new Random();
        String word = words.get(r.nextInt(words.size())).toLowerCase();
        char[] mask = new char[word.length()];
        Arrays.fill(mask, '*');
        Scanner sc = new Scanner(System.in);
        int misses = 0;
        while (misses < 6 && new String(mask).contains("*")) {
            System.out.println("Word: " + new String(mask));
            System.out.print("Guess a letter: ");
            String g = sc.next().toLowerCase();
            char c = g.charAt(0);
            if (word.indexOf(c) >= 0) {
                for (int i = 0; i < word.length(); i++)
                    if (word.charAt(i) == c)
                        mask[i] = c;
            } else
                misses++;
        }
        System.out.println(new String(mask).contains("*") ? "You lose. Word: " + word : "You win! " + word);
    }
}
