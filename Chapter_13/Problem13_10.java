// Problem13_10
// Chapter 13 - Rectangle equals/comparable

public class Problem13_10 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(2, 3), r2 = new Rectangle(1.5, 4);
        System.out.println("Equal area? " + r1.equals(r2));
    }
}
