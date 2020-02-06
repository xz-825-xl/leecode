package array;

/**
 * 描述：1313. 解压缩编码列表
 *
 * @author zy
 * @date 2020/2/6 18:25
 */
public class DecompressRLElist {
    public static int[] decompressRLElist(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length - 1; i += 2) {
            count += nums[i];
        }
        int[] rs = new int[count];
        int index = 0;
        for (int i = 1; i < nums.length; i += 2) {
            for (int j = 0; j < nums[i - 1]; j++) {
                rs[index++] = nums[i];
            }
        }
        return rs;
    }
}
