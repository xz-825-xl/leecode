package number;

/**
 * 描述：494. 目标和
 *
 * @author zy
 * @date 2020/3/31 8:51
 */
public class FindTargetSumWays {

    public static int findTargetSumWays(int[] nums, int S) {

        return findTargetSumWays(nums, S, 0);
    }

    public static int findTargetSumWays(int[] nums, int S, int index) {
        if (nums.length == index) {
            return S == 0 ? 1 : 0;
        }
        return findTargetSumWays(nums, S - nums[index], index + 1) + findTargetSumWays(nums, S + nums[index], index + 1);
    }

    public static int findTargetSumWays2(int[] nums, int S) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        if (sum < S || (S + sum) % 2 == 1) {
            return 0;
        }
        int x = (S + sum) / 2;
        int[] rs = new int[x + 1];
        rs[0] = 1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = x; j >= nums[i]; j--) {
                rs[j] = rs[j] + rs[j - nums[i]];
            }
        }
        return rs[x];
    }

    public static void main(String[] args) {
        System.out.println(findTargetSumWays2(new int[]{1, 1, 1, 1, 1}, 3));
        System.out.println(findTargetSumWays2(new int[]{1}, 2));
    }
}
