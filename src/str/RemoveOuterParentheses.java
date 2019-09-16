package str;

import java.util.Stack;

/**
 * 描述：1021. 删除最外层的括号
 *
 * @author zy
 * @date 2019/9/16 8:34
 */
public class RemoveOuterParentheses {

    public static String removeOuterParentheses(String S) {
        char[] chars = S.toCharArray();
        Stack<Character> stack = new Stack<>();
        int index = 0;
        for (int i = 0; i < chars.length; i++) {
            if (stack.size() == 1 && stack.peek() != chars[i]) {
                chars[i] = ' ';
                chars[index] = ' ';
                index = i + 1;
                stack.pop();
            } else if (!stack.isEmpty() && stack.peek() != chars[i]) {
                stack.pop();
            } else {
                stack.push(chars[i]);
            }
        }
        return new String(chars).replaceAll(" ", "");
    }

}
