// Problem12_2
// Chapter 12 - Exercise 12.2
// Read two integers and prompt again if input incorrect

import java.util.Scanner;

public class Problem12_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = readInt(sc, "Enter first integer: ");
        int b = readInt(sc, "Enter second integer: ");
        System.out.println("Sum is " + (a + b));
    }

    private static int readInt(Scanner sc, String prompt) {
        while (true) {
            System.out.print(prompt);
            if (sc.hasNextInt()) {
                int v = sc.nextInt();
                sc.nextLine();
                return v;
            } else {
                sc.nextLine();
                System.out.println("Invalid input. Please enter an integer.");
            }
        }
    }
}
