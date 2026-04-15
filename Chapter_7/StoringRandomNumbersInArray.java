
// chapter 7
// 7.2.6
// practice 2

package Chapter_7;

public class StoringRandomNumbersInArray {
    public static void main(String[] args) {
        double numbers[] = new double[100];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100);
        }

    }
}
