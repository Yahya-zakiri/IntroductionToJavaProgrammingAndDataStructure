
// chapter 7
// 7.2.6
// practice 8

public class ShiftElements {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5 };
        int temp = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            numbers[i - 1] = numbers[i];
        }
        numbers[numbers.length - 1] = temp;
        for (int e : numbers) {
            System.out.print(e + " ");
        }
    }
}
