package array;

/**
 * @author Zhangying
 * @date 2019/7/2
 * <p>
 * leeCode 27
 */
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int last = nums.length - 1;
        for (int i = 0; i <= last; i++) {
            if (nums[i] == val && nums[last] != val) {
                nums[i] = nums[last];
                last--;
            }else if(nums[i] == val && nums[last] == val){
                last--;
                i--;
            }
        }
        return last + 1;
    }
}
