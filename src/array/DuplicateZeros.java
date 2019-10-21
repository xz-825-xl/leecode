package array;

/**
 * 描述：1089. 复写零
 *
 * @author zy
 * @date 2019/10/21 14:55
 */
public class DuplicateZeros {
    public static void duplicateZeros(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 0) {
                System.arraycopy(arr, i + 1, arr, i + 2, arr.length - i - 2);
                arr[i + 1] = 0;
                i++;
            }
        }
    }

    public static void duplicateZeros2(int[] arr) {

    }
}
