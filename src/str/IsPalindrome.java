package str;

/**
 * @author Zhangying
 * @date 2019/7/3
 * leeCode 125
 */
public class IsPalindrome {

    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length();
        while (left < right) {
            if (!Character.isAlphabetic(s.charAt(left)) && !Character.isDigit(s.charAt(left))) {
                left++;
                continue;
            }
            if (!Character.isAlphabetic(s.charAt(right - 1)) && !Character.isDigit(s.charAt(right - 1))) {
                right--;
                continue;
            }
            if (Character.toLowerCase(s.charAt(left)) == Character.toLowerCase(s.charAt(right - 1))) {
                left++;
                right--;
            } else {
                return false;
            }
        }
        return true;
    }

}
