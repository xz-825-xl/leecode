package array;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Zhangying
 * @date 2019/7/26
 * leeCode 447
 */
public class NumberOfBoomerangs {

    public static int numberOfBoomerangs(int[][] points) {
        int count = 0;
        for (int i = 0; i < points.length; i++) {
            int[] point = points[i];
            Map<Integer, Integer> distanceMap = new HashMap<>(16);
            for (int j = 0; j < points.length; j++) {
                if (i == j) {
                    continue;
                }
                int dis = (point[0] - points[j][0]) * (point[0] - points[j][0]) + (point[1] - points[j][1]) * (point[1] - points[j][1]);
                count += distanceMap.getOrDefault(dis, 0) * 2;
                distanceMap.put(dis, distanceMap.getOrDefault(dis, 0) + 1);
            }
        }
        return count;
    }
}
