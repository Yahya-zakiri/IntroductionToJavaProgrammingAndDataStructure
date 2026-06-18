// Problem 10.4
// MyPoint class
// Chapter_10

public class Problem10_4_MyPoint {
    public static class MyPoint {
        private double x, y;

        public MyPoint() {
            this(0, 0);
        }

        public MyPoint(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public double getX() {
            return x;
        }

        public double getY() {
            return y;
        }

        public double distance(MyPoint p) {
            double dx = x - p.x, dy = y - p.y;
            return Math.sqrt(dx * dx + dy * dy);
        }

        public double distance(double x, double y) {
            double dx = this.x - x, dy = this.y - y;
            return Math.sqrt(dx * dx + dy * dy);
        }

        public static double distance(MyPoint p1, MyPoint p2) {
            return p1.distance(p2);
        }
    }

    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(0, 0);
        MyPoint p2 = new MyPoint(10, 30.5);
        System.out.println("Distance: " + MyPoint.distance(p1, p2));
    }
}