
//Chapter 3
// Listing 3.1

import java.util.Scanner;

public class AdditionQuiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Generates two random number using currentTimeMillis method
        int firstNum = (int) (System.currentTimeMillis() % 10);
        int secondNum = (int) ((System.currentTimeMillis() / 10) % 10);

        System.out.print("What is: " + firstNum + " + " + secondNum + " = ");
        int answer = input.nextInt();

        System.out.println(firstNum + " + " + secondNum + " = " + answer + " is " + (firstNum + secondNum == answer));
    }
}
