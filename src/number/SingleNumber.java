package number;

import java.util.Arrays;

/**
 * 描述：137. 只出现一次的数字 II
 *
 * @author zy
 * @date 2020/1/17 11:10
 */
public class SingleNumber {
    public static int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i += 3) {
            if (nums[i] != nums[i + 2]) {
                return nums[i + 1] == nums[i] ? nums[i + 2] : nums[i];
            }
        }
        return nums[nums.length - 1];
    }

    public int singleNumber2(int[] nums) {
        int ones = 0, twos = 0;
        for(int num : nums){
            ones = ones ^ num & ~twos;
            twos = twos ^ num & ~ones;
        }
        return ones;
    }
}
