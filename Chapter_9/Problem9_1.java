// Problem 9.1
// Rectangle class
// Chapter_9

public class Problem9_1 {
    public static class Rectangle {
        private double width = 1;
        private double height = 1;

        public Rectangle() {
        }

        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        public double getWidth() {
            return width;
        }

        public double getHeight() {
            return height;
        }

        public double getArea() {
            return width * height;
        }

        public double getPerimeter() {
            return 2 * (width + height);
        }
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4, 40);
        Rectangle r2 = new Rectangle(3.5, 35.9);
        System.out.printf("Width: %.1f Height: %.1f Area: %.1f Perimeter: %.1f\n", r1.getWidth(), r1.getHeight(),
                r1.getArea(), r1.getPerimeter());
        System.out.printf("Width: %.1f Height: %.1f Area: %.1f Perimeter: %.1f\n", r2.getWidth(), r2.getHeight(),
                r2.getArea(), r2.getPerimeter());
    }
}