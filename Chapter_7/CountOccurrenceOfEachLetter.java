//Chapter 7
//Case Study 7.8
//Listing 7.4

import java.util.Random;

public class CountOccurrenceOfEachLetter {

    public static void main(String[] args) {
        char[] chars = new char[100];
        for (int i = 0; i < chars.length; i++) {
            chars[i] = getRandomLowerCaseLetter();
        }

        int[] counts = new int[26];
        for (int i = 0; i < chars.length; i++) {
            counts[chars[i] - 'a']++;
        }

        System.out.println("The generated lowercase letters are:");
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i] + " ");
            if ((i + 1) % 20 == 0) {
                System.out.println();
            }
        }

        System.out.println("\nLetter counts:");
        for (int i = 0; i < counts.length; i++) {
            char letter = (char) ('a' + i);
            System.out.print(letter + ": " + counts[i] + "\t");
            if ((i + 1) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    public static char getRandomLowerCaseLetter() {
        Random random = new Random();
        return (char) ('a' + random.nextInt(26));
    }
}
