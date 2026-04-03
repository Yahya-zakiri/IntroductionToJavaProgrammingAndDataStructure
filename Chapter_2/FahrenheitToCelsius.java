
// Chapter 2
// Listing 2.6

import java.util.Scanner;

public class FahrenheitToCelsius {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter degrees in fahrenheit: ");
        double fahreheit = input.nextDouble();
        double celsius = (5.0 / 9) * (fahreheit - 32);

        System.out.println(fahreheit + " fahrenheits would be " + celsius + " celsius");
    }
}