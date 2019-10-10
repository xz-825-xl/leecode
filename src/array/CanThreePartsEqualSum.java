package array;

/**
 * 描述：1013. 将数组分成和相等的三个部分
 *
 * @author zy
 * @date 2019/10/10 15:43
 */
public class CanThreePartsEqualSum {
    public boolean canThreePartsEqualSum(int[] A) {

        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum += A[i];
        }

        if (sum % 3 != 0) {
            return false;
        }
        int temp = 0;
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            temp += A[i];
            if (temp == (sum / 3)) {
                temp = 0;
                count++;
            }
        }
        return count == 3;
    }
}
