// Problem13_8
// Chapter 13 - MyStack with deep copy

import java.util.ArrayList;

public class Problem13_8 {
    public static void main(String[] args) {
        MyStack<String> s = new MyStack<>();
        s.push("a");
        s.push("b");
        MyStack<String> copy = s.clone();
        copy.push("c");
        System.out.println(s);
        System.out.println(copy);
    }
}

class MyStack<E> implements Cloneable {
    private ArrayList<E> list = new ArrayList<>();

    public void push(E e) {
        list.add(e);
    }

    public E pop() {
        return list.remove(list.size() - 1);
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public MyStack<E> clone() {
        try {
            MyStack<E> m = (MyStack<E>) super.clone();
            m.list = new ArrayList<>(this.list);
            return m;
        } catch (Exception e) {
            return null;
        }
    }

    public String toString() {
        return list.toString();
    }
}
