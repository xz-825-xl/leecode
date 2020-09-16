package array;

/**
 * 描述：486. 预测赢家
 *
 * @author Zhangying
 * @date 2020/9/1 9:06
 */
public class PredictTheWinner {

    public boolean PredictTheWinner(int[] nums) {
        return getResult(nums, 0, nums.length - 1, 0, 0);
    }

    private boolean getResult(int[] nums, int i, int j, int sum1, int sum2) {
        if (i > j) {
            return sum1 >= sum2;
        } else if (i == j) {
            return getResult(nums, i + 1, j - 1, sum1 + nums[i], sum2);
        } else {
            boolean flag1 = getResult(nums, i + 1, j - 1, sum1 + nums[i], sum2 + nums[j]) && getResult(nums, i + 2, j, sum1 + nums[i], sum2 + nums[i + 1]);
            boolean flag2 = getResult(nums, i + 1, j - 1, sum1 + nums[j], sum2 + nums[i]) && getResult(nums, i, j - 2, sum1 + nums[j], sum2 + nums[j - 1]);
            return flag1 || flag2;
        }
    }

    public static void main(String[] args) {
        System.out.println(new PredictTheWinner().PredictTheWinner(new int[]{1, 5, 2}));
        System.out.println(new PredictTheWinner().PredictTheWinner(new int[]{1, 5, 233, 7}));
    }
}
