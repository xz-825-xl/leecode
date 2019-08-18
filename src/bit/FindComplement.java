package bit;

/**
 * Created by zy on 2019/8/18.
 * To be a happy coder!
 * leeCode
 */
public class FindComplement {

    public static int findComplement(int num) {
        int rs = 0;
        int n = 0;
        int temp = num;
        while(num > 0){
            num /= 2;
            rs = rs + (int)Math.pow(2, n);
            n++;
        }
        return temp ^ rs;
    }

    public static int findComplement2(int num) {
        int temp = 1;
        while(temp < num){
            temp <<= 1;
            temp += 1;
        }
        return num ^ temp;
    }
}
