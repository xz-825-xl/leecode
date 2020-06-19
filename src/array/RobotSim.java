package array;

/**
 * 描述：874. 模拟行走机器人
 *
 * @author zy
 * @date 2020/6/19 8:59
 */
public class RobotSim {

    public static int robotSim(int[] commands, int[][] obstacles) {
        int x = 0;
        int y = 0;
        int[][] directions = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int directIndex = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < commands.length; i++) {
            int command = commands[i];
            if (command == -1) {
                directIndex++;
                directIndex = (directIndex + 4) % 4;
            } else if (command == -2) {
                directIndex--;
                directIndex = (directIndex + 4) % 4;
            } else {
                for (int j = 0; j < command; j++) {
                    x += directions[directIndex][0];
                    y += directions[directIndex][1];
                    boolean flag = true;
                    for (int k = 0; k < obstacles.length; k++) {
                        if (x == obstacles[k][0] && y == obstacles[k][1]) {
                            flag = false;
                            break;
                        }
                    }
                    if (!flag) {
                        x -= directions[directIndex][0];
                        y -= directions[directIndex][1];
                    }
                    max = Math.max(max, x * x + y * y);
                }
            }

        }
        return max;
    }

    public static void main(String[] args) {
        robotSim(new int[]{-2, 8, 3, 7, -1},
                new int[][]{{-4, -1}, {1, -1}, {1, 4}, {5, 0}, {4, 5}, {-2, -1}, {2, -5}, {5, 1}, {-3, -1}, {5, -3}});
    }
}
