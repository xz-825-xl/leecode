package number;

import java.util.HashMap;
import java.util.Map;

/**
 * leeCode 1
 * @author Zhangying
 * @date 2019/6/25
 */
public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i]) && map.get(target - nums[i]) != i){
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        return new int[2];
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        System.out.println(twoSum(nums, 9));
    }
}
