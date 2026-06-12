//Chapter 7
//Programming exercises
//7.5

import java.util.Scanner;

public class DistinctNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] distinct = new int[10];
        int count = 0;

        System.out.println("Enter ten numbers:");
        for (int i = 0; i < 10; i++) {
            int n = input.nextInt();
            boolean found = false;
            for (int j = 0; j < count; j++) {
                if (distinct[j] == n) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                distinct[count++] = n;
            }
        }

        System.out.println("The number of distinct numbers is " + count);
        System.out.print("The distinct numbers are: ");
        for (int i = 0; i < count; i++) {
            System.out.print(distinct[i]);
            if (i < count - 1)
                System.out.print(" ");
        }
        System.out.println();
        input.close();
    }
}
