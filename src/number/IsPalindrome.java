package number;

/**
 * @author Zhangying
 * @date 2019/7/9
 * leeCode 9
 */
public class IsPalindrome {

    public boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        return str.equals(new StringBuilder(str).reverse().toString());
    }

    public boolean isPalindrome2(int x) {
        if (x < 0) {
            return false;
        }
        int reverseNum = 0;
        int tmp = x;
        while (tmp > 0){
            reverseNum = reverseNum * 10 + tmp % 10;
            tmp = tmp / 10;
        }
        return x == reverseNum;
    }


}
