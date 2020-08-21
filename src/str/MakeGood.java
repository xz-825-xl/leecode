package str;

import sort.BubbleSort;

import java.util.Stack;

/**
 * 描述：1544. 整理字符串
 *
 * @author Zhangying
 * @date 2020/8/21 16:29
 */
public class MakeGood {

    public static String makeGood(String s) {
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < chars.length; i++) {
            if (stack.empty()) {
                stack.push(chars[i]);
            } else {
                if (Math.abs(stack.peek() - chars[i]) == 32) {
                    stack.pop();
                } else {
                    stack.push(chars[i]);
                }
            }
        }
        StringBuilder builder = new StringBuilder();
        while (!stack.empty()) {
            builder.append(stack.pop());
        }
        return builder.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(makeGood("leEeetcode"));
    }
}
