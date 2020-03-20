package number;

/**
 * 描述：面试题43. 1～n整数中1出现的次数
 *
 * @author zy
 * @date 2020/3/11 8:57
 */
public class CountDigitOne {
    public static int countDigitOne(int n) {
        if (n <= 0) {
            return 0;
        }
        String s = String.valueOf(n);
        int high = s.charAt(0) - '0';
        int pow = (int) Math.pow(10, s.length() - 1);
        int last = n - high * pow;
        if (high == 1) {
            return countDigitOne(pow - 1) + last + 1 + countDigitOne(last);
        } else {
            return pow + high * countDigitOne(pow - 1) + countDigitOne(last);
        }
    }

    public static void main(String[] args) {
        countDigitOne(9);
    }
}
