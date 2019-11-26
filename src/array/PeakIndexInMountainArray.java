package array;

/**
 * 描述：852. 山脉数组的峰顶索引
 *
 * @author zy
 * @date 2019/11/26 8:37
 */
public class PeakIndexInMountainArray {
    public static int peakIndexInMountainArray(int[] A) {
        int rs = 0;
        int left = 0;
        int right = A.length - 1;
        while (left <= right) {
            int i = (left + right) / 2;
            if (A[i] > A[i - 1] && A[i] > A[i + 1]) {
                return i;
            }
            if(A[i] < A[i - 1]){
                right = i - 1;
            }
            if(A[i] > A[i - 1]){
                left = i  + 1;
            }
        }
        return rs;
    }
}
