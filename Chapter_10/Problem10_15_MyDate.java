// Problem 10.15
// MyDate class
// Chapter_10

import java.util.GregorianCalendar;
import java.util.Calendar;

public class Problem10_15_MyDate {
    public static class MyDate {
        private int year, month, day;

        public MyDate() {
            GregorianCalendar gc = new GregorianCalendar();
            year = gc.get(Calendar.YEAR);
            month = gc.get(Calendar.MONTH);
            day = gc.get(Calendar.DAY_OF_MONTH);
        }

        public MyDate(long elapsedTime) {
            setDate(elapsedTime);
        }

        public MyDate(int year, int month, int day) {
            this.year = year;
            this.month = month;
            this.day = day;
        }

        public int getYear() {
            return year;
        }

        public int getMonth() {
            return month;
        }

        public int getDay() {
            return day;
        }

        public void setDate(long elapsedTime) {
            GregorianCalendar gc = new GregorianCalendar();
            gc.setTimeInMillis(elapsedTime);
            year = gc.get(Calendar.YEAR);
            month = gc.get(Calendar.MONTH);
            day = gc.get(Calendar.DAY_OF_MONTH);
        }
    }

    public static void main(String[] args) {
        MyDate d1 = new MyDate();
        MyDate d2 = new MyDate(34355555133101L);
        System.out.printf("%d-%d-%d\n", d1.getYear(), d1.getMonth(), d1.getDay());
        System.out.printf("%d-%d-%d\n", d2.getYear(), d2.getMonth(), d2.getDay());
    }
}