//Chapter 7
//Programming exercises
//(Find the smallest element)

import java.util.Scanner;

public class MinElement {
    public static double min(double[] array) {
        double m = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < m)
                m = array[i];
        }
        return m;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] a = new double[10];
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++)
            a[i] = input.nextDouble();
        System.out.println("The minimum number is " + min(a));
        input.close();
    }
}
