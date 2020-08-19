package str;

/**
 * 描述：647. 回文子串
 *
 * @author Zhangying
 * @date 2020/8/19 9:01
 */
public class CountSubstrings {

    public static int countSubstrings(String s) {
        int count = s.length();
        char[] chars = s.toCharArray();
        int[][] flags = new int[count][count];

        for (int i = 0; i < chars.length; i++) {
            flags[i][i] = 1;
        }

        for (int i = 0; i < chars.length; i++) {
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j] && (j - i == 1 || getFlag(flags, i + 1, j - 1, chars) == 1)) {
                    count++;
                    flags[i][j] = 1;
                }
            }
        }
        return count;
    }

    private static int getFlag(int[][] flags, int i, int j, char[] chars) {
        if (flags[i][j] == 0) {
            if (chars[i] == chars[j]) {
                if (j - i == 1) {
                    flags[i][j] = 1;
                    return 1;
                } else {
                    if (getFlag(flags, i + 1, j - 1, chars) == 1) {
                        flags[i][j] = 1;
                        return 1;
                    } else {
                        return 0;
                    }
                }
            } else {
                return 0;
            }
        } else {
            return 1;
        }

    }

    public static void main(String[] args) {
        //System.out.println(countSubstrings("abc"));
        //System.out.println(countSubstrings("aaa"));
        System.out.println(countSubstrings("aaaaa"));
    }
}
