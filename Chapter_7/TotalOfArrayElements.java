
//Chapter 7
//7.2.6
//Practice 4

public class TotalOfArrayElements {
    public static void main(String[] args) {
        double total = 0;
        double[] numbers = { 4, 2, 3, 1 };
        for (int i = 0; i < numbers.length; i++) {
            total += numbers[i];
        }
        System.out.println("The total of array is: " + total);
    }
}