
//Chapter 7
//7.7

public class reverseArrayMethod {

    public static int[] reverse(int[] arr) {
        int[] reversedArray = new int[arr.length];

        for (int i = 0, j = reversedArray.length - 1; i < arr.length; i++, j--) {
            reversedArray[j] = arr[i];
        }
        return reversedArray;
    }

    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5 };
        int[] reversedArray = reverse(numbers);

        for (int i = 0; i < reversedArray.length; i++) {
            System.out.print(reversedArray[i] + "  ");
        }
    }
}
