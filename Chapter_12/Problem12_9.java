// Problem12_9
// Chapter 12 - Exercise 12.9
// Define BinaryFormatException and bin2Dec that throws it

import java.util.Scanner;

class BinaryFormatException extends Exception {
    public BinaryFormatException(String msg) {
        super(msg);
    }
}

public class Problem12_9 {
    public static int bin2Dec(String binaryString) throws BinaryFormatException {
        if (binaryString == null || !binaryString.matches("[01]+"))
            throw new BinaryFormatException("Not a binary number");
        return Integer.parseInt(binaryString, 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String s = sc.next();
        try {
            System.out.println(bin2Dec(s));
        } catch (BinaryFormatException ex) {
            System.out.println("Not a binary number");
        }
    }
}
