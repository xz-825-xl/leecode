package array;

/**
 * 描述：LCP 1. 猜数字
 *
 * @author zy
 * @date 2019/10/14 8:49
 */
public class Game {
    public int game(int[] guess, int[] answer) {
        int count = 0;
        for (int i = 0; i < guess.length; i++) {
            if(guess[i] == answer[i]){
                count++;
            }
        }
        return count;
    }
}
