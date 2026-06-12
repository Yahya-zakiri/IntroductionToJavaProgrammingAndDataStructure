//Chapter 7
//Programming exercises
//(Sum integers from command line)

public class SumCommandLine {
    public static void main(String[] args) {
        int sum = 0;
        for (String s : args) {
            try {
                sum += Integer.parseInt(s);
            } catch (NumberFormatException e) {
            }
        }
        System.out.println("Total: " + sum);
    }
}