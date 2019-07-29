package list;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Zhangying
 * @date 2019/7/29
 * leeCode 118
 */
public class Generate {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 1; i <= numRows; i++) {
            List<Integer> subList = new ArrayList<>();
            if (i == 1) {
                subList.add(1);
            } else {
                List<Integer> lastNumRow = list.get(i - 2);
                subList.add(1);
                for (int j = 0; j < lastNumRow.size() - 1; j++) {
                    subList.add(lastNumRow.get(j) + lastNumRow.get(j + 1));
                }
                subList.add(1);
            }
            list.add(subList);
        }
        return list;
    }

}
