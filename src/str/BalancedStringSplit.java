package str;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 描述：1221. 分割平衡字符串
 *
 * @author zy
 * @date 2019/10/16 10:14
 */
public class BalancedStringSplit {

    public int balancedStringSplit(String s) {
        int count = 0;
        char[] chars = s.toCharArray();
        Queue<Character> queue = new LinkedList<>();
        for (int i = 0; i < chars.length; i++) {
            if (queue.isEmpty() || queue.peek() == chars[i]) {
                queue.offer(chars[i]);
            } else if (queue.peek() != chars[i]) {
                queue.poll();
                if (queue.isEmpty()) {
                    count++;
                }
            }
        }
        return count;
    }

    public int balancedStringSplit2(String s) {
        int count = 0;
        char[] chars = s.toCharArray();
        int temp = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'L') {
                temp++;
            } else {
                temp--;
            }
            if (temp == 0) {
                count++;
            }
        }
        return count;
    }

}
