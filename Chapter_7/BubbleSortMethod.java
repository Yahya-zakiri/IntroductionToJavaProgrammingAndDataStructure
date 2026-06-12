//Chapter 7
//Programming exercises
//(Bubble sort)

import java.util.Scanner;

public class BubbleSortMethod {
    public static void bubbleSort(double[] list) {
        for (int pass = 0; pass < list.length - 1; pass++) {
            for (int i = 0; i < list.length - 1 - pass; i++) {
                if (list[i] > list[i + 1]) {
                    double t = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = t;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] a = new double[10];
        System.out.println("Enter 10 double numbers:");
        for (int i = 0; i < 10; i++)
            a[i] = input.nextDouble();
        bubbleSort(a);
        System.out.print("Sorted: ");
        for (double v : a)
            System.out.print(v + " ");
        System.out.println();
        input.close();
    }
}