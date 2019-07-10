package array;

/**
 * @author Zhangying
 * @date 2019/7/10
 * leeCode 88
 */
public class Merge {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int index1 = 0;
        int index2 = 0;
        for (int i = 0; i < m + n; i++) {
            if (index1 < m && index2 < n && nums1[i] > nums2[index2]) {
                for (int j = i + m - index1; j > i; j--) {
                    nums1[j] = nums1[j - 1];
                }
                nums1[i] = nums2[index2];
                index2++;
            } else if (index1 < m && index2 < n && nums1[i] <= nums2[index2]) {
                index1++;
            } else if (index2 < n && index1 == m) {
                nums1[i] = nums2[index2];
                index2++;
            } else if (index1 < m && index2 == n) {
                break;
            }
        }
        System.out.println(nums1);
    }

    public static void merge2(int[] nums1, int m, int[] nums2, int n) {
        int index1 = m - 1;
        int index2 = n - 1;
        for (int i = m + n - 1; i >= 0; i--) {
            if (index1 < 0) {
                nums1[i] = nums2[index2];
                index2--;
            } else if (index2 < 0) {
                nums1[i] = nums1[index1];
                index1--;
            } else if (nums1[index1] >= nums2[index2]) {
                nums1[i] = nums1[index1];
                index1--;
            } else {
                nums1[i] = nums2[index2];
                index2--;
            }
        }
    }
}
