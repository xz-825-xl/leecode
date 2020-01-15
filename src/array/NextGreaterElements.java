package array;

/**
 * 描述：503. 下一个更大元素 II
 *
 * @author zy
 * @date 2020/1/15 10:59
 */
public class NextGreaterElements {
    public static int[] nextGreaterElements(int[] nums) {
        int[] rs = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = (i == nums.length - 1) ? 0 : i + 1;j < nums.length; j++) {
                if (nums[i] < nums[j]) {
                    rs[i] = nums[j];
                    break;
                }
                if (j == i) {
                    rs[i] = -1;
                    break;
                } else if (j == nums.length - 1) {
                    j = -1;
                }
            }
        }
        return rs;
    }

    public static int[] nextGreaterElements2(int[] nums) {
        int[] rs = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = (i == nums.length - 1) ? 0 : i + 1;j < nums.length; j++) {
                if (nums[i] < nums[j]) {
                    rs[i] = nums[j];
                    break;
                }
                if (j == i) {
                    rs[i] = -1;
                    break;
                } else if (j == nums.length - 1) {
                    j = -1;
                }
            }
        }
        return rs;
    }
}
