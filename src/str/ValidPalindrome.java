package str;

/**
 * @author Zhangying
 * @date 2019/8/1
 * leeCode 680
 */
public class ValidPalindrome {

    public static boolean validPalindrome(String s) {
        int first = 0;
        int last = s.length() - 1;
        while (first < last){
            if(s.charAt(first) != s.charAt(last)){
                return isPalindrome(s.substring(first + 1, last + 1)) || isPalindrome(s.substring(first, last));
            }
            first++;
            last--;
        }
        return true;
    }

    private static boolean isPalindrome(String s){
        int first = 0;
        int last = s.length() - 1;
        while (first < last){
            if(s.charAt(first) != s.charAt(last)){
                return false;
            }
            first++;
            last--;
        }
        return true;
    }

}
