// Problem13_11
// Chapter 13 - Octagon extends GeometricObject, Comparable, Cloneable

public class Problem13_11 {
    public static void main(String[] args) throws Exception {
        Octagon o = new Octagon(5);
        System.out.println("Area: " + o.getArea());
        System.out.println("Perimeter: " + o.getPerimeter());
        Octagon c = (Octagon) o.clone();
        System.out.println("Compare clone: " + o.compareTo(c));
    }
}

class Octagon extends GeometricObject implements Comparable<Octagon>, Cloneable {
    private double side;

    public Octagon() {
        this(0);
    }

    public Octagon(double s) {
        side = s;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double s) {
        side = s;
    }

    @Override
    public double getPerimeter() {
        return 8 * side;
    }

    @Override
    public double getArea() {
        return 2 * (1 + Math.sqrt(2)) * side * side;
    }

    @Override
    public int compareTo(Octagon o) {
        return Double.compare(this.getArea(), o.getArea());
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
