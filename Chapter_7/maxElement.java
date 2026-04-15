
//Chapter 7
//7.2.6
//Practice 4

public class maxElement {

    public static void main(String[] args) {
        double[] numbers = { 1, 2, 3, 4, 5, 3.4, 7.9, 4.5, 1.4 };
        double max = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("The maximum element in this array is: " + max);
    }
}