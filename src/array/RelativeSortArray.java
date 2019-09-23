package array;

/**
 * 描述：1122. 数组的相对排序
 *
 * @author zy
 * @date 2019/9/23 9:13
 */
public class RelativeSortArray {
    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] m = new int[1001];
        int[] array = new int[arr1.length];
        for(int i = 0; i < arr1.length; i++){
            m[arr1[i]]++;
        }
        int index = 0;
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < m[arr2[i]] ; j++) {
                array[index] = arr2[i];
                index++;
            }
            m[arr2[i]] = 0;
        }
        for (int i = 0; i < m.length ; i++) {
            for (int j = 0; j < m[i] ; j++) {
                array[index] = i;
                index++;
            }
        }
        return array;
    }
}
