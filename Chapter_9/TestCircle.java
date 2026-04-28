
//Chapter 9
//Listing 9.1 TestCircle OOP

public class TestCircle {

    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(25);

        System.out.println("circle1 radius is: " + circle1.radius);
        System.out.println("circle2 radius is: " + circle2.radius);

        // Calculates the area of circle1
        double circle1Area = circle1.getArea();
        System.out.println("The are of a circle with " + circle1.radius + " radius is: " + circle1Area);

        // Changes the radius to another number
        circle2.radius = 100;
        System.out.println("The radius of circle2 is now: " + circle2.radius);

        circle2.setRadius(30);
        System.out.println("The circle2 radius is now: " + circle2.radius);
    }
}

class Circle {
    double radius = 1;

    Circle() {
        radius = 1;
    }

    Circle(double newRadius) {
        radius = newRadius;
    }

    double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    void setRadius(double newRadius) {
        radius = newRadius;
    }
}
