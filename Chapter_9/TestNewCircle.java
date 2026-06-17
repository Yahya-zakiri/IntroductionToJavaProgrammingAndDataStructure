//Chapter 9

public class TestNewCircle {
    public static void main(String[] args) {

        System.out.println("Before creating objects");
        System.out.println("The number of circle objects is: " + NewCircle.numberOfObjects);

        NewCircle c1 = new NewCircle();
        System.out.println("\nAfter creting c1");
        System.out.println(
                "c1: radius (" + c1.radius + ") and number of NewCircle objects (" + c1.numberOfObjects + ") ");

        NewCircle c2 = new NewCircle(5);

        c1.radius = 9;

        System.out.println("\nAfter creating c2 and modifying c1");
        System.out.println(
                "c1: radius (" + c1.radius + ") and number of NewCircle objects (" + c1.numberOfObjects + ") ");
        System.out.println(
                "c2: radius (" + c2.radius + ") and number of NewCircle objects (" + c2.numberOfObjects + ") ");
    }
}
