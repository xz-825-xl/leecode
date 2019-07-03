package array;

/**
 * @author Zhangying
 * @date 2019/7/3
 * leeCode 674
 */
public class FindLength {

    public static int findLengthOfLCIS(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int length = 1;
        int max = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            length = nums[i + 1] > nums[i] ? length + 1 : 1;
            max = Math.max(length, max);
        }
        return max;
    }
}
