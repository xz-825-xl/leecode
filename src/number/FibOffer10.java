package number;

/**
 * 描述：剑指 Offer 10- I. 斐波那契数列
 *
 * @author zy
 * @date 2020/7/15 14:46
 */
public class FibOffer10 {

    public int fib(int n) {
        if (n <= 1) {
            return n;
        }
        int a = 0;
        int b = 1;
        int rs = 0;
        for (int i = 2; i <= n; i++) {
            rs = (a + b) % 1000000007;
            a = b;
            b = rs;
        }
        return rs;
    }
}
