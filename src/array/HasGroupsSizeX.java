package array;

/**
 * Created by zy on 2019/9/14.
 * To be a happy coder!
 * 914. 卡牌分组
 */
public class HasGroupsSizeX {

    public static boolean hasGroupsSizeX(int[] deck) {
        int[] rs = new int[deck.length + 1];
        for (int i = 0; i < deck.length; i++) {
            rs[deck[i]] ++;
        }
        int lastIndex = -1;
        for (int i = 0; i < rs.length; i++) {
            if (rs[i] == 1) {
                return false;
            }
            if (rs[i] == 0) {
                continue;
            }
            if (lastIndex == -1) {
                lastIndex = i;
            } else if (!hasCommonFactor(rs[lastIndex], rs[i])) {
                return false;
            }
        }
        return true;
    }

    private static boolean hasCommonFactor(int num1, int num2) {
        if(num1 % num2 == 0 || num2 % num1 == 0){
            return true;
        }
        int i = 2;
        int num = Math.min(num1, num2);
        while (i <= num/2){
            if(num1 % i == 0 && num2 % i == 0){
                return true;
            }
            i++;
        }
        return false;
    }

}
