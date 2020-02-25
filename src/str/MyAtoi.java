package str;

/**
 * 描述：8. 字符串转换整数 (atoi)
 *
 * @author zy
 * @date 2020/2/25 17:19
 */
public class MyAtoi {
    public int myAtoi(String str) {
        int rs = 0;
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (Character.isDigit(chars[i]) || chars[i] == '-') {

            }
        }
        return rs;
    }
}
