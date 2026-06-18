// Problem 10.25
// Split including delimiters
// Chapter_10

import java.util.regex.*;
import java.util.ArrayList;

public class Problem10_25_Split {
    public static String[] split(String s, String regex) {
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(s);
        ArrayList<String> parts = new ArrayList<>();
        int last = 0;
        while (m.find()) {
            if (m.start() > last)
                parts.add(s.substring(last, m.start()));
            parts.add(m.group());
            last = m.end();
        }
        if (last < s.length())
            parts.add(s.substring(last));
        return parts.toArray(new String[0]);
    }

    public static void main(String[] args) {
        String[] res = split("ab#12#453", "#");
        for (String t : res)
            System.out.println(t);
    }
}