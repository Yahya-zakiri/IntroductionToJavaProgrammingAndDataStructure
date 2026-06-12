//Chapter 7
//Programming exercises
//(Game: bean machine)

import java.util.Random;
import java.util.Scanner;

public class BeanMachine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Enter the number of balls to drop: ");
        int balls = input.nextInt();
        System.out.print("Enter the number of slots in the bean machine: ");
        int slots = input.nextInt();
        int[] slotCounts = new int[slots];
        for (int b = 0; b < balls; b++) {
            StringBuilder path = new StringBuilder();
            int rights = 0;
            for (int i = 0; i < slots - 1; i++) {
                if (rand.nextBoolean()) {
                    path.append('R');
                    rights++;
                } else
                    path.append('L');
            }
            System.out.println(path.toString());
            slotCounts[rights]++;
        }
        int max = 0;
        for (int c : slotCounts)
            if (c > max)
                max = c;
        for (int level = max; level > 0; level--) {
            for (int i = 0; i < slots; i++)
                System.out.print(slotCounts[i] >= level ? "O" : " ");
            System.out.println();
        }
        input.close();
    }
}