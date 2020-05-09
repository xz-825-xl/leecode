package str;

import java.util.Stack;

/**
 * 描述：856. 括号的分数
 *
 * @author zy
 * @date 2020/4/29 17:50
 */
public class ScoreOfParentheses {
    public static int scoreOfParentheses(String S) {
        char[] chars = S.toCharArray();
        Stack<Character> stack = new Stack<>();
        Stack<Integer> countStack = new Stack<>();
        Stack<Integer> layers = new Stack<>();
        int layer = -1;
        for (int i = 0; i < chars.length; i++) {
            if (stack.isEmpty() || stack.peek().equals(chars[i])) {
                stack.push(chars[i]);
                layer++;
            } else {
                stack.pop();
                if (countStack.isEmpty() || layer > layers.peek()) {
                    countStack.push(1);
                } else if (layer == layers.peek()) {
                    countStack.push(countStack.pop() + 1);
                    layers.pop();
                } else {
                    countStack.push(countStack.pop() * 2);
                    layers.pop();
                }
                if (!layers.isEmpty()) {
                    while (!layers.isEmpty() && layers.peek() == layer) {
                        countStack.push(countStack.pop() + countStack.pop());
                        layers.pop();
                    }
                }
                layers.push(layer);
                layer--;
            }
        }
        return countStack.peek();
    }

    public static int scoreOfParentheses2(String S) {
        int count = 0;
        char[] chars = S.toCharArray();
        int layer = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(') {
                layer++;
            } else {
                layer--;
                if(chars[i - 1] == '(') {
                    count += 1 << layer;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(scoreOfParentheses2("(()(()))"));
    }
}