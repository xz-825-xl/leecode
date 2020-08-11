package array;

import java.util.Arrays;

/**
 * 描述：130. 被围绕的区域
 *
 * @author Zhangying
 * @date 2020/8/11 9:09
 */
public class Solve {
    public static void solve(char[][] board) {
        int row = board.length;
        if (row == 0) {
            return;
        }
        int col = board[0].length;

        for (int i = 0; i < row; i++) {
            fillBoard(i, 0, board);
            fillBoard(i, col - 1, board);
        }

        for (int i = 0; i < col; i++) {
            fillBoard(0, i, board);
            fillBoard(row - 1, i, board);
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 'A') {
                    board[i][j] = 'O';
                } else {
                    board[i][j] = 'X';
                }
            }
        }
    }

    private static void fillBoard(int i, int j, char[][] board) {
        if (i < 0 || j < 0 || i >= board.length || j >= board[0].length || board[i][j] != 'O') {
            return;
        }
        board[i][j] = 'A';
        fillBoard(i + 1, j, board);
        fillBoard(i - 1, j, board);
        fillBoard(i, j + 1, board);
        fillBoard(i, j - 1, board);
    }

    public static void main(String[] args) {
        solve(new char[][]{
                {'X','X','X','X'},
                {'X','O','O','X'},
                {'X','X','O','X'},
                {'X','O','X','X'}});
    }
}
