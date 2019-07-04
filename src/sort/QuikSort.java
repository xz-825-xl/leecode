package sort;

/**
 * @author Zhangying
 * @date 2019/7/3
 */
public class QuikSort {

    /**
     * 快速排序的基本思想是：通过一趟排序将待排记录分割成独立的两部分，
     * 其中一部分记录的关键字均比另一部分记录的关键字小，则可分别对这两部分记录继续进行排序，
     * 已达到整个序列有序。
     * 一趟快速排序的具体过程可描述为：从待排序列中任意选取一个记录(通常选取第一个记录)作为基准值，
     * 然后将记录中关键字比它小的记录都安置在它的位置之前，将记录中关键字比它大的记录都安置在它的位置之后
     */
    public void quikSort(int[] nums, int start, int end) {
        if (start >= end) {
            return;
        }
        int i = start;
        int j = end;
        int baseVal = nums[start];
        while (i < j) {
            while (i < j && nums[j] >= baseVal) {
                j--;
            }
            if (i < j) {
                nums[i] = nums[j];
                i++;
            }
            while (i < j && nums[i] < baseVal) {
                i++;
            }
            if (i < j) {
                nums[j] = nums[i];
                j--;
            }
        }
        nums[i] = baseVal;
        quikSort(nums, start, i - 1);
        quikSort(nums, i + 1, end);
    }
}
