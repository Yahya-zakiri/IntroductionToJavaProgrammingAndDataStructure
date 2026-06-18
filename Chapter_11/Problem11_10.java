// Problem 11.10
// MyStack extends ArrayList
// Chapter_11

import java.util.ArrayList;
import java.util.Scanner;

public class Problem11_10 {
    public static class MyStack extends ArrayList<String> {
        public void push(String s) {
            add(s);
        }

        public String pop() {
            return remove(size() - 1);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        MyStack st = new MyStack();
        System.out.println("Enter five strings:");
        for (int i = 0; i < 5; i++)
            st.push(in.next());
        System.out.println("In reverse order:");
        while (!st.isEmpty())
            System.out.println(st.pop());
        in.close();
    }
}