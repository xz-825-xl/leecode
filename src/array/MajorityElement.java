package array;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Zhangying
 * @date 2019/8/20
 * leeCode 169 求众数
 */
public class MajorityElement {

    public int majorityElement(int[] nums) {
        int maxNum = nums[0], maxCount = 1;
        Map<Integer, Integer> map = new HashMap<>(nums.length);
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
                if (map.get(num) + 1 > maxCount) {
                    maxCount = map.get(num) + 1;
                    maxNum = num;
                }
            } else {
                map.put(num, 1);
            }
        }
        return maxNum;
    }

    public int majorityElement2(int[] nums) {
        int candi = 0, count = 0;
        for (int num : nums) {
            if (count == 0) {
                candi = num;
                count = 1;
            } else {
                if (num == candi) {
                    count++;
                } else {
                    count--;
                }
            }
        }
        return candi;
    }
}
