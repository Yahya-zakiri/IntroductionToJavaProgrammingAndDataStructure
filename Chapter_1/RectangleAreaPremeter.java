


/*
    Chapter 1
    Programmig Exercises
    Problem 1.9
 */

public class RectangleAreaPremeter {
    public static void main(String[] args) {
        double height = 7.4;
        double width = 4.5;

        //Calculated the premeter
        double premeter = 2 * (height + width);

        //Calculates the area
        double area = width * height;

        System.out.println("The area of the Rectangle is: " + area);
        System.out.println("The premeter of the Rectangle is: " + premeter);
    }
}