package array;

import java.util.Arrays;

/**
 * 描述：1029. 两地调度
 *
 * @author zy
 * @date 2019/11/7 8:54
 */
public class TwoCitySchedCost {
    public static int twoCitySchedCost(int[][] costs) {
        int sum = 0;
        int countA = 0;
        int countB = 0;
        int[] diff1 = new int[costs.length];
        int[] diff2 = new int[costs.length];
        for (int i = 0; i < costs.length; i++) {
            if (costs[i][0] > costs[i][1]) {
                sum += costs[i][1];
                diff2[countB] = costs[i][0] - costs[i][1];
                countB++;
            } else {
                sum += costs[i][0];
                diff1[countA] = costs[i][1] - costs[i][0];
                countA++;
            }
        }
        int[] temp;
        if (countA > countB) {
            temp = new int[countA];
            System.arraycopy(diff1, 0, temp, 0, countA);
        } else {
            temp = new int[countB];
            System.arraycopy(diff2, 0, temp, 0, countB);
        }
        Arrays.sort(temp);
        for (int i = 0; i < Math.abs(countA - countB) / 2; i++) {
            sum += temp[i];
        }

        return sum;
    }

    public static int twoCitySchedCost2(int[][] costs) {
        int sum = 0;
        int[] diff = new int[costs.length];
        for (int i = 0; i < costs.length; i++) {
            diff[i] = costs[i][1] - costs[i][0];
            sum += costs[i][0];
        }
        Arrays.sort(diff);
        for (int i = 0; i < costs.length / 2; i++) {
            sum += diff[i];
        }
        return sum;
    }
}
