package array;

/**
 * 描述：905. 按奇偶排序数组
 *
 * @author zy
 * @date 2019/9/30 9:19
 */
public class SortArrayByParity {
    public int[] sortArrayByParity(int[] A) {
        int[] rs = new int[A.length];
        int left = 0;
        int right = A.length - 1;
        int index = 0;
        while (index < A.length) {
            if ((A[index] & 1) == 0) {
                rs[left] = A[index];
                left++;
            } else {
                rs[right] = A[index];
                right--;
            }
            index++;
        }
        return rs;
    }
}
