package str;

import java.util.Stack;

/**
 * 描述：678. 有效的括号字符串
 *
 * @author zy
 * @date 2020/3/5 17:27
 */
public class CheckValidString {
    public boolean checkValidString(String s) {
        Stack<Integer> left = new Stack<>();
        Stack<Integer> star = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                left.push(i);
            } else if (s.charAt(i) == '*') {
                star.push(i);
            } else {
                if (left.empty() && star.empty()){
                    return false;
                }
                if (!left.empty()){
                    left.pop();
                } else{
                    star.pop();
                }

            }
        }
        while (!left.empty() && !star.empty()) {
            if (left.peek() > star.peek()){
                return false;
            }
            left.pop();
            star.pop();
        }
        return left.empty();
    }
}
