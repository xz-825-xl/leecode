package str;

import java.util.Arrays;

/**
 * 描述：1370. 上升下降字符串
 *
 * @author Zhangying
 * @date 2020/8/28 15:37
 */
public class SortString {

    public String sortString(String s) {
        StringBuilder builder = new StringBuilder();
        char[] chars = s.toCharArray();
        int[] counts = new int[26];
        Arrays.fill(counts, 0);
        for (int i = 0; i < chars.length; i++) {
            counts[chars[i] - 'a']++;
        }
        while (builder.length() < chars.length) {
            for (int i = 0; i < 26; i++) {
                if (counts[i] > 0) {
                    builder.append((char) (i + 'a'));
                }
                counts[i]--;
            }

            for (int i = 25; i >= 0; i--) {
                if (counts[i] > 0) {
                    builder.append((char) (i + 'a'));
                }
                counts[i]--;
            }
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        System.out.println(new SortString().sortString("aaaabbbbcccc"));
        System.out.println(new SortString().sortString("rat"));

    }
}
