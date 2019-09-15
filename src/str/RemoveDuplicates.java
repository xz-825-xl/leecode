package str;

import java.util.Stack;

/**
 * Created by ZY on 2019/9/15.
 * To be a happy coder!
 * 1047. 删除字符串中的所有相邻重复项
 */
public class RemoveDuplicates {
    public static String removeDuplicates(String S) {
        char[] chars = S.toCharArray();
        for (int i = 0; i < chars.length - 1; i++) {
            if (chars[i] == chars[i + 1]) {
                if (i + 1 == chars.length - 1) {
                    return new String(chars).substring(0, i);
                } else {
                    System.arraycopy(chars, i + 2, chars, i, chars.length - i - 2);
                    chars = new String(chars).substring(0, chars.length - 2).toCharArray();
                    i = -1;
                }
            }
        }
        return new String(chars);
    }

    public static String removeDuplicates2(String S) {
        char[] chars = S.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char c : chars) {
            if (!stack.isEmpty() && stack.peek() == c) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        StringBuilder builder = new StringBuilder();
        while (!stack.isEmpty()){
            builder.append(stack.pop());
        }
        return builder.reverse().toString();
    }
}
