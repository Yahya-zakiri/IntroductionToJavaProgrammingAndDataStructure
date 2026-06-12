//Chapter 7
//Programming exercises
//(Statistics: compute deviation)

import java.util.Scanner;

public class StatisticsDeviation {
    public static double mean(double[] x) {
        double sum = 0;
        for (double v : x)
            sum += v;
        return sum / x.length;
    }

    public static double deviation(double[] x) {
        double m = mean(x);
        double sumsq = 0;
        for (double v : x)
            sumsq += (v - m) * (v - m);
        return Math.sqrt(sumsq / (x.length - 1));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] a = new double[10];
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++)
            a[i] = input.nextDouble();
        System.out.printf("The mean is %.2f\n", mean(a));
        System.out.printf("The standard deviation is %.5f\n", deviation(a));
        input.close();
    }
}
