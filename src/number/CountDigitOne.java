package number;

/**
 * 描述：面试题43. 1～n整数中1出现的次数
 *
 * @author zy
 * @date 2020/3/11 8:57
 */
public class CountDigitOne {
    public static int countDigitOne(int n) {
        int count = 0;
        while (n > 0) {
            count += getCountByNum(n);
            n /= 10;
        }
        return count;
    }

    private static int getCountByNum(int num) {
        int count = 0;
        if (num < 10) {
            return 1;
        }
        return count;
    }

    public static void main(String[] args) {
        countDigitOne(12);
    }
}
