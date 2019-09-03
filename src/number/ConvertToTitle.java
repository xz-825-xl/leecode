package number;

/**
 * @author Zhangying
 * @date 2019/9/3
 * 168. Excel表列名称
 */
public class ConvertToTitle {

    public static String convertToTitle(int n) {
        char[] chars = "ZABCDEFGHIJKLMNOPQRSTUVWXY".toCharArray();
        StringBuilder builder = new StringBuilder();
        while (n > 0) {
            builder.append(chars[n % 26]);
            if (n % 26 == 0) {
                n--;
            }
            n = n / 26;
        }
        return builder.reverse().toString();
    }
}
