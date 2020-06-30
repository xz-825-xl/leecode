package array;

/**
 * 描述：面试题03. 数组中重复的数字
 *
 * @author zy
 * @date 2020/6/30 15:55
 */
public class FindRepeatNumber {

    public int findRepeatNumber(int[] nums) {
        int[] a = new int[nums.length];
        for (int n : nums) {
            if (a[n] == 0) {
                a[n]++;
            } else {
                return n;
            }
        }
        return 0;
    }
}
