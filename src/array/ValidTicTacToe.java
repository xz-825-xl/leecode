package array;

/**
 * 描述：794. 有效的井字游戏
 *
 * @author zy
 * @date 2020/4/9 14:57
 */
public class ValidTicTacToe {
    public static boolean validTicTacToe(String[] board) {
        int countO = 0;
        int countX = 0;
        char[][] boards = new char[3][3];
        for (int i = 0; i < board.length; i++) {
            char[] charArray = board[i].toCharArray();
            for (char c : charArray) {
                if (c == 'O') {
                    countO++;
                }
                if (c == 'X') {
                    countX++;
                }
            }
            boards[i] = charArray;
        }
        boolean X = false;
        boolean O = false;
        for (int i = 0; i < 3; i++) {
            if (boards[i][0] != ' ' && boards[i][0] == boards[i][1] && boards[i][1] == boards[i][2]) {
                X = X || boards[i][0] == 'X';
                O = O || boards[i][0] == 'O';
                break;
            }
            if (!X && boards[0][i] != ' ' && boards[0][i] == boards[1][i] && boards[1][i] == boards[2][i]) {
                X = X || boards[0][i] == 'X';
                O = O || boards[0][i] == 'O';
                break;
            }
        }

        if (!X && boards[1][1] != ' '
                && ((boards[1][1] == boards[0][0] && boards[1][1] == boards[2][2])
                || (boards[1][1] == boards[0][2] && boards[1][1] == boards[2][0]))) {
            X = X || boards[1][1] == 'X';
            O = O || boards[1][1] == 'O';
        }
        return (X && countX == countO + 1) || (!X && countX == countO)|| (!X && !O && countX == countO + 1);
    }


    public static void main(String[] args) {
        System.out.println(ValidTicTacToe.validTicTacToe(new String[]{"XOX","O X","X O"}));
    }
}
