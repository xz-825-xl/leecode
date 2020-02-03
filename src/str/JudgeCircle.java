package str;

/**
 * 描述：657. 机器人能否返回原点
 *
 * @author zy
 * @date 2020/1/17 8:58
 */
public class JudgeCircle {
    public boolean judgeCircle(String moves) {
        int leftRight = 0;
        int upDown = 0;
        for (char c : moves.toCharArray()) {
            if (c == 'R') {
                leftRight++;
            } else if (c == 'L') {
                leftRight--;
            } else if (c == 'U') {
                upDown++;
            } else {
                upDown--;
            }
        }
        return leftRight == 0 && upDown == 0;
    }
}
