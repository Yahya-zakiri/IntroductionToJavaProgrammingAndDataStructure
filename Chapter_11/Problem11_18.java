// Problem 11.18
// toCharacterArray(String s)
// Chapter_11

import java.util.ArrayList;

public class Problem11_18 {
    public static ArrayList<Character> toCharacterArray(String s) {
        ArrayList<Character> a = new ArrayList<>();
        for (char c : s.toCharArray())
            a.add(c);
        return a;
    }

    public static void main(String[] args) {
        System.out.println(toCharacterArray("abc"));
    }
}