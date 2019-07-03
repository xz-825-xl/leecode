package sort;

/**
 * @author Zhangying
 * @date 2019/7/3
 */
public class InsertSort {

    /**
     * 插入排序的基本思想就是将无序序列插入到有序序列中。
     * 例如要将数组arr=[4,2,8,0,5,1]排序，可以将4看做是一个有序序列(图中用蓝色标出)，
     * 将[2,8,0,5,1]看做一个无序序列。无序序列中2比4小，于是将2插入到4的左边，
     * 此时有序序列变成了[2,4]，无序序列变成了[8,0,5,1]。无序序列中8比4大，
     * 于是将8插入到4的右边，有序序列变成了[2,4,8],无序序列变成了[0,5,1]。以此类推，
     * 最终数组按照从小到大排序。该算法的时间复杂度为O(n^2)。
     */
    public int[] insertSort(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int j;
            if (nums[i] < nums[i - 1]) {
                int temp = nums[i];
                for (j = i - 1; j >= 0 && temp < nums[j]; j--) {
                    nums[j + 1] = nums[j];
                }
                nums[j + 1] = temp;
            }
        }
        return nums;
    }
}
