package array;

/**
 * 描述：883. 三维形体投影面积
 *
 * @author zy
 * @date 2019/9/17 19:49
 */
public class ProjectionArea {

    public int projectionArea(int[][] grid) {
        int area = 0;
        int[] rows = new int[grid.length];
        for (int i = 0; i < grid.length; i++) {
            int col = 0;
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] != 0) {
                    area++;
                }
                col = Math.max(col, grid[i][j]);
                rows[j] = Math.max(rows[j], grid[i][j]);
            }
            area += col;
        }
        for (int i = 0; i < rows.length; i++) {
            area += rows[i];
        }
        return area;
    }

}
