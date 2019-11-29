package array;

/**
 * 描述：
 * 1266. 访问所有点的最小时间
 *
 * @author zy
 * @date 2019/11/29 8:47
 */
public class MinTimeToVisitAllPoints {
    public int minTimeToVisitAllPoints(int[][] points) {
        int count = 0;
        for (int i = 0; i < points.length - 1; i++) {
            int[] point = points[i];
            int[] next = points[i + 1];
            count += Math.max(Math.abs(point[0] - next[0]), Math.abs(point[1] - next[1]));
        }
        return count;
    }
}
