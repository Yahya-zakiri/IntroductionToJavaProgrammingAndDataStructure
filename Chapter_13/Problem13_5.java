// Problem13_5
// Chapter 13 - Test GeometricObject.max with circles and rectangles

public class Problem13_5 {
    public static void main(String[] args) {
        Circle c1 = new Circle(2);
        Circle c2 = new Circle(3);
        GeometricObject m = GeometricObject.max(c1, c2);
        System.out.println("Max circle area: " + m.getArea());

        Rectangle r1 = new Rectangle(2, 3);
        Rectangle r2 = new Rectangle(4, 1);
        GeometricObject m2 = GeometricObject.max(r1, r2);
        System.out.println("Max rectangle area: " + m2.getArea());
    }
}
