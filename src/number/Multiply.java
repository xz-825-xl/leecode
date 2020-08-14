package number;

import java.util.ArrayList;
import java.util.List;

/**
 * 描述：43. 字符串相乘
 *
 * @author Zhangying
 * @date 2020/8/13 9:07
 */
public class Multiply {
    public static String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }
        List<char[]> list = new ArrayList<>();

        char[] chars1 = num1.toCharArray();
        char[] chars2 = num2.toCharArray();
        int maxLength = 0;
        for (int i = chars1.length - 1; i >= 0; i--) {
            StringBuilder temp = new StringBuilder();
            int tempNum = 0;
            for (int j = 0; j < chars1.length - 1 - i; j++) {
                temp.append("0");
            }
            for (int j = chars2.length - 1; j >= 0; j--) {
                int multiply = (chars1[i] - '0') * (chars2[j] - '0') + tempNum;
                temp.append(multiply % 10);
                tempNum = multiply / 10;
            }
            if (tempNum > 0) {
                temp.append(tempNum);
            }
            list.add(temp.toString().toCharArray());
            maxLength = Math.max(maxLength, temp.toString().length());
        }

        int temp = 0;
        StringBuilder rs = new StringBuilder();
        for (int i = 0; i < maxLength; i++) {
            int sum = 0;
            for (char[] chars : list) {
                if (chars.length > i) {
                    sum += (chars[i] - '0');
                }
            }
            sum += temp;
            temp = sum / 10;
            rs.append(sum % 10);
        }
        if (temp > 0) {
            rs.append(temp);
        }
        return rs.reverse().toString();
    }

    public static void main(String[] args) {
        //System.out.println(multiply("2", "3"));
        System.out.println(multiply("123", "456"));
    }

}
