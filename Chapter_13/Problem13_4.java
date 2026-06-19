// Problem13_4
// Chapter 13 - Display calendar for month/year using GregorianCalendar

import java.util.*;

public class Problem13_4 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        int month = cal.get(Calendar.MONTH) + 1;
        int year = cal.get(Calendar.YEAR);
        if (args.length >= 1)
            month = Integer.parseInt(args[0]);
        if (args.length >= 2)
            year = Integer.parseInt(args[1]);
        printMonth(month, year);
    }

    static void printMonth(int month, int year) {
        System.out.println("     " + new java.text.DateFormatSymbols().getMonths()[month - 1] + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        Calendar c = new GregorianCalendar(year, month - 1, 1);
        int start = c.get(Calendar.DAY_OF_WEEK);
        int days = c.getActualMaximum(Calendar.DAY_OF_MONTH);
        for (int i = 1; i < start; i++)
            System.out.print("    ");
        for (int d = 1; d <= days; d++) {
            System.out.printf("%3d ", d);
            if ((d + start - 1) % 7 == 0)
                System.out.println();
        }
        System.out.println();
    }
}
