package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 描述：1200. 最小绝对差
 *
 * @author zy
 * @date 2019/10/25 8:39
 */
public class MinimumAbsDifference {
    public static List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> list = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            int abs = arr[i + 1] - arr[i];
            if (abs <= min) {
                if (abs < min) {
                    list.clear();
                    min = abs;
                }
                List<Integer> sub = new ArrayList<>();
                sub.add(arr[i]);
                sub.add(arr[i + 1]);
                list.add(sub);
            }
        }
        return list;
    }
}
