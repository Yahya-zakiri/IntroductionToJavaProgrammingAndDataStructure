// GeometricObject
// Chapter 13 shared base
// Abstract geometric object with Comparable

public abstract class GeometricObject implements Comparable<GeometricObject> {
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated = new java.util.Date();

    public GeometricObject() {
    }

    public GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    @Override
    public int compareTo(GeometricObject o) {
        return Double.compare(this.getArea(), o.getArea());
    }

    public static GeometricObject max(GeometricObject a, GeometricObject b) {
        return a.compareTo(b) >= 0 ? a : b;
    }
}
