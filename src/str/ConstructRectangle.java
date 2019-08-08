package str;

/**
 * @author Zhangying
 * @date 2019/8/8
 * leeCode 492
 */
public class ConstructRectangle {

    public int[] constructRectangle(int area) {
        int[] rs = new int[2];
        int sqr = (int) Math.sqrt(area);
        int left = sqr;
        int right = sqr;
        while (left >= 1) {
            if(area % left == 0){
                right = area/left;
                break;
            }
            left--;
        }
        rs[0] = right;
        rs[1] = left;
        return rs;
    }

}
