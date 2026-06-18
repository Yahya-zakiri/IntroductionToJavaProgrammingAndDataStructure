// Problem 8.20
// Connect four
// Chapter_8

import java.util.Scanner;

public class Problem8_20 {
    static final int ROWS = 6, COLS = 7;

    public static void printBoard(char[][] b) {
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++)
                System.out.print("|" + (b[i][j] == '\0' ? ' ' : b[i][j]));
            System.out.println("|");
        }
    }

    public static boolean isWin(char[][] b, char p) {
        for (int i = 0; i < ROWS; i++)
            for (int j = 0; j <= COLS - 4; j++)
                if (b[i][j] == p && b[i][j + 1] == p && b[i][j + 2] == p && b[i][j + 3] == p)
                    return true;
        for (int j = 0; j < COLS; j++)
            for (int i = 0; i <= ROWS - 4; i++)
                if (b[i][j] == p && b[i + 1][j] == p && b[i + 2][j] == p && b[i + 3][j] == p)
                    return true;
        for (int i = 0; i <= ROWS - 4; i++)
            for (int j = 0; j <= COLS - 4; j++)
                if (b[i][j] == p && b[i + 1][j + 1] == p && b[i + 2][j + 2] == p && b[i + 3][j + 3] == p)
                    return true;
        for (int i = 3; i < ROWS; i++)
            for (int j = 0; j <= COLS - 4; j++)
                if (b[i][j] == p && b[i - 1][j + 1] == p && b[i - 2][j + 2] == p && b[i - 3][j + 3] == p)
                    return true;
        return false;
    }

    public static boolean boardFull(char[][] b) {
        for (int i = 0; i < ROWS; i++)
            for (int j = 0; j < COLS; j++)
                if (b[i][j] == '\0')
                    return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[][] board = new char[ROWS][COLS];
        char player = 'R';
        while (true) {
            printBoard(board);
            System.out.print("Drop a " + (player == 'R' ? "red" : "yellow") + " disk at column (0–6): ");
            int col = in.nextInt();
            if (col < 0 || col >= COLS) {
                System.out.println("Invalid");
                continue;
            }
            int row = -1;
            for (int r = ROWS - 1; r >= 0; r--) {
                if (board[r][col] == '\0') {
                    board[r][col] = player;
                    row = r;
                    break;
                }
            }
            if (row == -1) {
                System.out.println("Column full");
                continue;
            }
            if (isWin(board, player)) {
                printBoard(board);
                System.out.println((player == 'R' ? "Red" : "Yellow") + " player won");
                break;
            }
            if (boardFull(board)) {
                printBoard(board);
                System.out.println("Draw");
                break;
            }
            player = (player == 'R') ? 'Y' : 'R';
        }
        in.close();
    }
}