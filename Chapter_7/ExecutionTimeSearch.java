//Chapter 7
//Programming exercises
//(Execution time comparing linear and binary search)

import java.util.Arrays;
import java.util.Random;

public class ExecutionTimeSearch {
    public static int linearSearch(int[] list, int key) {
        for (int i = 0; i < list.length; i++)
            if (list[i] == key)
                return i;
        return -1;
    }

    public static int binarySearch(int[] list, int key) {
        return Arrays.binarySearch(list, key);
    }

    public static void main(String[] args) {
        Random rnd = new Random();
        int[] a = new int[100_000];
        for (int i = 0; i < a.length; i++)
            a[i] = rnd.nextInt();
        int key = a[rnd.nextInt(a.length)];

        long start = System.nanoTime();
        linearSearch(a, key);
        long end = System.nanoTime();
        System.out.println("Linear search time (ns): " + (end - start));

        Arrays.sort(a);
        start = System.nanoTime();
        binarySearch(a, key);
        end = System.nanoTime();
        System.out.println("Binary search time (ns): " + (end - start));
    }
}