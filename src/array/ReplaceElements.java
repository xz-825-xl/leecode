package array;

/**
 * 描述：1299. 将每个元素替换为右侧最大元素
 *
 * @author zy
 * @date 2020/1/15 9:09
 */
public class ReplaceElements {
    public int[] replaceElements(int[] arr) {
        int maxIndex = -1;
        int maxValue;
        for (int i = 0; i < arr.length; i++) {
            if (i < maxIndex) {
                arr[i] = arr[maxIndex];
                continue;
            }
            maxValue = -1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > maxValue) {
                    maxValue = arr[j];
                    maxIndex = j;
                }
            }
            arr[i] = maxValue;
        }
        return arr;
    }
}
