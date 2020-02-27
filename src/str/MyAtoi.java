package str;

/**
 * 描述：8. 字符串转换整数 (atoi)
 *
 * @author zy
 * @date 2020/2/25 17:19
 */
public class MyAtoi {
    public static int myAtoi(String str) {
        char[] chars = str.toCharArray();
        //去除无用空格
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ') {
                continue;
            } else {
                chars = str.substring(i).toCharArray();
                break;
            }
        }

        // 空，-，+ ，以及其他字符都返回 0
        if (chars.length == 0
                || (chars.length == 1 && (chars[0] == '-' || chars[0] == '+'))
                || (!Character.isDigit(chars[0]) && chars[0] != '-' && chars[0] != '+')
                || (chars.length > 1 && (chars[0] == '-' || chars[0] == '+') && !Character.isDigit(chars[1]))) {
            return 0;
        }

        //获取有效数字
        String newStr = new String(chars);
        for (int i = 1; i < chars.length; i++) {
            if (!Character.isDigit(chars[i])) {
                newStr = newStr.substring(0, i);
                break;
            }
        }

        //判断是否超过int范围
        chars = newStr.toCharArray();
        Integer last = chars[chars.length - 1] - '0';
        Integer maxLast = Integer.MAX_VALUE % 10;
        Integer minLast = Math.abs(Integer.MIN_VALUE % 10);
        for (int i = 1; i < chars.length - 1; i++) {
            String curStr = newStr.substring(0, i + 1);
            if (chars[0] == '-' && (Integer.valueOf(curStr) < (Integer.MIN_VALUE / 10) || (Integer.valueOf(curStr) == (Integer.MIN_VALUE / 10) && minLast < last))) {
                return Integer.MIN_VALUE;
            } else if (chars[0] != '-' && (Integer.valueOf(curStr) > (Integer.MAX_VALUE / 10) || (Integer.valueOf(curStr) == (Integer.MAX_VALUE / 10) && maxLast < last))) {
                return Integer.MAX_VALUE;
            }
        }

        return Integer.valueOf(newStr);
    }

}
