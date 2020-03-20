package number;

import java.util.Arrays;

/**
 * 描述：16. 最接近的三数之和
 *
 * @author zy
 * @date 2020/3/18 16:19
 */
public class ThreeSumClosest {
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int rs = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                int diff = Math.abs(target - rs);
                if(diff == 0){
                    return target;
                }
                if (Math.abs(target - sum) < diff) {
                    rs = sum;
                }
                if (sum > target) {
                    right--;
                } else {
                    left++;
                }
            }
        }
        return rs;
    }

    public static void main(String[] args) {

        threeSumClosest(new int[]{-3,-2,-5,3,-4}, -1);

    }
}
