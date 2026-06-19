// Problem12_26
// Chapter 12 - Exercise 12.26
// Prompt user to enter a directory name and create it (mkdirs)

import java.nio.file.*;
import java.util.Scanner;

public class Problem12_26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter directory name: ");
        String name = sc.nextLine();
        Path p = Paths.get(name);
        if (Files.exists(p))
            System.out.println("Directory already exists");
        else {
            try {
                Files.createDirectories(p);
                System.out.println("Directory created successfully");
            } catch (Exception e) {
                System.out.println("Failed: " + e.getMessage());
            }
        }
    }
}
