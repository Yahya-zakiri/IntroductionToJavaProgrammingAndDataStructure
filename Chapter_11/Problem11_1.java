// Problem 11.1
// Triangle and GeometricObject
// Chapter_11

import java.util.Date;

public class Problem11_1 {
    public static class GeometricObject {
        private String color = "white";
        private boolean filled;
        private Date dateCreated = new Date();

        public GeometricObject() {
        }

        public String getColor() {
            return color;
        }

        public void setColor(String c) {
            color = c;
        }

        public boolean isFilled() {
            return filled;
        }

        public void setFilled(boolean f) {
            filled = f;
        }

        public Date getDateCreated() {
            return dateCreated;
        }

        public String toString() {
            return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
        }
    }

    public static class Triangle extends GeometricObject {
        private double side1 = 1.0, side2 = 1.0, side3 = 1.0;

        public Triangle() {
        }

        public Triangle(double s1, double s2, double s3) {
            side1 = s1;
            side2 = s2;
            side3 = s3;
        }

        public double getSide1() {
            return side1;
        }

        public double getSide2() {
            return side2;
        }

        public double getSide3() {
            return side3;
        }

        public double getArea() {
            double s = (side1 + side2 + side3) / 2.0;
            return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        }

        public double getPerimeter() {
            return side1 + side2 + side3;
        }

        public String toString() {
            return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
        }
    }

    public static void main(String[] args) {
        java.util.Scanner in = new java.util.Scanner(System.in);
        System.out.print("Enter three sides: ");
        double s1 = in.nextDouble(), s2 = in.nextDouble(), s3 = in.nextDouble();
        System.out.print("Enter a color: ");
        String color = in.next();
        System.out.print("Is it filled (true/false): ");
        boolean filled = in.nextBoolean();
        Triangle t = new Triangle(s1, s2, s3);
        t.setColor(color);
        t.setFilled(filled);
        System.out.printf("Area: %.2f\nPerimeter: %.2f\nColor: %s\nFilled: %b\n", t.getArea(), t.getPerimeter(),
                t.getColor(), t.isFilled());
        in.close();
    }
}