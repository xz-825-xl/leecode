package array;

import java.util.Arrays;

/**
 * 描述：64. 最小路径和
 *
 * @author zy
 * @date 2020/7/23 9:05
 */
public class MinPathSum {

    public static int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] sum = new int[m][n];
        for (int i = 0; i < m; i++) {
            Arrays.fill(sum[i], -1);
        }
        sum[m - 1][n - 1] = grid[m - 1][n - 1];
        travel(grid, sum, 0, 0);
        return sum[0][0];
    }

    private static void travel(int[][] grid, int[][] sum, int i, int j) {
        if (i + 1 < sum.length && j + 1 < sum[0].length) {
            if (sum[i + 1][j] < 0) {
                travel(grid, sum, i + 1, j);
            }
            if (sum[i][j + 1] < 0) {
                travel(grid, sum, i, j + 1);
            }
            sum[i][j] = grid[i][j] + Math.min(sum[i + 1][j], sum[i][j + 1]);
        } else if (i + 1 < sum.length) {
            if (sum[i + 1][j] < 0) {
                travel(grid, sum, i + 1, j);
            }
            sum[i][j] = grid[i][j] + sum[i + 1][j];
        } else if (j + 1 < sum[0].length) {
            if (sum[i][j + 1] < 0) {
                travel(grid, sum, i, j + 1);
            }
            sum[i][j] = grid[i][j] + sum[i][j + 1];
        }
    }

    public static void main(String[] args) {
        System.out.println(minPathSum(new int[][]{
                {1, 3, 1},
                {1, 5, 1},
                {4, 2, 1}}));
    }
}
