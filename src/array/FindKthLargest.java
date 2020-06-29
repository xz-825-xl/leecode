package array;

import java.util.Arrays;

/**
 * 描述：215. 数组中的第K个最大元素
 *
 * @author zy
 * @date 2020/6/29 8:57
 */
public class FindKthLargest {

    public static int findKthLargest(int[] nums, int k) {
        int[] array = new int[k];
        for (int i = 0; i < k; i++) {
            array[i] = nums[i];
        }
        Arrays.sort(array);
        for (int i = k; i < nums.length; i++) {
            if (nums[i] > array[0]) {
                array[0] = nums[i];
                Arrays.sort(array);
            }
        }
        return array[0];
    }

    public static void main(String[] args) {
        findKthLargest(new int[]{3,2,1,5,6,4}, 2);
    }
}
