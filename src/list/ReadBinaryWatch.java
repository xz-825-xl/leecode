package list;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Zhangying
 * @date 2019/7/19
 * leeCode 401
 */
public class ReadBinaryWatch {

    public static List<String> readBinaryWatch(int num) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 60; j++) {
                if (Integer.bitCount((i << 6) | j) == num) {
                    list.add(i + (j > 9 ? ":" : ":0") + j);
                }
            }
        }
        return list;
    }

}
