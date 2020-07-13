package number;

/**
 * 描述：剑指 Offer 53 - II. 0～n-1中缺失的数字
 *
 * @author zy
 * @date 2020/7/13 16:39
 */
public class MissingNumber {

    public static int missingNumber(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (mid == nums[mid]) {
                left = mid;
                left++;
            } else {
                right = mid;
                right--;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        missingNumber(new int[]{0, 1, 3});
    }
}
