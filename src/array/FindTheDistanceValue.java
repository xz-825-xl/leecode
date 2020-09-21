package array;

/**
 * 描述：1385. 两个数组间的距离值
 *
 * @author Zhangying
 * @date 2020/9/21 10:30
 */
public class FindTheDistanceValue {

    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            boolean flag = true;
            for (int j = 0; j < arr2.length; j++) {
                if (Math.abs(arr1[i] - arr2[j]) <= d) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(new FindTheDistanceValue().findTheDistanceValue(new int[]{4, 5, 8}, new int[]{10, 9, 1, 8}, 2));
        System.out.println(new FindTheDistanceValue().findTheDistanceValue(new int[]{1, 4, 2, 3}, new int[]{-4, -3, 6, 10, 20, 30}, 3));
        System.out.println(new FindTheDistanceValue().findTheDistanceValue(new int[]{2, 1, 100, 3}, new int[]{-5, -2, 10, -3, 7}, 6));
    }

}
