package array;

/**
 * @author Zhangying
 * @date 2019/7/3
 * leeCode 704
 */
public class Search {

    public static int search(int[] nums, int target) {
        int first = 0;
        int last = nums.length;
        int mid ;
        while (last > first) {
            mid = (first + last - 1) / 2;
            if (nums[mid] > target) {
                last = mid;
            } else if (nums[mid] < target) {
                first = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
