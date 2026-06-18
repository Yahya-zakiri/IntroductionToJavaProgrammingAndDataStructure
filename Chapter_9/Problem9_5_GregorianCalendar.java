// Problem 9.5
// GregorianCalendar usage
// Chapter_9

import java.util.GregorianCalendar;
import java.util.Calendar;

public class Problem9_5_GregorianCalendar {
    public static void main(String[] args) {
        GregorianCalendar gc = new GregorianCalendar();
        System.out.printf("Current date: %d-%d-%d\n", gc.get(Calendar.YEAR), gc.get(Calendar.MONTH) + 1,
                gc.get(Calendar.DAY_OF_MONTH));
        gc.setTimeInMillis(1234567898765L);
        System.out.printf("Set date: %d-%d-%d\n", gc.get(Calendar.YEAR), gc.get(Calendar.MONTH) + 1,
                gc.get(Calendar.DAY_OF_MONTH));
    }
}