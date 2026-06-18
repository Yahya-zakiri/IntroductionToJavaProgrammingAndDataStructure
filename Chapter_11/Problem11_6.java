// Problem 11.6
// Use ArrayList with mixed objects
// Chapter_11

import java.util.ArrayList;
import java.util.Date;

public class Problem11_6 {
    public static class Loan {
        private double amt;

        public Loan(double a) {
            amt = a;
        }

        public String toString() {
            return "Loan:" + amt;
        }
    }

    public static class Circle {
        private double r;

        public Circle(double r) {
            this.r = r;
        }

        public String toString() {
            return "Circle r=" + r;
        }
    }

    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        list.add(new Loan(1000));
        list.add(new Date());
        list.add("hello");
        list.add(new Circle(2));
        for (Object o : list)
            System.out.println(o.toString());
    }
}