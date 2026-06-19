// Circle
// Chapter 13 shared Circle class

public class Circle extends GeometricObject {
    private double radius;

    public Circle() {
        this(1);
    }

    public Circle(double r) {
        radius = r;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double r) {
        radius = r;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Circle))
            return false;
        Circle c = (Circle) o;
        return Double.compare(radius, c.radius) == 0;
    }
}
