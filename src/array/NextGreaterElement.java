package array;

/**
 * Created by zy on 2019/8/17.
 * To be a happy coder!
 * leeCode
 */
public class NextGreaterElement {


    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] rs = new int[nums1.length];
        boolean flag;
        boolean flag1;
        for (int i = 0; i < nums1.length; i++) {
            flag = false;
            flag1 = false;
            for (int num2 : nums2) {
                if (num2 == nums1[i]) {
                    flag = true;
                }
                if (flag && num2 > nums1[i]) {
                    rs[i] = num2;
                    flag1 = true;
                    break;
                }
            }
            if (!flag1) {
                rs[i] = -1;
            }
        }
        return rs;
    }

}
