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
        int x = (S + sum) / 2;
        int[][] rs = new int[nums.length + 1][x + 1];
        rs[0][0] = 1;
        for (int i = 1; i < nums.length + 1; i++) {
            rs[i][0] = 1;
            for (int j = 0; j < x + 1; j++) {

            }
        }
        return rs[nums.length + 1][x + 1];
    }

    public static void main(String[] args) {
        System.out.println(findTargetSumWays(new int[]{1, 1, 1, 1, 1}, 3));
    }
}
