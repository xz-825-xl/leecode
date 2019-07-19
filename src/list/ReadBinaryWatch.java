package list;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Zhangying
 * @date 2019/7/19
 * leeCode 401
 */
public class ReadBinaryWatch {

    //todo:未完
    public static List<String> readBinaryWatch(int num) {
        List<String> list = new ArrayList<>();
        if (num > 8) {
            return list;
        }
        for (int i = 0; i <= num; i++) {
            List<String> hourList = getAllCombine(i, 1);
            List<String> minuteList = getAllCombine(num - i, 2);
            for (String hour : hourList) {
                for (String minute : minuteList) {
                    list.add(hour + ":" + minute);
                }
            }
        }
        return list;
    }

    private static List<String> getAllCombine(int num, int type) {
        int[] array = new int[]{1, 2, 4, 8, 16, 32};
        List<String> list = new ArrayList<>();
        if (num == 0) {
            list.add(type == 1 ? "0" : "00");
        } else if ((type == 1 && num < 4) || (type == 2 && num < 6)) {
            getTime(list, num, type, -1, array, 0);
        }
        return list;
    }

    private static void getTime(List<String> list, int num, int type, int index, int[] array, int sum) {
        if (num == 0 || index >= array.length - 1) {
            if ((type == 1 && index <= 3 && sum <= 11 && sum != 0) || (type == 2 && index <= 5 && sum <= 59 && sum != 0)) {
                if (sum >= 10) {
                    list.add(String.valueOf(sum));
                } else {
                    list.add(type == 1 ? String.valueOf(sum) : "0" + sum);
                }
            }
            return;
        }
        getTime(list, num, type, index + 1, array, sum);
        getTime(list, num - 1, type, index + 1, array, sum + array[index + 1]);
    }

}
