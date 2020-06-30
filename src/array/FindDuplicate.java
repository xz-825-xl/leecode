package array;

import java.util.HashSet;
import java.util.Set;

/**
 * 描述：287. 寻找重复数
 *
 * @author zy
 * @date 2020/5/26 9:08
 */
public class FindDuplicate {

    public int findDuplicate(int[] nums) {
        int num = nums[0];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return nums[i];
                }
            }
        }
        return num;
    }

    public int findDuplicate2(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return nums[i];
            }
            set.add(nums[i]);
        }
        return nums[0];
    }

    public int findDuplicate3(int[] nums) {
        int slow = nums[0];
        int fast = nums[nums[0]];
        //寻找相遇点
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[nums[fast]];
        }
        //slow 从起点出发, fast 从相遇点出发, 一次走一步
        slow = 0;
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
}
