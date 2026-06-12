//Chapter 7
//Programming exercises
//(Revise selection sort - find largest and swap with last)

import java.util.Scanner;

public class ReviseSelectionSort {
    public static void selectionSortDesc(double[] list) {
        for (int last = list.length - 1; last > 0; last--) {
            int maxIndex = 0;
            for (int i = 1; i <= last; i++)
                if (list[i] > list[maxIndex])
                    maxIndex = i;
            double t = list[maxIndex];
            list[maxIndex] = list[last];
            list[last] = t;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] a = new double[10];
        System.out.println("Enter 10 double numbers:");
        for (int i = 0; i < 10; i++)
            a[i] = input.nextDouble();
        selectionSortDesc(a);
        System.out.print("Sorted: ");
        for (double v : a)
            System.out.print(v + " ");
        System.out.println();
        input.close();
    }
}