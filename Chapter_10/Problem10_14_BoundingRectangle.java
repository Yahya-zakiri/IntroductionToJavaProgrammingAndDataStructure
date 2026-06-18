// Problem 10.14
// Bounding rectangle using MyRectangle2D
// Chapter_10

public class Problem10_14_BoundingRectangle {
    public static class MyRectangle2D {
        private double x, y, width, height;

        public MyRectangle2D() {
            this(0, 0, 0, 0);
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

        public String toString() {
            return "center (" + x + ", " + y + "), width " + width + ", height " + height;
        }
    }

    public static MyRectangle2D getRectangle(double[][] points) {
        double minX = points[0][0], maxX = points[0][0], minY = points[0][1], maxY = points[0][1];
        for (int i = 1; i < points.length; i++) {
            double x = points[i][0], y = points[i][1];
            if (x < minX)
                minX = x;
            if (x > maxX)
                maxX = x;
            if (y < minY)
                minY = y;
            if (y > maxY)
                maxY = y;
        }
        double centerX = (minX + maxX) / 2.0;
        double centerY = (minY + maxY) / 2.0;
        double width = maxX - minX;
        double height = maxY - minY;
        return new MyRectangle2D(centerX, centerY, width, height);
    }

    public static void main(String[] args) {
        java.util.Scanner in = new java.util.Scanner(System.in);
        System.out.print("Enter five points: ");
        double[][] pts = new double[5][2];
        for (int i = 0; i < 5; i++) {
            pts[i][0] = in.nextDouble();
            pts[i][1] = in.nextDouble();
        }
        MyRectangle2D r = getRectangle(pts);
        System.out.printf("The bounding rectangle's center (%.1f, %.2f), width %.1f, height %.1f\n", r.getX(), r.getY(),
                r.getWidth(), r.getHeight());
        in.close();
    }
}