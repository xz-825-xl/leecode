package number;

/**
 * @author Zhangying
 * @date 2019/8/27
 * 754. 到达终点数字
 */
public class ReachNumber {

    public static int reachNumber(int target) {
        int count = 0;
        int sum = 0;
        target = Math.abs(target);
        while (sum < target || (target - sum) % 2 != 0) {
            sum += count;
            count++;
        }
        return count - 1;
    }
}
