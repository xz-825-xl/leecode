package str;

/**
 * 描述：5. 最长回文子串
 *
 * @author zy
 * @date 2020/2/12 15:08
 */
public class LongestPalindrome2 {

    public static String longestPalindrome(String s) {
        String rs = s.length() == 0 ? "" : s.substring(0, 1);
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length - 1; i++) {
            int left = i;
            int right = i;
            if (chars[i] == chars[i + 1]) {
                right = i + 1;
                while (left > 0 && right < chars.length - 1 && chars[left - 1] == chars[right + 1]) {
                    left--;
                    right++;
                }
                if (right - left + 1 > rs.length()) {
                    rs = s.substring(left, right + 1);
                }
            }
            left = i;
            if (i < chars.length - 2 && chars[i] == chars[i + 2]) {
                right = i + 2;
                while (left > 0 && right < chars.length - 1 && chars[left - 1] == chars[right + 1]) {
                    left--;
                    right++;
                }
                if (right - left + 1 > rs.length()) {
                    rs = s.substring(left, right + 1);
                }
            }
            if (rs.length() == s.length()) {
                return s;
            }
        }
        return rs;
    }

    //动态初始化
    public static String longestPalindrome2(String s) {
        int length = s.length();
        if (length < 2) {
            return s;
        }
        Integer maxLength = Integer.MIN_VALUE;
        int left = 0;
        int right = 0;
        boolean[][] table = new boolean[length][length];
        for (int i = 0; i < length; i++) {
            table[i][i] = true;
        }
        char[] chars = s.toCharArray();
        for (int i = 1; i < length; i++) {
            for (int j = 0; j < i; j++) {
                if (chars[i] == chars[j]) {
                    if (i - j < 3) {
                        table[j][i] = true;
                    } else {
                        table[j][i] = table[j + 1][i - 1];
                    }
                } else {
                    table[j][i] = false;
                }
                if (table[j][i] && i - j + 1 > maxLength) {
                    left = j;
                    right = i;
                    maxLength = i - j + 1;
                }
            }
        }
        return s.substring(left, right + 1);
    }
}
