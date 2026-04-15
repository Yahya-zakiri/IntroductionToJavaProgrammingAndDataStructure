
// chapter 7
// 7.2.6
// practice 6

public class maxElementIndex {
    public static void main(String[] args) {
        double[] numbers = { 1, 2, 4.3, 2.3, 1.2, 5.4, 4, 5 };
        double max = numbers[0];
        int indexOfMax = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
                indexOfMax = i;
            }

        }
        System.out.println("The maximux element is: " + max);
        System.out.println("The index of the maximum element is: " + indexOfMax);
    }
}
