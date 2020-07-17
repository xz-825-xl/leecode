package array;

/**
 * 描述：35. 搜索插入位置
 *
 * @author zy
 * @date 2020/7/17 10:01
 */
public class SearchInsert {

    public static int searchInsert(int[] nums, int target) {
        if (nums.length == 0 || target <= nums[0]) {
            return 0;
        }
        if (target > nums[nums.length - 1]) {
            return nums.length;
        }
        if (target == nums[nums.length - 1]) {
            return nums.length - 1;
        }
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] < target) {
                left = mid;
                left++;
            } else if (nums[mid] > target) {
                right = mid;
                right--;
            } else {
                return mid;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        searchInsert(new int[]{1, 3}, 3);
    }
}
