package array;

/**
 * 描述：1232. 缀点成线
 *
 * @author zy
 * @date 2019/10/23 9:09
 */
public class CheckStraightLine {

    public boolean checkStraightLine(int[][] coordinates) {
        if (coordinates[1][0] == coordinates[0][0]) {
            for (int i = 2; i < coordinates.length; i++) {
                if (coordinates[i][0] != coordinates[0][0]) {
                    return false;
                }
            }
        } else {
            double k = (coordinates[1][1] - coordinates[0][1]) / (coordinates[1][0] - coordinates[0][0]);
            double b = coordinates[0][1] - coordinates[0][0] * k;
            for (int i = 2; i < coordinates.length; i++) {
                if (k * coordinates[i][0] + b != coordinates[i][1]) {
                    return false;
                }
            }
        }
        return true;
    }
}
