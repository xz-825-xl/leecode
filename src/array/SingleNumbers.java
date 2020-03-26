package array;

/**
 * 描述：面试题56 - I. 数组中数字出现的次数
 *
 * @author zy
 * @date 2020/3/26 8:52
 */
public class SingleNumbers {

    public static int[] singleNumbers(int[] nums) {
        int[] result = new int[2];
        int xorResult = 0;
        for (int i = 0; i < nums.length; i++) {
            xorResult ^= nums[i];
        }

        int diff = 1;
        while (xorResult > 0) {
            if ((xorResult & 1) == 1) {
                break;
            }
            xorResult >>= 1;
            diff <<= 1;
        }
        for (int i = 0; i < nums.length; i++) {
            if ((nums[i] & diff) == 0) {
                result[0] ^= nums[i];
            }
        }
        result[1] = xorResult ^ result[0];
        return result;
    }

    public static void main(String[] args) {
        SingleNumbers.singleNumbers(new int[]{1,2,5,2});
    }

}
