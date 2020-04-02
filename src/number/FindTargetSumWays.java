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

    public static void main(String[] args) {
        System.out.println(findTargetSumWays(new int[]{1, 1, 1, 1, 1}, 3));
    }
}
