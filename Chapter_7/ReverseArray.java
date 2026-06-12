//Chapter 7
//Programming exercises
//(Reverse an array)

import java.util.Scanner;

public class ReverseArray {
    public static double[] reverse(double[] array) {
        int n = array.length;
        for (int i = 0; i < n / 2; i++) {
            double temp = array[i];
            array[i] = array[n - 1 - i];
            array[n - 1 - i] = temp;
        }
        return array;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] a = new double[10];
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++)
            a[i] = input.nextDouble();
        reverse(a);
        System.out.print("The reversed numbers are: ");
        for (double v : a)
            System.out.print(v + " ");
        System.out.println();
        input.close();
    }
}