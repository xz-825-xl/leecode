package array;

import java.util.HashSet;
import java.util.Set;

/**
 * 描述：面试题03. 数组中重复的数字
 *
 * @author zy
 * @date 2020/6/30 15:55
 */
public class FindRepeatNumber {

    public int findRepeatNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if(set.contains(nums[i])){
                return nums[i];
            }
            set.add(nums[i]);
        }
        return nums[0];
    }
}
