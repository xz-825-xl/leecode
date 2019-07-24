package array;

/**
 * @author Zhangying
 * @date 2019/7/24
 * leeCode 463
 */
public class IslandPerimeter {

    public int islandPerimeter(int[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    if (i == 0 || (i > 0 && grid[i - 1][j] == 0)) {
                        count++;
                    }
                    if (i == grid.length - 1 || (i < grid.length - 1 && grid[i + 1][j] == 0)) {
                        count++;
                    }
                    if (j == 0 || (j > 0 && grid[i][j - 1] == 0)) {
                        count++;
                    }
                    if (j == grid[i].length - 1 || (j < grid[i].length - 1 && grid[i][j + 1] == 0)) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public int islandPerimeter2(int[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    if (i == grid.length - 1 || (i < grid.length - 1 && grid[i + 1][j] == 0)) {
                        count++;
                    }
                    if (j == 0 || (j > 0 && grid[i][j - 1] == 0)) {
                        count++;
                    }
                }
            }
        }
        return count * 2;
    }
}
