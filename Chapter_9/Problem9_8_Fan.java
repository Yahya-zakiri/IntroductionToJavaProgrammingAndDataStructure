// Problem 9.8
// Fan class
// Chapter_9

public class Problem9_8_Fan {
    public static class Fan {
        public static final int SLOW = 1, MEDIUM = 2, FAST = 3;
        private int speed = SLOW;
        private boolean on = false;
        private double radius = 5;
        private String color = "blue";

        public Fan() {
        }

        public int getSpeed() {
            return speed;
        }

        public void setSpeed(int s) {
            speed = s;
        }

        public boolean isOn() {
            return on;
        }

        public void setOn(boolean on) {
            this.on = on;
        }

        public double getRadius() {
            return radius;
        }

        public void setRadius(double r) {
            radius = r;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String c) {
            color = c;
        }

        public String toString() {
            if (on)
                return "Speed: " + speed + " Color: " + color + " Radius: " + radius;
            else
                return "Color: " + color + " Radius: " + radius + " fan is off";
        }
    }

    public static void main(String[] args) {
        Fan f1 = new Fan();
        f1.setSpeed(Fan.FAST);
        f1.setRadius(10);
        f1.setColor("yellow");
        f1.setOn(true);
        Fan f2 = new Fan();
        f2.setSpeed(Fan.MEDIUM);
        f2.setRadius(5);
        f2.setColor("blue");
        f2.setOn(false);
        System.out.println(f1.toString());
        System.out.println(f2.toString());
    }
}