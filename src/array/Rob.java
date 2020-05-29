package array;

/**
 * 描述：198. 打家劫舍
 *
 * @author zy
 * @date 2020/5/29 13:11
 */
public class Rob {
    public int rob(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {

        }
        return count;
    }

    public static int rob2(int[] nums) {
        int len = nums.length;
        if(len == 0) {
            return 0;
        }
        int[] dp = new int[len + 1];
        dp[0] = 0;
        dp[1] = nums[0];
        for(int i = 2; i <= len; i++) {
            dp[i] = Math.max(dp[i-1], dp[i-2] + nums[i-1]);
        }
        return dp[len];
    }

    public static void main(String[] args) {
        System.out.println(rob2(new int[]{2,1,1,2}));
    }
}
