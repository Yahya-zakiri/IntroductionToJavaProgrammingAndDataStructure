// Problem 10.12
// Circle2D class
// Chapter_10

public class Problem10_12_Circle2D {
    public static class Circle2D {
        private double x, y, radius;

        public Circle2D() {
            this(0, 0, 1);
        }

        public Circle2D(double x, double y, double radius) {
            this.x = x;
            this.y = y;
            this.radius = radius;
        }

        public double getX() {
            return x;
        }

        public double getY() {
            return y;
        }

        public double getRadius() {
            return radius;
        }

        public double getArea() {
            return Math.PI * radius * radius;
        }

        public double getPerimeter() {
            return 2 * Math.PI * radius;
        }

        public boolean contains(double x, double y) {
            double dx = this.x - x, dy = this.y - y;
            return dx * dx + dy * dy < radius * radius;
        }

        public boolean contains(Circle2D c) {
            double d = Math.hypot(c.x - x, c.y - y);
            return d + c.radius <= radius;
        }

        public boolean overlaps(Circle2D c) {
            double d = Math.hypot(c.x - x, c.y - y);
            return d < (radius + c.radius) && d + Math.min(radius, c.radius) > Math.max(radius, c.radius);
        }
    }

    public static void main(String[] args) {
        Circle2D c1 = new Circle2D(2, 2, 5.5);
        System.out.printf("Area: %.2f Perimeter: %.2f\n", c1.getArea(), c1.getPerimeter());
        System.out.println(c1.contains(3, 3));
        System.out.println(c1.contains(new Circle2D(4, 5, 10.5)));
        System.out.println(c1.overlaps(new Circle2D(3, 5, 2.3)));
    }
}