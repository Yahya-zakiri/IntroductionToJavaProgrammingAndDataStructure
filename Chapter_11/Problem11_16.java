// Problem 11.16
// Addition quiz with repeat-answer detection
// Chapter_11

import java.util.ArrayList;
import java.util.Scanner;

public class Problem11_16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = (int) (Math.random() * 10), b = (int) (Math.random() * 10);
        System.out.println("What is " + a + " + " + b + "?");
        ArrayList<Integer> answers = new ArrayList<>();
        while (true) {
            int ans = in.nextInt();
            if (ans == a + b) {
                System.out.println("You got it!");
                break;
            }
            if (answers.contains(ans)) {
                System.out.println("You already entered " + ans);
            } else {
                System.out.println("Wrong answer. Try again.");
                answers.add(ans);
            }
        }
        in.close();
    }
}