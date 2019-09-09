package array;

/**
 * 描述：leeCode 1176
 *
 * @author zy
 * @date 2019/9/9 8:39
 */
public class DietPlanPerformance {
    public static int dietPlanPerformance(int[] calories, int k, int lower, int upper) {
        int count = 0;
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += calories[i];
        }
        for (int i = 1; i < calories.length - k + 2; i++) {
            if (sum < lower) {
                count--;
            }
            if (sum > upper) {
                count++;
            }
            if(i + k - 1 < calories.length){
                sum = sum - calories[i - 1] + calories[i + k - 1];
            }
        }
        return count;
    }
}
