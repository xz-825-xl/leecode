package array;

/**
 * 1051. 高度检查器
 * Created by zy on 2019/10/13.
 * To be a happy coder!
 */
public class HeightChecker {

    public static int heightChecker(int[] heights) {
        int count = 0;
        int[] nums = new int[101];
        int[] nums1 = new int[101];
        for (int i = 0; i < heights.length; i++) {
            nums1[heights[i]]++;
        }
        int sum = 0;
        for (int i = 0; i < nums1.length; i++) {
            nums[i] = sum;
            sum += nums1[i];
        }
        for (int i = 0; i < heights.length; i++) {
            int indexMin = nums[heights[i]];
            int indexMax = nums[heights[i]] + nums1[heights[i]] - 1;
            if (i < indexMin || i > indexMax) {
                count++;
            }
        }
        return count;
    }
}
