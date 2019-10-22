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
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 0) {
                for (int j = arr.length - 1; j >= i + 2; j--) {
                    arr[j] = arr[j - 1];
                }
                arr[i + 1] = 0;
                i++;
            }
        }
    }

    public static void duplicateZeros3(int[] arr) {
        int fast = 0, low = 0;
        int n = arr.length;
        while (fast < arr.length) {
            if (arr[low] == 0) {
                fast ++;
            }
            fast++;
            low++;
        }
        fast--;
        low--;
        while (low >= 0) {
            if(fast < n) {
                arr[fast] = arr[low];
            }
            if(arr[low] == 0){
                arr[--fast] = arr[low];
            }
            low--;
            fast--;
        }
    }
}
