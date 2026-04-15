
// chapter 7
// 7.2.6
// practice 1

package Chapter_7;

import java.util.Scanner;

public class StoringInputArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many elements would your array have: ");
        int arrayLength = input.nextInt();
        double[] numbers = new double[arrayLength];
        System.out.print("Enter " + arrayLength + " numbers seperated with comman: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }
        input.close();
    }
}
