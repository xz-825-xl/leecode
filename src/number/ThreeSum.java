package number;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 描述：15. 三数之和
 *
 * @author zy
 * @date 2020/3/10 17:16
 */
public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        if (nums.length == 0 || nums[0] > 0 || nums[nums.length - 1] < 0) {
            return list;
        }

        for (int i = 0; i < nums.length - 1; i++) {
            int low = i + 1;
            int high = nums.length - 1;
            while (low < high) {
                if (nums[i] + nums[low] + nums[high] == 0) {
                    List<Integer> subList = new ArrayList<>();
                    subList.add(nums[i]);
                    subList.add(nums[low]);
                    subList.add(nums[high]);
                    list.add(subList);
                    while (low < nums.length - 1 && nums[low] == nums[low + 1]) {
                        low++;
                    }
                    low++;
                    high--;
                } else if (nums[i] + nums[low] + nums[high] > 0) {
                    high--;
                } else {
                    low++;
                }


            }
            while (i < nums.length - 1 && nums[i] == nums[i + 1]) {
                i++;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        threeSum(new int[]{-2,0,1,1,2});
    }
}
