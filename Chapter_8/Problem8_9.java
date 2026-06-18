// Problem 8.9
// Tic-tac-toe game
// Chapter_8

import java.util.Scanner;

public class Problem8_9 {
    public static void printBoard(char[][] b) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + (b[i][j] == '\0' ? '.' : b[i][j]) + " ");
            }
            System.out.println();
        }
    }

    public static boolean isWin(char[][] b, char p) {
        for (int i = 0; i < 3; i++)
            if (b[i][0] == p && b[i][1] == p && b[i][2] == p)
                return true;
        for (int j = 0; j < 3; j++)
            if (b[0][j] == p && b[1][j] == p && b[2][j] == p)
                return true;
        if (b[0][0] == p && b[1][1] == p && b[2][2] == p)
            return true;
        if (b[0][2] == p && b[1][1] == p && b[2][0] == p)
            return true;
        return false;
    }

    public static boolean boardFull(char[][] b) {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (b[i][j] == '\0')
                    return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[][] board = new char[3][3];
        char player = 'X';
        while (true) {
            printBoard(board);
            System.out.print("Enter a row (0, 1, or 2) for player " + player + ": ");
            int r = in.nextInt();
            System.out.print("Enter a column (0, 1, or 2) for player " + player + ": ");
            int c = in.nextInt();
            if (r < 0 || r > 2 || c < 0 || c > 2 || board[r][c] != '\0') {
                System.out.println("Invalid move, try again.");
                continue;
            }
            board[r][c] = player;
            if (isWin(board, player)) {
                printBoard(board);
                System.out.println(player + " player won");
                break;
            }
            if (boardFull(board)) {
                printBoard(board);
                System.out.println("Draw");
                break;
            }
            player = (player == 'X') ? 'O' : 'X';
        }
        in.close();
    }
}