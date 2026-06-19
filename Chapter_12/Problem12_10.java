// Problem12_10
// Chapter 12 - Exercise 12.10
// Cause and handle OutOfMemoryError

public class Problem12_10 {
    public static void main(String[] args) {
        try {
            // allocate large arrays until OOME
            java.util.List<int[]> list = new java.util.ArrayList<>();
            while (true)
                list.add(new int[10_000_000]);
        } catch (OutOfMemoryError e) {
            System.out.println("Caught OutOfMemoryError: " + e.getMessage());
            // attempt graceful shutdown
        }
    }
}
