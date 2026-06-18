// Problem 10.13
// MyRectangle2D class
// Chapter_10

public class Problem10_13_MyRectangle2D {
    public static class MyRectangle2D {
        private double x, y, width, height;

        public MyRectangle2D() {
            this(0, 0, 1, 1);
        }

        public MyRectangle2D(double x, double y, double width, double height) {
            this.x = x;
            this.y = y;
            this.width = width;
            this.height = height;
        }

        public double getX() {
            return x;
        }

        public double getY() {
            return y;
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

        public boolean contains(double px, double py) {
            return Math.abs(px - x) <= width / 2.0 && Math.abs(py - y) <= height / 2.0;
        }

        public boolean contains(MyRectangle2D r) {
            double left = x - width / 2, right = x + width / 2, top = y + height / 2, bottom = y - height / 2;
            double rleft = r.x - r.width / 2, rright = r.x + r.width / 2, rtop = r.y + r.height / 2,
                    rbottom = r.y - r.height / 2;
            return rleft >= left && rright <= right && rtop <= top && rbottom >= bottom;
        }

        public boolean overlaps(MyRectangle2D r) {
            double dx = Math.abs(r.x - x), dy = Math.abs(r.y - y);
            return dx <= (width + r.width) / 2.0 && dy <= (height + r.height) / 2.0;
        }
    }

    public static void main(String[] args) {
        MyRectangle2D r1 = new MyRectangle2D(2, 2, 5.5, 4.9);
        System.out.printf("Area: %.2f Perimeter: %.2f\n", r1.getArea(), r1.getPerimeter());
        System.out.println(r1.contains(3, 3));
        System.out.println(r1.contains(new MyRectangle2D(4, 5, 10.5, 3.2)));
        System.out.println(r1.overlaps(new MyRectangle2D(3, 5, 2.3, 5.4)));
    }
}