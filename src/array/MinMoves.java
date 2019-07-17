package array;

/**
 * @author Zhangying
 * @date 2019/7/16
 * leeCode 453
 */
public class MinMoves {

    /**
     * 给定一个长度为 n 的非空整数数组，找到让数组所有元素相等的最小移动次数。每次移动可以使 n - 1 个元素增加 1。
     *
     * @param nums
     * @return
     */
    public int minMoves(int[] nums) {
        int count = 0;
        int min = nums[0];
        for (int num : nums) {
            min = Math.min(min, num);
        }
        for (int num : nums) {
            count = count + (num - min);
        }
        return count;
    }
}
