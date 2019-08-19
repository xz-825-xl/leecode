package array;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Zhangying
 * @date 2019/8/19
 * leeCode 167
 */
public class TwoSum2 {
    public static int[] twoSum(int[] numbers, int target) {
        int[] rs = new int[2];
        Map<Integer, Integer> map = new HashMap<>(numbers.length);
        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(target - numbers[i])) {
                rs[0] = map.get(target - numbers[i]);
                rs[1] = i + 1;
                break;
            } else {
                map.put(numbers[i], i + 1);
            }
        }
        return rs;
    }

    public static int[] twoSum2(int[] numbers, int target) {
        int[] rs = new int[2];
        int index1 = 0;
        int index2 = numbers.length - 1;
        while (index1 < index2) {
            if (numbers[index1] + numbers[index2] == target) {
                return new int[]{index1 + 1, index2 + 1};
            }
            if (numbers[index1] + numbers[index2] > target) {
                index2--;
            }
            if (numbers[index1] + numbers[index2] < target) {
                index1++;
            }
        }
        return rs;
    }
}
