
/*
    Chapter 1
    Programmig Exercises
    Problem 1.10
 */

public class AverageSpeed {
    public static void main(String[] args) {
         double distanceInKilloMeter = 14;
         double timeInMinutes = 45.5;
         double KilloMeterToMile = distanceInKilloMeter / 1.6;
         double timeInHour = timeInMinutes * 60;
         double averageSpeedInMilesPerHour = KilloMeterToMile / timeInHour;

         System.out.println("The average speed in miles per hour is: " + averageSpeedInMilesPerHour + " mil/h.");
    }
}