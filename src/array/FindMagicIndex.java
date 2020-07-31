package array;

/**
 * 描述：面试题 08.03. 魔术索引
 *
 * @author Zhangying
 * @date 2020/7/31 8:54
 */
public class FindMagicIndex {
    public int findMagicIndex(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (i == nums[i]) {
                return i;
            }
        }
        return -1;
    }
}
