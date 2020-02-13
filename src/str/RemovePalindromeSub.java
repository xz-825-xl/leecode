package str;

/**
 * 描述：1332. 删除回文子序列
 *
 * @author zy
 * @date 2020/2/9 12:12
 */
public class RemovePalindromeSub {
    public static int removePalindromeSub(String s) {
        if (s.length() == 0) {
            return 0;
        }
        char[] chars = s.toCharArray();
        boolean isPalindrome = true;
        for (int i = 0; i < chars.length / 2; i++) {
            if (chars[i] != chars[chars.length - 1 - i]) {
                isPalindrome = false;
                break;
            }
        }
        return isPalindrome ? 1 : 2;
    }
}
