package str;

/**
 * 描述：917. 仅仅反转字母
 *
 * @author zy
 * @date 2019/9/11 8:36
 */
public class ReverseOnlyLetters {
    public static String reverseOnlyLetters(String S) {
        char[] chars = S.toCharArray();
        int left = 0;
        int right = S.length() - 1;
        while (left < right) {
            if(Character.isAlphabetic(chars[left]) && Character.isAlphabetic(chars[right])){
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }
            if (!Character.isAlphabetic(chars[left])) {
                left++;
            }
            if (!Character.isAlphabetic(chars[right])) {
                right--;
            }
        }
        return new String(chars);
    }
}
