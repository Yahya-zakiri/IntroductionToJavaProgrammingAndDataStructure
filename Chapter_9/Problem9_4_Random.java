// Problem 9.4
// Random class usage
// Chapter_9

import java.util.Random;

public class Problem9_4_Random {
    public static void main(String[] args) {
        Random rnd = new Random(1000);
        for (int i = 0; i < 50; i++)
            System.out.println(rnd.nextInt(100));
    }
}