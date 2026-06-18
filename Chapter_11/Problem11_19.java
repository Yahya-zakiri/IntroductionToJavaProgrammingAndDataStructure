// Problem 11.19
// Bin packing first-fit
// Chapter_11

import java.util.ArrayList;
import java.util.Scanner;

public class Problem11_19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of objects: ");
        int n = in.nextInt();
        System.out.print("Enter the weights of the objects: ");
        int[] w = new int[n];
        for (int i = 0; i < n; i++)
            w[i] = in.nextInt();
        ArrayList<ArrayList<Integer>> bins = new ArrayList<>();
        ArrayList<Integer> sums = new ArrayList<>();
        for (int weight : w) {
            boolean placed = false;
            for (int i = 0; i < bins.size(); i++) {
                if (sums.get(i) + weight <= 10) {
                    bins.get(i).add(weight);
                    sums.set(i, sums.get(i) + weight);
                    placed = true;
                    break;
                }
            }
            if (!placed) {
                ArrayList<Integer> bin = new ArrayList<>();
                bin.add(weight);
                bins.add(bin);
                sums.add(weight);
            }
        }
        for (int i = 0; i < bins.size(); i++) {
            System.out.print("Container " + (i + 1) + " contains objects with weight ");
            for (int v : bins.get(i))
                System.out.print(v + " ");
            System.out.println();
        }
        in.close();
    }
}