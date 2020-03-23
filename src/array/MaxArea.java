package array;

/**
 * 描述：11. 盛最多水的容器
 *
 * @author zy
 * @date 2020/3/23 16:16
 */
public class MaxArea {
    public static int maxArea(int[] height) {
        int rs = 0;
        for (int i = 0; i < height.length; i++) {
            int left = 0;
            int right = height.length - 1;
            while (left < i) {
                if (height[left] < height[i]) {
                    left++;
                } else if ((i - left) * height[i] > rs) {
                    rs = (i - left) * height[i];
                } else {
                    break;
                }
            }
            while (right > i) {
                if (height[right] < height[i]) {
                    right--;
                } else if ((right - i) * height[i] > rs) {
                    rs = (right - i) * height[i];
                } else {
                    break;
                }
            }
        }
        return rs;
    }

    public static int maxArea2(int[] height) {
        int rs = 0;
        for (int i = 0; i < height.length; i++) {
            int left = 0;
            int right = height.length - 1;
            int maxDis = 0;
            while (left < i) {
                if (height[left] >= height[i]) {
                    maxDis = i - left;
                    break;
                } else {
                    left++;
                }
            }
            while (right > i) {
                if (height[right] >= height[i]) {
                    maxDis = Math.max(right - i, maxDis);
                    break;
                } else {
                    right--;
                }
            }
            rs = Math.max(rs, maxDis * height[i]);
        }
        return rs;
    }

    public static int maxArea3(int[] height) {
        int rs = 0;
        for (int i = 0; i < height.length; i++) {

        }
        return rs;
    }

    public static void main(String[] args) {
        System.out.println(maxArea3(new int[]{1, 2}));
    }
}
