package array;

/**
 * 描述：529. 扫雷游戏
 *
 * @author Zhangying
 * @date 2020/8/20 9:11
 */
public class UpdateBoard {
    public static char[][] updateBoard(char[][] board, int[] click) {
        if (click.length < 2
                || board.length == 0
                || board.length - 1 < click[0]
                || board[0].length - 1 < click[1]) {
            return board;
        }

        int x = click[0];
        int y = click[1];

        if (board[x][y] == 'M') {
            // 如果一个地雷（'M'）被挖出，游戏就结束了- 把它改为 'X'。
            board[x][y] = 'X';
        } else {
            fillBoard(board, x, y);
        }
        return board;
    }

    /**
     * 挖出相邻的方块
     *
     * @param board
     * @param x
     * @param y
     */
    private static void fillBoard(char[][] board, int x, int y) {
        if (x >= 0 && x < board.length
                && y >= 0 && y < board[0].length
                && board[x][y] == 'E') {

            int count = getMCount(board, x, y);

            if (count == 0) {
                //如果一个没有相邻地雷的空方块（'E'）被挖出，修改它为（'B'），并且所有和其相邻的未挖出方块都应该被递归地揭露。
                board[x][y] = 'B';
                fillBoard(board, x - 1, y);
                fillBoard(board, x + 1, y);
                fillBoard(board, x, y - 1);
                fillBoard(board, x, y + 1);

                fillBoard(board, x + 1, y + 1);
                fillBoard(board, x + 1, y - 1);
                fillBoard(board, x - 1, y + 1);
                fillBoard(board, x - 1, y - 1);
            } else {
                //如果一个至少与一个地雷相邻的空方块（'E'）被挖出，修改它为数字（'1'到'8'），表示相邻地雷的数量。
                board[x][y] = Integer.toString(count).charAt(0);
            }
        }
    }

    /**
     * 获取坐标（x,y）周围炸弹个数
     *
     * @param board
     * @param x
     * @param y
     * @return
     */
    private static int getMCount(char[][] board, int x, int y) {
        int count = 0;
        if (x + 1 < board.length && board[x + 1][y] == 'M') {
            count++;
        }
        if (x - 1 > -1 && board[x - 1][y] == 'M') {
            count++;
        }
        if (y + 1 < board[0].length && board[x][y + 1] == 'M') {
            count++;
        }
        if (y - 1 > -1 && board[x][y - 1] == 'M') {
            count++;
        }

        if (x + 1 < board.length && y + 1 < board[0].length && board[x + 1][y + 1] == 'M') {
            count++;
        }
        if (x + 1 < board.length && y - 1 > -1 && board[x + 1][y - 1] == 'M') {
            count++;
        }
        if (y + 1 < board[0].length && x - 1 > -1 && board[x - 1][y + 1] == 'M') {
            count++;
        }
        if (y - 1 > -1 && x - 1 > -1 && board[x - 1][y - 1] == 'M') {
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
//        updateBoard(new char[][]{
//                {'E', 'E', 'E', 'E', 'E'},
//                {'E', 'E', 'M', 'E', 'E'},
//                {'E', 'E', 'E', 'E', 'E'},
//                {'E', 'E', 'E', 'E', 'E'}
//        }, new int[]{3, 0});

        updateBoard(new char[][] {
                {'E', 'E', 'E', 'E', 'E', 'E', 'E', 'E'},
                {'E', 'E', 'E', 'E', 'E', 'E', 'E', 'M'},
                {'E', 'E', 'M', 'E', 'E', 'E', 'E', 'E'},
                {'M', 'E', 'E', 'E', 'E', 'E', 'E', 'E'},
                {'E', 'E', 'E', 'E', 'E', 'E', 'E', 'E'},
                {'E', 'E', 'E', 'E', 'E', 'E', 'E', 'E'},
                {'E', 'E', 'E', 'E', 'E', 'E', 'E', 'E'},
                {'E', 'E', 'M', 'M', 'E', 'E', 'E', 'E'}
        }, new int[]{0, 0});
// 正确答案
//        {
//            {'B','B','B','B','B','B','1','E'},
//            {'B','1','1','1','B','B','1','M'},
//            {'1','2','M','1','B','B','1','1'},
//            {'M','2','1','1','B','B','B','B'},
//            {'1','1','B','B','B','B','B','B'},
//            {'B','B','B','B','B','B','B','B'},
//            {'B','1','2','2','1','B','B','B'},
//            {'B','1','M','M','1','B','B','B'}
//        }

// 我的答案
//        {
//            {'B','B','B','B','B','B','1','E'},
//            {'B','1','1','1','B','B','1','M'},
//            {'1','E','M','1','B','B','1','1'},
//            {'M','E','1','1','B','B','B','B'},
//            {'1','1','B','B','B','B','B','B'},
//            {'B','B','B','B','B','B','B','B'},
//            {'B','1','2','2','1','B','B','B'},
//            {'B','1','M','M','1','B','B','B'}
//        }
    }

}
