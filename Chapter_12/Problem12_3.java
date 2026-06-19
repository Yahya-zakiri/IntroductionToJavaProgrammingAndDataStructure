// Problem12_3
// Chapter 12 - Exercise 12.3
// Array of 100 random integers; prompt for index and show element or Out of Bounds

import java.util.Random;
import java.util.Scanner;

public class Problem12_3 {
    public static void main(String[] args) {
        int[] array = new int[100];
        Random r = new Random();
        for (int i = 0; i < array.length; i++)
            array[i] = r.nextInt(1000);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an index: ");
        int idx = -1;
        if (sc.hasNextInt())
            idx = sc.nextInt();
        if (idx < 0 || idx >= array.length)
            System.out.println("Out of Bounds");
        else
            System.out.println("Value at index " + idx + " is " + array[idx]);
    }
}
