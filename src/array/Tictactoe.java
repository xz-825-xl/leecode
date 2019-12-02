package array;

/**
 * 描述：1275. 找出井字棋的获胜者
 *
 * @author zy
 * @date 2019/12/2 9:02
 */
public class Tictactoe {
    public static String tictactoe(int[][] moves) {
        int[][] temp = new int[3][3];
        for (int i = 0; i < moves.length; i++) {
            if (i % 2 == 0) {
                temp[moves[i][0]][moves[i][1]] = 1;
            } else {
                temp[moves[i][0]][moves[i][1]] = 2;
            }
        }
        for (int i = 0; i < 3; i++) {
            if (temp[i][1] != 0 && temp[i][1] == temp[i][0] && temp[i][1] == temp[i][2]) {
                return temp[i][1] == 1 ? "A" : "B";
            }
        }

        for (int i = 0; i < 3; i++) {
            if (temp[0][i] != 0 && temp[0][i] == temp[1][i] && temp[0][i] == temp[2][i]) {
                return temp[0][i] == 1 ? "A" : "B";
            }
        }

        if (temp[1][1] != 0 && temp[1][1] == temp[0][0] && temp[1][1] == temp[2][2]) {
            return temp[1][1] == 1 ? "A" : "B";
        }
        if (temp[1][1] != 0 && temp[1][1] == temp[0][2] && temp[1][1] == temp[2][0]) {
            return temp[1][1] == 1 ? "A" : "B";
        }
        return moves.length == 9 ? "Draw" : "Pending";

    }
}
