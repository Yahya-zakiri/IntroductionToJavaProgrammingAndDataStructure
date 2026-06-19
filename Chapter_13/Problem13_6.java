// Problem13_6
// Chapter 13 - ComparableCircle

public class Problem13_6 {
    public static void main(String[] args) {
        ComparableCircle a = new ComparableCircle(2);
        ComparableCircle b = new ComparableCircle(3);
        System.out.println(a.compareTo(b) < 0 ? "b larger" : "a larger");
        Rectangle r = new Rectangle(2, 2);
        GeometricObject m = GeometricObject.max(a, r);
        System.out.println("Max area between circle and rectangle: " + m.getArea());
    }
}

class ComparableCircle extends Circle implements Comparable<GeometricObject> {
    public ComparableCircle(double r) {
        super(r);
    }

    @Override
    public int compareTo(GeometricObject o) {
        return Double.compare(getArea(), o.getArea());
    }
}
