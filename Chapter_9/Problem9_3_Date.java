// Problem 9.3
// Date class usage
// Chapter_9

import java.util.Date;

public class Problem9_3_Date {
    public static void main(String[] args) {
        long[] times = { 10000L, 100000L, 1000000L, 10000000L, 100000000L, 1000000000L, 10000000000L, 100000000000L };
        for (long t : times) {
            Date d = new Date();
            d.setTime(t);
            System.out.println(d.toString());
        }
    }
}