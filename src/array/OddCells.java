package array;

/**
 * 描述：1252. 奇数值单元格的数目
 *
 * @author zy
 * @date 2019/11/18 13:29
 */
public class OddCells {
    public static int oddCells(int n, int m, int[][] indices) {
        int count = 0;
        int[][] array = new int[n][m];
        for (int i = 0; i < indices.length; i++) {
           int [] temp = indices[i];
            for (int j = 0; j < m; j++) {
                array[temp[0]][j] ++;
            }
            for (int j = 0; j < n ; j++) {
                array[j][temp[1]]++;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if ((array[i][j] & 1) == 1) {
                    count++;
                }
            }
        }
        return count;
    }
}
