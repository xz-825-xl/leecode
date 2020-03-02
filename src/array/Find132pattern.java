package array;

/**
 * 描述：
 *
 * @author zy
 * @date 2020/2/27 16:11
 */
public class Find132pattern {
    public boolean find132pattern(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] > nums[i] && nums[j] < max) {
                    return true;
                } else if (nums[j] > max) {
                    max = nums[j];
                }
            }
        }
        return false;
    }

    public boolean find132pattern2(int[] nums) {
        int[] mins = new int[nums.length];
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
            mins[i] = min;
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if(nums[j] > mins[i] && nums[j] < nums[i]){
                    return true;
                }
            }
        }

        return false;
    }
}
