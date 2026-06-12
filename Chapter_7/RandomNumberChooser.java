//Chapter 7
//Programming exercises
//(Random number chooser)

import java.util.Random;

public class RandomNumberChooser {
    private static Random rand = new Random();

    public static int getRandom(int start, int end, int... numbers) {
        if (start > end)
            throw new IllegalArgumentException("start must be <= end");
        java.util.HashSet<Integer> banned = new java.util.HashSet<>();
        for (int n : numbers)
            banned.add(n);
        int range = end - start + 1 - banned.size();
        if (range <= 0)
            throw new IllegalArgumentException("No available numbers in range");
        while (true) {
            int r = rand.nextInt(end - start + 1) + start;
            if (!banned.contains(r))
                return r;
        }
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 45; i++) {
            int r = getRandom(1, 100, 4, 8, 95, 93);
            System.out.printf("%4d", r);
            if (i % 15 == 0)
                System.out.println();
        }
    }
}