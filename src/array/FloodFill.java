package array;

/**
 * 733. 图像渲染
 * Created by zy on 2019/11/3.
 * To be a happy coder!
 */
public class FloodFill {
    public static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {

        int color = image[sr][sc];
        if (color != newColor) {
            dfs(image, sr, sc, newColor, color);
        }

        return image;
    }

    static void  dfs(int[][] image, int sr, int sc, int newColor, int color){
        if(image[sr][sc] == color){
            image[sr][sc] = newColor;
            if(sr > 0) {
                dfs(image, sr - 1, sc, newColor, color);
            }
            if(sr < image.length - 1) {
                dfs(image, sr + 1, sc, newColor, color);
            }
            if(sc > 0){
                dfs(image, sr, sc - 1, newColor, color);
            }
            if(sc < image[0].length - 1) {
                dfs(image, sr, sc + 1, newColor, color);
            }
        }
    }
}
