// Problem12_6
// Chapter 12 - Exercise 12.6
// hex2Dec that throws NumberFormatException for invalid hex strings

import java.util.Scanner;

public class Problem12_6 {
    public static int hex2Dec(String hexString) {
        if (hexString == null || !hexString.matches("[0-9A-Fa-f]+"))
            throw new NumberFormatException("Not a hex number");
        return Integer.parseInt(hexString, 16);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a hex number: ");
        String s = sc.next();
        try {
            int dec = hex2Dec(s);
            System.out.println(dec);
        } catch (NumberFormatException ex) {
            System.out.println("Not a hex number");
        }
    }
}
