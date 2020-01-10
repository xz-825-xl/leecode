package array;

/**
 * 描述：287. 有序数组中出现次数超过25%的元素
 *
 * @author zy
 * @date 2020/1/10 8:55
 */
public class FindSpecialInteger {
    public static int findSpecialInteger(int[] arr) {
        int count = 0;
        Integer pre = null;
        for (int i = 0; i < arr.length; i++) {
            if (pre == null || pre == arr[i]) {
                count++;
            } else {
                count = 1;
            }
            if (count > arr.length / 4) {
                return arr[i];
            }
            pre = arr[i];
        }
        return 0;
    }

    public static int findSpecialInteger2(int[] arr) {
        int threshold = arr.length / 4;
        Integer pre = null;
        for (int i = 0; i < arr.length; i++) {
            if (pre == null || pre != arr[i]) {
                int index = i + threshold;
                if (arr[i] == arr[index]) {
                    return arr[i];
                }
            }
            pre = arr[i];
        }
        return 0;
    }

    public static int findSpecialInteger3(int[] arr) {
        int threshold = arr.length / 4;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i + threshold] == arr[i]) {
                return arr[i];
            }
        }
        return 0;
    }
}
