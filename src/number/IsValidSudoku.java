package number;

/**
 * 描述：36. 有效的数独
 *
 * @author zy
 * @date 2020/4/16 18:18
 */
public class IsValidSudoku {
    public static boolean isValidSudoku(char[][] board) {
        // 存每一行1~9的个数
        int[][] rows = new int[board.length][10];
        // 存每一列1~9的个数
        int[][] columns = new int[board[0].length][10];
        // 存每一3x3 宫内1~9的个数
        int[][] sudos = new int[(board.length) * (board[0].length) / 9][10];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                char c = board[i][j];
                if (c != '.') {
                    int num = c - '0';
                    if (++rows[i][num] > 1) {
                        return false;
                    }
                    if (++columns[j][num] > 1) {
                        return false;
                    }
                    int n = (i / 3) * 3 + j / 3;
                    if (++sudos[n][num] > 1) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
//        IsValidSudoku.isValidSudoku(new char[][] {
//                {'5','3','.','.','7','.','.','.','.'},
//                {'6','.','.','1','9','5','.','.','.'},
//                {'.','9','8','.','.','.','.','6','.'},
//                {'8','.','.','.','6','.','.','.','3'},
//                {'4','.','.','8','.','3','.','.','1'},
//                {'7','.','.','.','2','.','.','.','6'},
//                {'.','6','.','.','.','.','2','8','.'},
//                {'.','.','.','4','1','9','.','.','5'},
//                {'.','.','.','.','8','.','.','7','9'}
//        });
        IsValidSudoku.isValidSudoku(new char[][]{
                {'.', '.', '.', '.', '5', '.', '.', '1', '.'},
                {'.', '4', '.', '3', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '3', '.', '.', '1'},
                {'8', '.', '.', '.', '.', '.', '.', '2', '.'},
                {'.', '.', '2', '.', '7', '.', '.', '.', '.'},
                {'.', '1', '5', '.', '.', '.', '.', '.', '.'}
        });
    }
}
