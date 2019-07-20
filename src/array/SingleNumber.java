package array;

/**
 * Created by zy on 2019/7/20.
 * To be a happy coder!
 * leeCode 136
 */
public class SingleNumber {

    public int singleNumber(int[] nums) {
       int result = 0;
       for(int num : nums){
           result ^= num;
       }
       return result;
    }

    public int singleNumber2(int[] nums) {
        int result = 0;
        for(int i = 0; i<nums.length; i++){
            result ^= nums[i];
        }
        return result;
    }

}
