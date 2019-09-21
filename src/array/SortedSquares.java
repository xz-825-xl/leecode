package array;

/**
 * Created by zy on 2019/9/21.
 * To be a happy coder!
 * 977. 有序数组的平方
 */
public class SortedSquares {
    public static int[] sortedSquares(int[] A) {
        int[] rs = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            rs[i] = A[i] * A[i];
        }
        for (int i = 0; i < A.length - 1; i++) {
            for (int j = 0; j < A.length - 1 - i; j++) {
                if (rs[j] > rs[j + 1]) {
                    int temp = rs[j];
                    rs[j] = rs[j + 1];
                    rs[j + 1] = temp;
                }
            }
        }
        return rs;
    }

    public static int[] sortedSquares2(int[] A) {
        int[] rs = new int[A.length];
        int index = A.length - 1;
        int left = 0;
        int right = A.length - 1;
        while (left <= right){
            if(A[left] * A[left] > A[right] * A[right]){
                rs[index] = A[left] * A[left];
                left++;
            }else{
                rs[index] = A[right] * A[right];
                right--;
            }
            index--;
        }
        return rs;
    }
}
