package number;

/**
 * 描述：1295. 统计位数为偶数的数字
 *
 * @author zy
 * @date 2019/12/26 10:19
 */
public class FindNumbers {
    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (isEven(nums[i])) {
                count++;
            }
        }
        return count;
    }

    private static boolean isEven(int num) {
        int count = 1;
        while (num >= 10) {
            num /= 10;
            count++;
        }
        return (count & 1) == 0;
    }

    public static int findNumbers2(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int count = 0;
        for (int num : nums) {
            if (isEven(num)) {
                count++;
            }
        }
        return count;
    }

    public int findNumbers3(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int cnt = 0;
        for (int n : nums) {
            if ((countDigits(n) & 1) == 0) {
                cnt += 1;
            }
        }
        return cnt;
    }

    private int countDigits(int num) {
        int m = num;
        int cnt = 0;
        while (m != 0) {
            m /= 10;
            cnt += 1;
        }
        return cnt;
    }
}
