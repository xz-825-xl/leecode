package array;

import java.util.Arrays;

/**
 * 描述：581. 最短无序连续子数组
 *
 * @author zy
 * @date 2019/9/29 14:58
 */
public class FindUnsortedSubarray {
    public int findUnsortedSubarray(int[] nums) {
        int[] temp = new int[nums.length];
        System.arraycopy(nums, 0, temp, 0, nums.length);
        Arrays.sort(temp);
        int first = -1;
        int last = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != temp[i]) {
                if (first < 0) {
                    first = i;
                }
                last = i;
            }
        }
        return last == first ? 0 : last - first + 1;
    }
}
