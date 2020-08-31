package str;

import java.util.Arrays;

/**
 * 描述：1370. 上升下降字符串(未完成)
 *
 * @author Zhangying
 * @date 2020/8/28 15:37
 */
public class SortString {
    boolean[] flag;

    public String sortString(String s) {
        StringBuilder builder = new StringBuilder();
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        flag = new boolean[chars.length];
        Arrays.fill(flag, true);

        int count = 0;
        while (count < chars.length) {
            count = ascCount(count, chars, 0, builder);
            count = descCount(count, chars, chars.length - 1, builder);
        }
        return builder.toString();
    }

    private int ascCount(int count, char[] chars, int i, StringBuilder builder) {
        if (count < chars.length && i < chars.length) {
            if (flag[i] && (i == 0 || (i > 0 && (!flag[i - 1] || chars[i] != chars[i - 1])))) {
                builder.append(chars[i]);
                flag[i] = false;
                count++;
            }
            return ascCount(count, chars, i + 1, builder);
        }
        return count;
    }

    private int descCount(int count, char[] chars, int i, StringBuilder builder) {
        if (count < chars.length && i >= 0) {
            if (flag[i] && (i == chars.length - 1 || (i < chars.length - 1 && (!flag[i + 1] || chars[i] != chars[i + 1])))) {
                builder.append(chars[i]);
                flag[i] = false;
                count++;
            }
            return descCount(count, chars, i - 1, builder);
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(new SortString().sortString("aaaabbbbcccc"));
        System.out.println(new SortString().sortString("rat"));

    }
}
