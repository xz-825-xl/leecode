package number;

/**
 * 描述：509
 *
 * @author zy
 * @date 2019/11/27 8:59
 */
public class Fib {
    public int fib(int N) {
        if (N <= 1) {
            return N;
        }
        return fib(N - 1) + fib(N - 2);
    }

    public int fib2(int N) {
        if (N <= 1) {
            return N;
        }
        int a = 0;
        int b = 1;
        int rs = 0;
        for (int i = 2; i <= N; i++) {
            rs = a + b;
            a = b;
            b = rs;
        }
        return rs;
    }
}
