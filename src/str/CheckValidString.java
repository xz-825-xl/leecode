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
        Stack<Character> stack = new Stack<>();
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == '*') {
                count++;
                continue;
            }
            if (stack.isEmpty() || c == '(') {
                stack.push(c);
            } else if (c == ')' && stack.peek().equals('(')) {
                stack.pop();
            }
        }
        return stack.isEmpty() || count >= stack.size();
    }
}
