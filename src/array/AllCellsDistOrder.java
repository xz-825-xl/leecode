package array;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 描述：1030. 距离顺序排列矩阵单元格
 *
 * @author zy
 * @date 2020/2/5 17:30
 */
public class AllCellsDistOrder {
    public static int[][] allCellsDistOrder(int R, int C, int r0, int c0) {
        int[][] rs = new int[R * C][2];
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{r0, c0});
        rs[0] = new int[]{r0, c0};
        boolean[][] filled = new boolean[R][C];
        filled[r0][c0] = true;
        int index = 1;
        int r1, c1;
        while (!queue.isEmpty()) {
            int[] node = queue.poll();
            r1 = node[0] - 1;
            c1 = node[1];
            if (r1 >= 0 && !filled[r1][c1]) {
                queue.add(new int[]{r1, c1});
                rs[index++] = new int[]{r1, c1};
                filled[r1][c1] = true;
            }
            r1 = node[0] + 1;
            if (r1 < R && !filled[r1][c1]) {
                queue.add(new int[]{r1, c1});
                rs[index++] = new int[]{r1, c1};
                filled[r1][c1] = true;
            }
            r1 = node[0];
            c1 = node[1] - 1;
            if (c1 >= 0 && !filled[r1][c1]) {
                queue.add(new int[]{r1, c1});
                rs[index++] = new int[]{r1, c1};
                filled[r1][c1] = true;
            }
            c1 = node[1] + 1;
            if (c1 < C && !filled[r1][c1]) {
                queue.add(new int[]{r1, c1});
                rs[index++] = new int[]{r1, c1};
                filled[r1][c1] = true;
            }
        }
        return rs;
    }

    public static int[][] allCellsDistOrder2(int R, int C, int r0, int c0) {
        int[][] ans = new int[R * C][2];
        int point_x = r0, point_y = c0;
        int order = 0;
        ans[order][0] = r0;
        ans[order][1] = c0;
        order++;
        while (order < R * C) {
            point_x--;
            while (point_x < r0) {
                if (point_x >= 0 && point_y <= C - 1) {
                    ans[order][0] = point_x;
                    ans[order++][1] = point_y;
                }
                point_x++;
                point_y++;
            }
            while (point_y > c0) {
                if (point_x <= R - 1 && point_y <= C - 1) {
                    ans[order][0] = point_x;
                    ans[order++][1] = point_y;
                }
                point_x++;
                point_y--;
            }
            while (point_x > r0) {
                if (point_x <= R - 1 && point_y >= 0) {
                    ans[order][0] = point_x;
                    ans[order++][1] = point_y;
                }
                point_x--;
                point_y--;

            }
            while (point_y < c0) {
                if (point_x >= 0 && point_y >= 0) {
                    ans[order][0] = point_x;
                    ans[order++][1] = point_y;
                }
                point_x--;
                point_y++;
            }
        }
        return ans;
    }
}
