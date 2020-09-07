package array;

import java.util.*;

/**
 * 描述：347. 前 K 个高频元素
 *
 * @author Zhangying
 * @date 2020/9/7 8:54
 */
public class TopKFrequent {
    public int[] topKFrequent(int[] nums, int k) {
        int[] rs = new int[k];
        List<Set<Integer>> list = new ArrayList<>();
        for (int i = 0; i <= nums.length; i++) {
            list.add(new HashSet<>());
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i <  nums.length; i++) {
            int count = map.getOrDefault(nums[i], 0);
            list.get(count).remove(nums[i]);
            count++;
            map.put(nums[i], count);
            list.get(count).add(nums[i]);
        }

        int index = 0;
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i).size() != 0) {
                Set<Integer> set = list.get(i);
                for (Integer num : set) {
                    rs[index] = num;
                    index++;
                    if (index > rs.length - 1) {
                        return rs;
                    }
                }
            }
        }
        return rs;
    }

    public static void main(String[] args) {
        new TopKFrequent().topKFrequent(new int[]{1,1,1,2,2,3}, 2);
    }
}
