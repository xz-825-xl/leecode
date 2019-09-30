package array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 描述：1169. 查询无效交易
 *
 * @author zy
 * @date 2019/9/30 9:43
 */
public class InvalidTransactions {

    public static List<String> invalidTransactions(String[] transactions) {
        List<String> list = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>(16);
        for (int i = 0; i < transactions.length; i++) {
            String[] array = transactions[i].split(",");
            List<String> temp = map.getOrDefault(array[0], new ArrayList<>());
            temp.add(transactions[i]);
            map.put(array[0], temp);
        }
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            List<String> lis = entry.getValue();
            for (int i = 0; i < lis.size(); i++) {
                String[] array1 = lis.get(i).split(",");
                if (Integer.valueOf(array1[2]) > 1000) {
                    list.add(lis.get(i));
                    continue;
                }
                for (int j = 0; j < lis.size(); j++) {
                    String[] array2 = lis.get(j).split(",");
                    if (Math.abs(Integer.valueOf(array1[1]) - Integer.valueOf(array2[1])) <= 60 && !array1[3].equals(array2[3])) {
                        list.add(lis.get(i));
                        break;
                    }
                }
            }

        }
        return list;
    }

}
