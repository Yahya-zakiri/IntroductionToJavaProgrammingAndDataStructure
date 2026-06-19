// Problem13_7
// Chapter 13 - Colorable and Square

public class Problem13_7 {
    public static void main(String[] args) {
        GeometricObject[] arr = new GeometricObject[5];
        arr[0] = new Square(2);
        arr[1] = new Square(3);
        arr[2] = new Circle(1);
        arr[3] = new Rectangle(2, 2);
        arr[4] = new Square(4);
        for (GeometricObject g : arr) {
            System.out.println("Area: " + g.getArea());
            if (g instanceof Colorable)
                ((Colorable) g).howToColor();
        }
    }
}

class Square extends GeometricObject implements Colorable {
    private double side;

    public Square() {
        this(0);
    }

    public Square(double s) {
        side = s;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double s) {
        side = s;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
}
