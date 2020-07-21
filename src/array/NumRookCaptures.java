package array;

/**
 * 描述：999. 可以被一步捕获的棋子数
 *
 * @author zy
 * @date 2020/7/21 13:46
 */
public class NumRookCaptures {

    public int numRookCaptures(char[][] board) {
        int count = 0;
        int row = 0;
        int col = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 'R') {
                    row = i;
                    col = j;
                    break;
                }
            }
        }

        int tempI = row;
        while (tempI > 0) {
            tempI--;
            if (board[tempI][col] == 'B') {
                break;
            }
            if (board[tempI][col] == 'p') {
                count++;
                break;
            }
        }

        tempI = row;
        while (tempI < board.length - 1) {
            tempI++;
            if (board[tempI][col] == 'B') {
                break;
            }
            if (board[tempI][col] == 'p') {
                count++;
                break;
            }
        }

        int tempJ = col;
        while (tempJ > 0) {
            tempJ--;
            if (board[row][tempJ] == 'B') {
                break;
            }
            if (board[row][tempJ] == 'p') {
                count++;
                break;
            }
        }

        tempJ = col;
        while (tempJ < board[0].length - 1) {
            tempJ++;
            if (board[row][tempJ] == 'B') {
                break;
            }
            if (board[row][tempJ] == 'p') {
                count++;
                break;
            }
        }
        return count;
    }
}
