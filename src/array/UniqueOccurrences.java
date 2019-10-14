package array;

/**
 * 描述：1207. 独一无二的出现次数
 *
 * @author zy
 * @date 2019/10/14 8:55
 */
public class UniqueOccurrences {
    public boolean uniqueOccurrences(int[] arr) {
        int[] nums = new int[2001];
        for (int i = 0; i < arr.length; i++) {
            nums[arr[i] + 1000]++;
        }
        int[] rs = new int[2001];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                if (rs[nums[i]] > 0) {
                    return false;
                } else {
                    rs[nums[i]] = 1;
                }
            }
        }
        return true;
    }
}
