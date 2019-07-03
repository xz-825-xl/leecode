package sort;

/**
 * @author Zhangying
 * @date 2019/7/3
 */
public class BubbleSort {

    /**
     * 冒泡排序
     * 首先从数组的第一个元素开始到数组最后一个元素为止，对数组中相邻的两个元素进行比较，
     * 如果位于数组左端的元素大于数组右端的元素，则交换这两个元素在数组中的位置，
     * 此时数组最右端的元素即为该数组中所有元素的最大值。接着对该数组剩下的n-1个元素进行冒泡排序，
     * 直到整个数组有序排列。算法的时间复杂度为O(n^2)
     */
    public int[] bubbleSort(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int tmp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j] = tmp;
                }
            }
        }
        return nums;
    }
}
