// Problem 11.12
// sum(ArrayList<Double>)
// Chapter_11

import java.util.ArrayList;
import java.util.Scanner;

public class Problem11_12 {
    public static double sum(ArrayList<Double> list) {
        double s = 0;
        for (double v : list)
            s += v;
        return s;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Double> list = new ArrayList<>();
        System.out.println("Enter five numbers:");
        for (int i = 0; i < 5; i++)
            list.add(in.nextDouble());
        System.out.println("Sum: " + sum(list));
        in.close();
    }
}