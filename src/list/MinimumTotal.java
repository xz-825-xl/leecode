package list;

import java.util.ArrayList;
import java.util.List;

/**
 * 描述：120. 三角形最小路径和
 *
 * @author zy
 * @date 2020/7/14 16:17
 */
public class MinimumTotal {

    public static int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[][] bq = new int[n][triangle.get(n - 1).size()];
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j < bq[n - 1].length; j++) {
                if(j < triangle.get(i).size()) {
                    bq[i][j] = triangle.get(i).get(j);
                    if (i != n - 1) {
                        bq[i][j] = (j == bq[n - 1].length - 1 ? bq[i + 1][j] : Math.min(bq[i + 1][j], bq[i + 1][j + 1])) + bq[i][j];
                    }
                }
            }
        }
        return bq[0][0];
    }

    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> temp1 = new ArrayList<>();
        temp1.add(2);
        List<Integer> temp2 = new ArrayList<>();
        temp2.add(3);
        temp2.add(4);
        List<Integer> temp3 = new ArrayList<>();
        temp3.add(6);
        temp3.add(5);
        temp3.add(7);
        List<Integer> temp4 = new ArrayList<>();
        temp4.add(4);
        temp4.add(1);
        temp4.add(8);
        temp4.add(3);
        list.add(temp1);
        list.add(temp2);
        list.add(temp3);
        list.add(temp4);
        System.out.println(minimumTotal(list));
    }

}
