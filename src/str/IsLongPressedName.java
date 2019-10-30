package str;

/**
 * 描述：925. 长按键入
 *
 * @author zy
 * @date 2019/10/30 9:14
 */
public class IsLongPressedName {
    public static boolean isLongPressedName(String name, String typed) {
        char[] chars = name.toCharArray();
        char[] chars1 = typed.toCharArray();
        int index = 0;
        for (int i = 0; i < chars.length; i++) {
            if (index < chars1.length && chars[i] == chars1[index]) {
                index++;
            } else if (index < chars1.length && i > 0 && chars[i - 1] == chars1[index]) {
                while (index < chars1.length && chars[i - 1] == chars1[index]) {
                    index++;
                }
                if (index >= chars1.length || chars[i] != chars1[index]) {
                    return false;
                } else {
                    index++;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public static boolean isLongPressedName1(String name, String typed) {
        char[] chars = name.toCharArray();
        char[] chars1 = typed.toCharArray();
        int index = 0;
        int index1 = 0;
        while (index < chars.length && index1 < chars1.length) {
            if (chars[index] == chars1[index1]) {
               index++;
            }
            index1++;
        }
        return index == chars.length;
    }
}
