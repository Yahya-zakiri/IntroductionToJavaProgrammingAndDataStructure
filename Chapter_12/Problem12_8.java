// Problem12_8
// Chapter 12 - Exercise 12.8
// Define HexFormatException and hex2Dec that throws it

import java.util.Scanner;

class HexFormatException extends Exception {
    public HexFormatException(String msg) {
        super(msg);
    }
}

public class Problem12_8 {
    public static int hex2Dec(String hexString) throws HexFormatException {
        if (hexString == null || !hexString.matches("[0-9A-Fa-f]+"))
            throw new HexFormatException("Not a hex number");
        return Integer.parseInt(hexString, 16);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a hex number: ");
        String s = sc.next();
        try {
            System.out.println(hex2Dec(s));
        } catch (HexFormatException ex) {
            System.out.println("Not a hex number");
        }
    }
}
