package array;

/**
 * 描述：892. 三维形体的表面积
 *
 * @author zy
 * @date 2019/11/15 8:53
 */
public class SurfaceArea {
    public static int surfaceArea(int[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] > 0) {
                    count += (grid[i][j] * 4 + 2);
                    if (i > 0 && grid[i - 1][j] != 0) {
                        count -= Math.min(grid[i - 1][j], grid[i][j]);
                    }
                    if (i < grid.length - 1 && grid[i + 1][j] != 0) {
                        count -= Math.min(grid[i + 1][j], grid[i][j]);
                    }
                    if (j > 0 && grid[i][j - 1] != 0) {
                        count -= Math.min(grid[i][j - 1], grid[i][j]);
                    }
                    if (j < grid[i].length - 1 && grid[i][j + 1] != 0) {
                        count -= Math.min(grid[i][j + 1], grid[i][j]);
                    }
                }
            }
        }

        return count;
    }
}
