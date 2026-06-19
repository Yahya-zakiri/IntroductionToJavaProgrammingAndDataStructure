// Problem12_7
// Chapter 12 - Exercise 12.7
// bin2Dec that throws NumberFormatException for invalid binary strings

import java.util.Scanner;

public class Problem12_7 {
    public static int bin2Dec(String binaryString) {
        if (binaryString == null || !binaryString.matches("[01]+"))
            throw new NumberFormatException("Not a binary number");
        return Integer.parseInt(binaryString, 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String s = sc.next();
        try {
            int dec = bin2Dec(s);
            System.out.println(dec);
        } catch (NumberFormatException ex) {
            System.out.println("Not a binary number");
        }
    }
}
