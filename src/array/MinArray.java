package array;

/**
 * 描述：剑指 Offer 11. 旋转数组的最小数字
 *
 * @author zy
 * @date 2020/7/22 13:42
 */
public class MinArray {
    public static int minArray(int[] numbers) {
        for (int i = 1; i < numbers.length; i++) {
            if(numbers[i] < numbers[i - 1]){
                return numbers[i];
            }
        }
        return numbers[0];
    }

    public static void main(String[] args) {
        //System.out.println(minArray(new int[]{3, 4, 5, 1, 2}));
        //System.out.println(minArray(new int[]{3, 1, 1}));
        //System.out.println(minArray(new int[]{3, 1, 3}));
        System.out.println(minArray(new int[]{10,1,10,10,10}));
    }
}
