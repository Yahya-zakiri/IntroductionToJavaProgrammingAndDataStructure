
// chapter 7
// 7.2.6
// practice 7

public class randomShuffling {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5 };
        for (int i = 0; i < numbers.length; i++) {
            int randomIndex = (int) (Math.random() * numbers.length);
            int temp = numbers[i];
            numbers[i] = numbers[randomIndex];
            numbers[randomIndex] = temp;
        }
        System.out.print("Shuffled array is: ");
        for (int e : numbers) {
            System.out.print(e + " ");
        }
    }
}