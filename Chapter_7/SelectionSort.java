
// Chapter 7
// Selection Sort

public class SelectionSort {

    /** The method for sorting the numbers */
    public static void selectionSort(double[] numbers) {

        // Loops through each element
        for (int i = 0; i < numbers.length - 1; i++) {
            double minElement = numbers[i];
            int minIndex = i;

            // Finds the smalles number and its index
            for (int j = i + 1; j < numbers.length; j++) {
                if (minElement > numbers[j]) {
                    minElement = numbers[j];
                    minIndex = j;
                }
            }

            // Swaps the smallest elemts with the first element in array
            if (minIndex != i) {
                numbers[minIndex] = numbers[i];
                numbers[i] = minElement;
            }
        }
    }

    public static void main(String[] args) {
        double[] numbers = { 3, 2, 5, 4, 7, 8, 15, 1, 6 };

        selectionSort(numbers);

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}