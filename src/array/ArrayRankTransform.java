package array;

import java.util.HashSet;
import java.util.Set;

/**
 * 描述：1331. 数组序号转换
 *
 * @author zy
 * @date 2020/2/3 15:38
 */
public class ArrayRankTransform {
    public static int[] arrayRankTransform(int[] arr) {
        int[] rs = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            Set<Integer> set = new HashSet<>();
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] >= arr[j]) {
                    set.add(arr[j]);
                }
            }
            rs[i] = set.size();
        }
        return rs;
    }

    public static int[] arrayRankTransform2(int[] arr) {
        if (arr.length == 0) {
            return arr;
        }
        int[] rs = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            Integer maxIndex = i;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    if (maxIndex == i || arr[maxIndex] < arr[j]) {
                        maxIndex = j;
                    }
                }
            }
            rs[i] = maxIndex;
        }
        int[] count = new int[arr.length];
        for (int i = 0; i < rs.length; i++) {
            count(i, rs, count);
        }
        return count;
    }

    private static void count(int index, int[] rs, int[] count) {
        if (rs[index] == index) {
            count[index] = 1;
        } else if (count[rs[index]] == 0) {
            count(rs[index], rs, count);
            count[index] = count[rs[index]] + 1;
        } else {
            count[index] = count[rs[index]] + 1;
        }
    }

}
