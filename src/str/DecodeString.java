package str;

import java.util.Stack;

/**
 * 描述：394. 字符串解码
 *
 * @author zy
 * @date 2020/5/28 8:44
 */
public class DecodeString {

    public static String decodeString(String s) {
        char[] chars = s.toCharArray();
        Stack<Integer> numStack = new Stack<>();
        Stack<String> charStack = new Stack<>();
        StringBuilder subBuilder = new StringBuilder();
        int i = 0;
        while (i < chars.length) {
            if (Character.isDigit(chars[i])) {
                String num = chars[i] + "";
                while (Character.isDigit(chars[i + 1])){
                    num = num + chars[i + 1];
                    i++;
                }
                numStack.push(Integer.valueOf(num));
            } else if (chars[i] == '[') {
                charStack.push("[");
            } else if (chars[i] != ']') {
                if(!charStack.isEmpty() && charStack.peek().equals("[")){
                    charStack.push(chars[i] + "");
                } else {
                    charStack.push((charStack.isEmpty() ? "" : charStack.pop()) + chars[i] + "");
                }
            } else {
                String temp = charStack.pop();
                if(!charStack.isEmpty() && charStack.peek().equals("[")) {
                    int num = numStack.pop();
                    for (int j = 0; j < num ; j++) {
                        subBuilder.append(temp);
                    }
                    charStack.pop();
                    charStack.push(charStack.isEmpty() || charStack.peek().equals("[") ? subBuilder.toString() : charStack.pop() + subBuilder.toString());
                    subBuilder = new StringBuilder();
                } else {
                    charStack.push(temp);
                }
            }
            i++;
        }
        return charStack.isEmpty() ? "" : charStack.peek();
    }

    public static String decodeString2(String s) {
        char[] chars = s.toCharArray();
        Stack<Integer> numStack = new Stack<>();
        Stack<String> charStack = new Stack<>();
        StringBuilder subBuilder = new StringBuilder();
        int i = 0;
        while (i < chars.length) {
            if (Character.isDigit(chars[i])) {
                String num = chars[i] + "";
                while (Character.isDigit(chars[i + 1])){
                    num = num + chars[i + 1];
                    i++;
                }
                numStack.push(Integer.valueOf(num));
            } else if (chars[i] == '[') {
                charStack.push("[");
            } else if (chars[i] != ']') {
                if(!charStack.isEmpty() && charStack.peek().equals("[")){
                    charStack.push(chars[i] + "");
                } else {
                    charStack.push((charStack.isEmpty() ? "" : charStack.pop()) + chars[i] + "");
                }
            } else {
                String temp = charStack.pop();
                if(!charStack.isEmpty() && charStack.peek().equals("[")) {
                    int num = numStack.pop();
                    for (int j = 0; j < num ; j++) {
                        subBuilder.append(temp);
                    }
                    charStack.pop();
                    charStack.push(charStack.isEmpty() || charStack.peek().equals("[") ? subBuilder.toString() : charStack.pop() + subBuilder.toString());
                    subBuilder = new StringBuilder();
                } else {
                    charStack.push(temp);
                }
            }
            i++;
        }
        return charStack.isEmpty() ? "" : charStack.peek();
    }

    public static void main(String[] args) {
        //System.out.println(decodeString("3[a2[c]]"));
        //System.out.println(decodeString("leetcode"));
        //System.out.println(decodeString("3[a]2[bc]"));
        //System.out.println(decodeString("100[leetcode]"));
        System.out.println(decodeString("3[z]2[2[y]pq4[2[jk]e1[f]]]ef"));
    }
}
