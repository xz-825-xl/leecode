package array;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 描述：994. 腐烂的橘子
 *
 * @author zy
 * @date 2019/9/19 8:36
 */
public class OrangesRotting {

    static class Orange {
        public Orange(int x, int y) {
            this.x = x;
            this.y = y;
        }

        int x;
        int y;
    }

    public static int orangesRotting(int[][] grid) {
        int count = 0;
        Queue<Orange> queue = new LinkedList<>();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 2) {
                    queue.offer(new Orange(i, j));
                }
            }
        }
        while (!queue.isEmpty()) {
            int size = queue.size();
            boolean flag = false;
            for (int i = 0; i < size; i++) {
                Orange orange = queue.poll();
                if (orange.x - 1 >= 0 && grid[orange.x - 1][orange.y] == 1) {
                    queue.offer(new Orange(orange.x - 1, orange.y));
                    grid[orange.x - 1][orange.y] = 2;
                    flag = true;
                }
                if (orange.x + 1 < grid.length && grid[orange.x + 1][orange.y] == 1) {
                    queue.offer(new Orange(orange.x + 1, orange.y));
                    grid[orange.x + 1][orange.y] = 2;
                    flag = true;
                }
                if (orange.y - 1 >= 0 && grid[orange.x][orange.y - 1] == 1) {
                    queue.offer(new Orange(orange.x, orange.y - 1));
                    grid[orange.x][orange.y - 1] = 2;
                    flag = true;
                }
                if (orange.y + 1 < grid[orange.x].length && grid[orange.x][orange.y + 1] == 1) {
                    queue.offer(new Orange(orange.x, orange.y + 1));
                    grid[orange.x][orange.y + 1] = 2;
                    flag = true;
                }
            }
            if (flag) {
                count++;
            }
        }

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    return -1;
                }
            }
        }
        return count;
    }
}
