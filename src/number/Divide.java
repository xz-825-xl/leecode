package number;

/**
 * 描述：29. 两数相除 (未完成)
 *
 * @author zy
 * @date 2020/7/21 14:43
 */
public class Divide {

    public static int divide(int dividend, int divisor) {
        boolean flag = (dividend > 0 && divisor > 0) || (dividend < 0 && divisor < 0);
        long div = dividend;
        div = div < 0 ? -div : div;
        long divisor1 = divisor;
        divisor1 = divisor1 < 0 ? -divisor1 : divisor1;
        if (divisor1 > div) {
            return 0;
        }
        int count = 1;
        long sum = divisor1;
        while (true) {
            sum += divisor1;
            if (sum > div) {
                count = flag && count < 0 ? Integer.MAX_VALUE : count;
                return flag ? count : 0 - count;
            } else {
                count++;
            }
        }
    }

    public static void main(String[] args) {
        //System.out.println(divide(10, 3));
        //System.out.println(divide(7, -3));
        //System.out.println(Math.abs(-2147483648) + "," + Math.abs(-1) + "," + (0 - (-2147483648)));
        System.out.println(divide(-2147483648, -1));
    }
}
