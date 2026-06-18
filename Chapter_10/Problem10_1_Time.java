// Problem 10.1
// Time class
// Chapter_10

import java.util.Calendar;

public class Problem10_1_Time {
    public static class Time {
        private int hour, minute, second;

        public Time() {
            setTime(System.currentTimeMillis());
        }

        public Time(long elapsedTime) {
            setTime(elapsedTime);
        }

        public Time(int hour, int minute, int second) {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        }

        public int getHour() {
            return hour;
        }

        public int getMinute() {
            return minute;
        }

        public int getSecond() {
            return second;
        }

        public void setTime(long elapsedTime) {
            long totalSeconds = elapsedTime / 1000;
            int currentSecond = (int) (totalSeconds % 60);
            long totalMinutes = totalSeconds / 60;
            int currentMinute = (int) (totalMinutes % 60);
            long totalHours = totalMinutes / 60;
            int currentHour = (int) (totalHours % 24);
            this.hour = currentHour;
            this.minute = currentMinute;
            this.second = currentSecond;
        }
    }

    public static void main(String[] args) {
        Time t1 = new Time();
        Time t2 = new Time(555550000L);
        Time t3 = new Time(5, 23, 55);
        System.out.println(t1.getHour() + ":" + t1.getMinute() + ":" + t1.getSecond());
        System.out.println(t2.getHour() + ":" + t2.getMinute() + ":" + t2.getSecond());
        System.out.println(t3.getHour() + ":" + t3.getMinute() + ":" + t3.getSecond());
    }
}