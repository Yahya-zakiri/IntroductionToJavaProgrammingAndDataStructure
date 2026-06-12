//Chapter 7
//Programming exercises
//(Find the index of the smallest element)

import java.util.Scanner;

public class IndexOfSmallest {
    public static int indexOfSmallestElement(double[] array) {
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[index])
                index = i;
        }
        return index;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] a = new double[10];
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++)
            a[i] = input.nextDouble();
        System.out.println("The index of the smallest element is " + indexOfSmallestElement(a));
        input.close();
    }
}
