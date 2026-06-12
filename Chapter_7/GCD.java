//Chapter 7
//Programming exercises
//(Compute gcd)

import java.util.Scanner;

public class GCD {
    public static int gcdTwo(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int t = a % b;
            a = b;
            b = t;
        }
        return a;
    }

    public static int gcd(int... numbers) {
        if (numbers.length == 0)
            return 0;
        int g = numbers[0];
        for (int i = 1; i < numbers.length; i++)
            g = gcdTwo(g, numbers[i]);
        return Math.abs(g);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter five integers:");
        int[] a = new int[5];
        for (int i = 0; i < 5; i++)
            a[i] = input.nextInt();
        System.out.println("GCD is " + gcd(a));
        input.close();
    }
}