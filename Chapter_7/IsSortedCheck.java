//Chapter 7
//Programming exercises
//(Sorted?)

import java.util.Scanner;

public class IsSortedCheck {
    public static boolean isSorted(int[] list) {
        for (int i = 1; i < list.length; i++)
            if (list[i] < list[i - 1])
                return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the list: ");
        int n = input.nextInt();
        int[] a = new int[n];
        System.out.print("Enter the contents of the list: ");
        for (int i = 0; i < n; i++)
            a[i] = input.nextInt();
        System.out.print("The list has " + n + " integers ");
        for (int v : a)
            System.out.print(v + " ");
        System.out.println();
        System.out.println(isSorted(a) ? "The list is already sorted" : "The list is not sorted");
        input.close();
    }
}