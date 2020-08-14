package array;

import java.util.Arrays;

/**
 * 描述：1365. 有多少小于当前数字的数字
 *
 * @author Zhangying
 * @date 2020/8/14 17:19
 */
public class SmallerNumbersThanCurrent {
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] rs = new int[nums.length];
        Arrays.fill(rs, 0);
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    rs[i]++;
                } else if (nums[i] < nums[j]) {
                    rs[j]++;
                }
            }
        }
        return rs;
    }

    public static void main(String[] args) {
        smallerNumbersThanCurrent(new int[]{8, 1, 2, 2, 3});
    }
}
