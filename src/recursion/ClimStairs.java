package recursion;

/**
 * @author Zhangying
 * @date 2019/7/3
 * leeCode 70
 */
public class ClimStairs {

    public static int climbStairs(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        return climbStairs(n - 1) + climbStairs(n - 2);
    }

    public static int climbStairs2(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        int first = 1;
        int second = 2;
        int total = 0;
        for (int i = 3; i <= n; i++) {
            total = first + second;
            first = second;
            second = total;
        }
        return total;
    }
}
