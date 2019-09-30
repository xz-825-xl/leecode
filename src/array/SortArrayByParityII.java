package array;

/**
 * 描述：922. 按奇偶排序数组 II
 *
 * @author zy
 * @date 2019/9/30 9:28
 */
public class SortArrayByParityII {

    public int[] sortArrayByParityII(int[] A) {
        int[] rs = new int[A.length];
        int left = 0;
        int right = A.length - 1;
        int index = 0;
        while (index < A.length) {
            if ((A[index] & 1) == 0) {
                rs[left] = A[index];
                left += 2;
            } else {
                rs[right] = A[index];
                right -= 2;
            }
            index++;
        }
        return rs;
    }

}
