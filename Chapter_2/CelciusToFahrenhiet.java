
//Chapter 2
//Programming Exercises
// 2.1

import java.util.Scanner;

public class CelciusToFahrenhiet {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter degrees in celcius: ");
        double celcius = input.nextDouble();

        double fahrenhiet = (9 / 5.0) * celcius + 32;

        System.out.println(celcius + " celcius in degrees would be " + fahrenhiet + " fahrenheits.");
    }
}