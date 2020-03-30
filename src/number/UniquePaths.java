package number;

/**
 * 描述：62. 不同路径
 *
 * @author zy
 * @date 2020/3/30 16:45
 */
public class UniquePaths {
    public static int uniquePaths(int m, int n) {
        int[][] array = new int[m + 1][n + 1];
        for (int i = 1; i < array.length; i++) {
            for (int j = 1; j < array[i].length; j++) {
                if (i == 1 || j == 1) {
                    array[i][j] = 1;
                } else {
                    array[i][j] = array[i - 1][j] + array[i][j - 1];
                }
            }
        }
        return array[m][n];
    }

    public static void main(String[] args) {
        System.out.println(uniquePaths(3, 2));
    }
}
