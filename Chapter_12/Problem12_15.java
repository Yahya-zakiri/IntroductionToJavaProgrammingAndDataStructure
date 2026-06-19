// Problem12_15
// Chapter 12 - Exercise 12.15
// Create Exercise12_15.txt with 100 random integers and display sorted

import java.nio.file.*;
import java.io.IOException;
import java.util.*;

public class Problem12_15 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("Exercise12_15.txt");
        Random r = new Random();
        List<Integer> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            int v = r.nextInt(1000);
            list.add(v);
            sb.append(v).append(' ');
        }
        Files.write(path, sb.toString().getBytes());
        Collections.sort(list);
        System.out.println("Sorted data:");
        for (int v : list)
            System.out.print(v + " ");
        System.out.println();
    }
}
