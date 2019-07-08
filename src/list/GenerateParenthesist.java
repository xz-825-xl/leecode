package list;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by zy on 2019/7/7.
 * To be a happy coder!
 * leeCode 22
 */
public class GenerateParenthesist {

    // TODO:
    public static List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        Stack<Character> stack = new Stack();
        StringBuilder builder = new StringBuilder();
        generate(list, stack, builder, '(', n - 1);
        return list;
    }

    public static void generate(List<String> list, Stack<Character> stack, StringBuilder builder, char c, int n) {

        if (n < 0 && stack.isEmpty()) {
            list.add(builder.toString());
        } else if (n >= 0) {
            builder.append(c);
            if (stack.isEmpty() || (!stack.isEmpty() && stack.peek() == c)) {
                stack.add(c);
            } else {
                stack.pop();
            }
            generate(list, stack, builder, '(', n - 1);
            generate(list, stack, builder, ')', n - 1);
        }
    }
}
