
// Chapter 7
// Binary Search

public class BinarySearch {

    public static int binarySearch(int[] numbers, int key) {
        int low = 0;
        int high = numbers.length - 1;

        while (high >= low) {
            int mid = (high + low) / 2;

            if (key < numbers[mid]) {
                high = mid - 1;
            } else if (key == numbers[mid]) {
                return mid;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = new int[100];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }

        int key = binarySearch(numbers, 34);

        System.out.println("The number you searched for index is: " + key);
    }
}
