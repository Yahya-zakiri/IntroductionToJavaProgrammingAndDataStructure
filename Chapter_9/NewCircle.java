
//Chapter 9

public class NewCircle {
    double radius;

    static int numberOfObjects = 0;

    NewCircle() {
        radius = 1;
        numberOfObjects++;
    }

    NewCircle(double newRadius) {
        radius = newRadius;
        numberOfObjects++;
    }

    static int getNumberOfObjects() {
        return numberOfObjects;
    }

    double getArea() {
        return radius * radius * Math.PI;
    }
}
