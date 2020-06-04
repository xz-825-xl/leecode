package array;

/**
 * 描述：238. 除自身以外数组的乘积
 *
 * @author zy
 * @date 2020/6/4 10:51
 */
public class ProductExceptSelf {

    public static int[] productExceptSelf(int[] nums) {
        int[] rs = new int[nums.length];
        int left = 1;
        int right = 1;
        for (int i = 0; i < nums.length; i++) {
            rs[i] = left;
            left = nums[i] * left;
        }

        for (int i = nums.length - 1; i >= 0; i--) {
            rs[i] = rs[i] * right;
            right = nums[i] * right;
        }
        return rs;
    }

    public static void main(String[] args) {
        productExceptSelf(new int[]{1, 2, 3, 4});
    }

}
