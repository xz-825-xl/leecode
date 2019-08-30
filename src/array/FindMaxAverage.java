package array;

/**
 * @author Zhangying
 * @date 2019/8/30
 * leeCode 643 子数组最大平均数 I
 */
public class FindMaxAverage {

    public static double findMaxAverage(int[] nums, int k) {
        if (nums.length == 0) {
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        int temp = sum;
        for (int i = 1; i <= nums.length - k; i++) {
            temp = temp - nums[i - 1] + nums[i + k - 1];
            sum = Math.max(temp, sum);
        }
        return (double)sum / k;
    }

}
