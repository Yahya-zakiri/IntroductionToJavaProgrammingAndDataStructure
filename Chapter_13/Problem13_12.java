// Problem13_12
// Chapter 13 - sumArea method

public class Problem13_12 {
    public static double sumArea(GeometricObject[] a) {
        double s = 0;
        for (GeometricObject g : a)
            s += g.getArea();
        return s;
    }

    public static void main(String[] args) {
        GeometricObject[] arr = { new Circle(1), new Circle(2), new Rectangle(2, 3), new Rectangle(1, 1) };
        System.out.println("Total area: " + sumArea(arr));
    }
}
