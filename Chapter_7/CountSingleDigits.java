//Chapter 7
//Programming exercises
//(Count single digits)

import java.util.Random;

public class CountSingleDigits {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] counts = new int[10];
        for (int i = 0; i < 100; i++) {
            int n = rand.nextInt(10); // 0-9
            counts[n]++;
        }
        System.out.println("Counts for numbers 0 through 9:");
        for (int i = 0; i < counts.length; i++) {
            System.out.println(i + ": " + counts[i]);
        }
    }
}
