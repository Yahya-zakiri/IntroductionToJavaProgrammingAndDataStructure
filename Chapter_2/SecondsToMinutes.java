
/*
    Chapter 2
    Listing 2.5
 */
import java.util.Scanner;

class SecondsToMinutes {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter seconds: ");
        int totalSeconds = input.nextInt();
        int minutes = totalSeconds / 60;
        int remainSeconds = totalSeconds % 60;

        System.out.printf(totalSeconds + " seconds would be " + minutes + " minutes " + " and " + remainSeconds + " seconds.");
    }
}
