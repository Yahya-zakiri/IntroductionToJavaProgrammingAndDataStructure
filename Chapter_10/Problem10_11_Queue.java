// Problem 10.11
// Queue class
// Chapter_10

import java.util.Arrays;

public class Problem10_11_Queue {
    public static class Queue {
        private int[] elements;
        private int size;

        public Queue() {
            elements = new int[8];
            size = 0;
        }

        public void enqueue(int v) {
            if (size >= elements.length)
                elements = Arrays.copyOf(elements, elements.length * 2);
            elements[size++] = v;
        }

        public int dequeue() {
            if (size == 0)
                throw new java.util.NoSuchElementException();
            int v = elements[0];
            for (int i = 1; i < size; i++)
                elements[i - 1] = elements[i];
            elements[--size] = 0;
            return v;
        }

        public boolean empty() {
            return size == 0;
        }

        public int getSize() {
            return size;
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        for (int i = 1; i <= 20; i++)
            q.enqueue(i);
        while (!q.empty())
            System.out.println(q.dequeue());
    }
}