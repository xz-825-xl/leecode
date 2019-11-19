package array;

import java.util.ArrayList;
import java.util.List;

/**
 * 描述：1260. 二维网格迁移
 *
 * @author zy
 * @date 2019/11/19 9:03
 */
public class ShiftGrid {
    public static List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < grid.length; i++) {
            List<Integer> subList = new ArrayList<>();
            for (int j = 0; j < grid[i].length; j++) {
                int r = i;
                if (j - k < 0) {
                    r += ((j - k + 1) / grid[i].length) % grid.length - 1;
                    if (r < 0) {
                        r += grid.length;
                    }
                }
                int l = (j - k) % grid[i].length;
                if (l < 0) {
                    l += grid[i].length;
                }
                subList.add(grid[r][l]);
            }
            list.add(subList);
        }
        return list;
    }

    public static List<List<Integer>> shiftGrid2(int[][] grid, int k) {
        int[] temp = new int[grid.length * grid[0].length];
        List<List<Integer>> list = new ArrayList<>();
        int n = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                temp[n++] = grid[i][j];
            }
        }
        k = temp.length - k % temp.length;
        for (int i = 0; i < grid.length; i++) {
            List<Integer> subList = new ArrayList<>();
            for (int j = 0; j < grid[i].length; j++) {
                if (k == temp.length) {
                    k = 0;
                }
                subList.add(temp[k++]);
            }
            list.add(subList);
        }
        return list;
    }
}
