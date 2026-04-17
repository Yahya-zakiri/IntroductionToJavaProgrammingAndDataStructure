
// Chapter 7
// Linear Search

public class LinearSearch {

    public static int linearSearch(int[] numbers, int key) {

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = { 1, 23, 44, 25, 76, 54, 34 };

        int ex = linearSearch(numbers, 76);
        int ex2 = linearSearch(numbers, 100);

        System.out.println("First result: " + ex);
        System.out.println("Second result: " + ex2);
    }
}
