// Rectangle
// Chapter 13 shared Rectangle class

public class Rectangle extends GeometricObject {
    private double width, height;

    public Rectangle() {
        this(1, 1);
    }

    public Rectangle(double w, double h) {
        width = w;
        height = h;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double w) {
        width = w;
    }

    public void setHeight(double h) {
        height = h;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Rectangle))
            return false;
        Rectangle r = (Rectangle) o;
        return Double.compare(getArea(), r.getArea()) == 0;
    }
}
