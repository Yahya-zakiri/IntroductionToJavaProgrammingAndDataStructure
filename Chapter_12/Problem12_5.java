// Problem12_5
// Chapter 12 - Exercise 12.5
// IllegalTriangleException and Triangle constructor validation

class IllegalTriangleException extends Exception {
    public IllegalTriangleException(String msg) {
        super(msg);
    }
}

public class Problem12_5 {
    public static void main(String[] args) {
        try {
            Triangle t = new Triangle(1, 2, 3); // invalid
        } catch (IllegalTriangleException ex) {
            System.out.println("Invalid triangle: " + ex.getMessage());
        }

        try {
            Triangle t2 = new Triangle(3, 4, 5);
            System.out.println("Triangle created with sides 3,4,5");
        } catch (IllegalTriangleException ex) {
            System.out.println("Invalid triangle: " + ex.getMessage());
        }
    }
}

class Triangle {
    private double side1, side2, side3;

    public Triangle(double side1, double side2, double side3) throws IllegalTriangleException {
        if (!isValid(side1, side2, side3))
            throw new IllegalTriangleException("Sides do not satisfy triangle inequality");
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    private boolean isValid(double a, double b, double c) {
        return a + b > c && a + c > b && b + c > a;
    }

    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
}
