package array;

/**
 * 描述：209. 长度最小的子数组
 *
 * @author zy
 * @date 2020/6/28 9:26
 */
public class MinSubArrayLen {

    public static int minSubArrayLen(int s, int[] nums) {
        int sum = 0;
        int[] sumArray = new int[nums.length];
        Integer minLength = null;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum >= s) {
                int temp = sum;
                for (int j = 0; j <= i; j++) {
                    temp -= nums[j];
                    if (temp < s) {
                        minLength = minLength == null ? i - j + 1 : Math.min(i - j + 1, minLength);
                        break;
                    }
                }
            }
            sumArray[i] = sum;
        }
        return minLength == null ? 0 : minLength;
    }

    public static void main(String[] args) {
        minSubArrayLen(4, new int[]{4, 1});
    }
}
