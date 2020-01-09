package array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 描述：532. 数组中的K-diff数对
 *
 * @author zy
 * @date 2020/1/9 8:41
 */
public class FindPairs {
    public static int findPairs(int[] nums, int k) {
        if (k < 0) {
            return 0;
        }
        Set<String> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] - nums[j] == k) {
                    set.add(nums[i] + "_" + nums[j]);
                }
                if (nums[j] - nums[i] == k) {
                    set.add(nums[j] + "_" + nums[i]);
                }
            }
        }
        return set.size();
    }

    public static int findPairs2(int[] nums, int k) {
        if (k < 0) {
            return 0;
        }
        int count = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] - nums[i] == k) {
                    count++;
                    while (i < nums.length - 1 && nums[i] == nums[i + 1]) {
                        i++;
                    }
                    break;
                }
            }
        }
        return count;
    }

    public static int findPairs3(int[] nums, int k) {
        if (k < 0) {
            return 0;
        }
        int count = 0;
        Arrays.sort(nums);
        int start = 0;
        Integer pre = null;
        for (int i = 1; i < nums.length; i++) {
            if ((pre != null && pre == nums[start]) || nums[i] - nums[start] > k) {
                start++;
                if (start != i) {
                    i--;
                }
            } else if (nums[i] - nums[start] == k) {
                pre = nums[start];
                start++;
                count++;
            }
        }
        return count;
    }
}
