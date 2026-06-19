// Problem13_1
// Chapter 13 - Triangle extends GeometricObject

import java.util.Scanner;

public class Problem13_1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three sides: ");
        double s1 = sc.nextDouble(), s2 = sc.nextDouble(), s3 = sc.nextDouble();
        System.out.print("Enter color: ");
        String color = sc.next();
        System.out.print("Is filled (true/false): ");
        boolean filled = sc.nextBoolean();
        Triangle t = new Triangle(s1, s2, s3);
        t.setColor(color);
        t.setFilled(filled);
        System.out.println("Area: " + t.getArea());
        System.out.println("Perimeter: " + t.getPerimeter());
        System.out.println("Color: " + t.getColor());
        System.out.println("Filled: " + t.isFilled());
    }
}

class Triangle extends GeometricObject {
    private double s1, s2, s3;

    public Triangle(double s1, double s2, double s3) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    @Override
    public double getArea() {
        double s = (s1 + s2 + s3) / 2;
        return Math.sqrt(s * (s - s1) * (s - s2) * (s - s3));
    }

    @Override
    public double getPerimeter() {
        return s1 + s2 + s3;
    }
}
