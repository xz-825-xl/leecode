package array;

/**
 * 描述：682. 棒球比赛
 *
 * @author zy
 * @date 2019/9/27 16:48
 */
public class CalPoints {
    public static int calPoints(String[] ops) {
        int rs = 0;
        int[] nums = new int[ops.length];
        int index = 0;
        for (int i = 0; i < ops.length; i++) {
            if (("+").equals(ops[i])) {
                if (index > 0) {
                    nums[index] = nums[index - 1] + (index > 1 ? nums[index - 2] : 0);
                    index++;
                }
            } else if (("D").equals(ops[i])) {
                if (index > 0) {
                    nums[index] = nums[index - 1] * 2;
                    index++;
                }
            } else if (("C").equals(ops[i])) {
                index--;
                nums[index] = 0;
            } else {
                nums[index] = Integer.valueOf(ops[i]);
                index++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            rs += nums[i];
        }
        return rs;
    }
}
