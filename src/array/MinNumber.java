package array;

import java.util.Arrays;

/**
 * 描述：面试题45. 把数组排成最小的数
 *
 * @author zy
 * @date 2020/6/15 8:50
 */
public class MinNumber {

    public String minNumber(int[] nums) {
        String[] numStrs = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            numStrs[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(numStrs, ((o1, o2) -> (o1 + o2).compareTo(o2 + o1)));
        StringBuilder builder = new StringBuilder();
        for (String numStr : numStrs) {
            builder.append(numStr);
        }
        return builder.toString();
    }
}
