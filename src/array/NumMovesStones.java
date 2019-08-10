package array;

/**
 * Created by zy on 2019/8/10.
 * To be a happy coder!
 * leeCode 1033
 */
public class NumMovesStones {

    public int[] numMovesStones(int a, int b, int c) {
        int[] rs = new int[2];
        int max = Math.max(Math.max(a, b), c);
        int min = Math.min(Math.min(a, b), c);
        int mid = (a == max || a == min) ? ((b == max || b == min) ? c : b) : a;
        rs[0] = (max - mid == 2 || mid - min == 2) ? 1 : (((max - mid == 1) ? 0 : 1) + (mid - min == 1 ? 0 : 1));
        rs[1] = (max - mid - 1) + (mid - min - 1);
        return rs;
    }
}
