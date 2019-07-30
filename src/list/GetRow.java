package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Zhangying
 * @date 2019/7/30
 * leeCode 119
 */
public class GetRow {

    public static List<Integer> getRow(int rowIndex) {
        List<Integer> preList = new ArrayList<>();
        preList.add(1);
        if (rowIndex == 0) {
            return preList;
        }
        preList.add(1);
        if (rowIndex == 1) {
            return preList;
        }
        List<Integer> list = new ArrayList<>();
        int n = 2;
        while (n <= rowIndex) {
            list = new ArrayList<>();
            list.add(1);
            for (int i = 0; i < preList.size() - 1; i++) {
                list.add(preList.get(i) + preList.get(i + 1));
            }
            list.add(1);
            n++;
            preList = list;
        }
        return list;
    }

    public static List<Integer> getRow2(int rowIndex) {
        Integer[] arr = new Integer[rowIndex + 1];
        Arrays.fill(arr, 0);
        arr[0] = 1;

        for (int i = 1; i <= rowIndex; i++) {
            for (int j = i; j > 0; j--) {
                arr[j] = arr[j] + arr[j - 1];
            }
        }

        return Arrays.asList(arr);
    }

    // todo:待考虑
    public static List<Integer> getRow3(int rowIndex) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        for (int i = 1; i < rowIndex; i++) {
            for (int j = i; i > 0; i--) {

            }
        }
        list.add(1);
        return list;
    }
}
