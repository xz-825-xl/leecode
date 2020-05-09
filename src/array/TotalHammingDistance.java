package array;

/**
 * 描述：477. 汉明距离总和
 *
 * @author zy
 * @date 2020/4/26 15:58
 */
public class TotalHammingDistance {

    public int totalHammingDistance(int[] nums) {
        int count = 0;
        for (int i = 0; i < 32; i++) {
            int zero = 0;
            int one = 0;
            for (int j = 0; j < nums.length; j++) {
                if ((nums[j] & 1) == 1) {
                    one++;
                } else {
                    zero++;
                }
                if (nums[j] > 0) {
                    nums[j] >>= 1;
                }
            }
            count += zero * one;
        }
        return count;
    }

}
