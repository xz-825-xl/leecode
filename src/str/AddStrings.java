package str;

/**
 * 描述：415. 字符串相加
 *
 * @author Zhangying
 * @date 2020/8/3 9:50
 */
public class AddStrings {

    public String addStrings(String num1, String num2) {
        int count = Math.max(num1.length(), num2.length());
        boolean flag = false;
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < count; i++) {
            int tmp = 0;
            if (i < num1.length()) {
                tmp = tmp + Integer.valueOf(num1.substring(num1.length() - 1 - i, num1.length() - i));
            }
            if (i < num2.length()) {
                tmp = tmp + Integer.valueOf(num2.substring(num2.length() - 1 - i, num2.length() - i));
            }
            if (flag) {
                tmp++;
            }
            if (tmp >= 10) {
                tmp = tmp - 10;
                flag = true;
            } else {
                flag = false;
            }
            builder.append(tmp);
        }
        if (flag) {
            builder.append(1);
        }
        return builder.reverse().toString();
    }

}
