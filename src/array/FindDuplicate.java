package array;

/**
 * 描述：287. 寻找重复数
 *
 * @author zy
 * @date 2020/5/26 9:08
 */
public class FindDuplicate {

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
