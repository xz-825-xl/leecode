package array;

/**
 * 描述：661. 图片平滑器
 *
 * @author zy
 * @date 2019/11/30 14:42
 */
public class ImageSmoother {
    public static int[][] imageSmoother(int[][] M) {
        int[][] temp = new int[M.length + 2][M[0].length + 2];
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                temp[i + 1][j + 1] = M[i][j];
            }
        }
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                int num = M[i][j];
                int count = 9;
                if (i == 0) {
                    count -= 3;
                }
                if (i == M.length - 1) {
                    count -= 3;
                }
                if (j == 0) {
                    count -= 3;
                }
                if (j == M[i].length - 1) {
                    count -= 3;
                }
                if (i == 0 && j == 0) {
                    count++;
                }
                if(i == 0 && j == M[i].length - 1){
                    count++;
                }
                if(i == M.length - 1 && j == 0){
                    count++;
                }
                if(i == M.length - 1 && j == M[i].length - 1){
                    count++;
                }
                num += temp[i + 2][j] + temp[i + 2][j + 1] + temp[i + 2][j + 2]
                        + temp[i + 1][j] + temp[i + 1][j + 2]
                        + temp[i][j] + temp[i][j + 1] + temp[i][j + 2];
                M[i][j] = num / count;
            }
        }
        return M;
    }
}
