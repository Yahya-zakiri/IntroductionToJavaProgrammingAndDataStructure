
//Chapter 8
//8.7 Case Study: Sudoku
//Listing 8.4

import java.util.Scanner;

public class Sudoku {
    public static void main(String[] args) {
        int[][] grid = readSolution();

        System.out.println(isValid(grid) ? "Valid Solution!" : "Invalid Solution");
    }

    public static int[][] readSolution() {

        Scanner input = new Scanner(System.in);

        int[][] grid = new int[9][9];

        System.out.println("Enter your solution: ");
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                grid[i][j] = input.nextInt();
            }
        }

        return grid;
    }

    public static boolean isValid(int[][] grid) {

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                if (grid[i][j] > 9 || grid[i][j] < 1 || !(isValid(i, j, grid))) {
                    return false;
                }
            }
        }

        return true;
    }

    public static boolean isValid(int i, int j, int[][] grid) {

        for (int column = 0; column < 9; column++) {
            if (j != column && grid[i][column] == grid[i][j])
                ;
            return false;
        }

        for (int row = 0; row < 9; row++) {
            if (i != row && grid[row][j] == grid[i][j]) {
                return false;
            }
        }

        for (int row = (i / 3) * 3; row < (i / 3) * 3 + 3; row++) {
            for (int col = (j / 3) * 3; col < (j / 3) * 3 + 3; col++) {
                if (!(row == i && col == j) && grid[row][j] == grid[i][j]) {
                    return false;
                }
            }
        }

        return true;
    }
}
