package bit;

/**
 * @author Zhangying
 * @date 2019/7/4
 * leeCode 717
 */
public class IsOneBitCharacter {

    public boolean isOneBitCharacter(int[] bits) {
        if (bits == null) {
            return false;
        }
        for (int i = 0; i < bits.length; i++) {
            if (i == bits.length - 1 && bits[i] == 0) {
                return true;
            }
            if (bits[i] == 1) {
                i++;
            }
        }
        return false;
    }

}
