package number;

/**
 * 描述：面试题10- II. 青蛙跳台阶问题
 *
 * @author zy
 * @date 2020/6/12 16:48
 */
public class NumWays {

    public int numWays(int n) {
        if (n == 0) {
            return 1;
        }
        int[] count = new int[n + 1];
        count[0] = 1;
        count[1] = 1;
        for (int i = 2; i <= n; i++) {
            count[i] = count[i - 1] + count[i - 2];
            count[i] %= 1000000007;
        }
        return count[n];
    }
}
