package array;

/**
 * 描述：949. 给定数字能组成的最大时间
 *
 * @author zy
 * @date 2019/10/11 9:29
 */
public class LargestTimeFromDigits {
    private int[] ints = new int[10];

    public String largestTimeFromDigits(int[] A) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < A.length; i++) {
            ints[A[i]]++;
        }
        int count2 = 0;
        int count3 = 0;
        int count5 = 0;
        for (int i = 0; i <= 5; i++) {
            if(i <= 2) {
                count2 += ints[i];
            }
            if(i <= 3) {
                count3 += ints[i];
            }
            count5 += ints[i];
        }
        if (count2 == 0 || count5 < 2) {
            return "";
        }
        if (ints[2] > 0 && count3 >= 2 && count5 >= 3) {
            builder.append(2);
            ints[2]--;
            for (int i = 3; i >= 0; i--) {
                if (ints[i] > 0) {
                    builder.append(i);
                    ints[i]--;
                    break;
                }
            }
            getMinutes(builder);
        } else {
            if (ints[1] > 0) {
                builder.append(1);
                ints[1]--;
            } else if(ints[0] > 0){
                builder.append(0);
                ints[0]--;
            }else{
                return "";
            }
            for (int i = 9; i >= 0; i--) {
                if (ints[i] > 0) {
                    builder.append(i);
                    ints[i]--;
                    break;
                }
            }
            getMinutes(builder);
        }

        return builder.toString();
    }

    private void getMinutes(StringBuilder builder) {
        builder.append(":");
        for (int i = 5; i >= 0; i--) {
            if (ints[i] > 0) {
                builder.append(i);
                ints[i]--;
                break;
            }
        }
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] > 0) {
                builder.append(i);
                ints[i]--;
                break;
            }
        }
    }
}
