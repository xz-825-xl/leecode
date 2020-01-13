package array;

/**
 * Created by zy on 2020/1/12.
 * To be a happy coder!
 * 303. 区域和检索 - 数组不可变
 */
public class NumArray {

    private final int[] sum;

    public NumArray(int[] nums) {
        sum = new int[nums.length + 1];
        for (int i = 1; i <= nums.length; i++) {
            sum[i] = sum[i - 1] + nums[i - 1];
        }
    }

    public int sumRange(int i, int j) {
        return sum[j + 1] - sum[i];
    }
}
