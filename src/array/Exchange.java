package array;

/**
 * 描述：剑指 Offer 21. 调整数组顺序使奇数位于偶数前面
 *
 * @author zy
 * @date 2020/6/29 16:34
 */
public class Exchange {

    public int[] exchange(int[] nums) {
        int[] rs = new int[nums.length];
        int left = 0;
        int right = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            if ((nums[i] & 1) == 1) {
                rs[left] = nums[i];
                left++;
            } else {
                rs[right] = nums[i];
                right--;
            }
        }
        return rs;
    }
}
