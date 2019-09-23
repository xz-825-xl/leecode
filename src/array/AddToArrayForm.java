package array;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by zy on 2019/9/22.
 * To be a happy coder!
 * 989. 数组形式的整数加法
 */
public class AddToArrayForm {

    public static List<Integer> addToArrayForm(int[] A, int K) {
        List<Integer> list = new LinkedList<>();
        for (int i = A.length - 1; i >= 0 || K > 0; K /= 10) {
            if(i >= 0){
                K += A[i];
                i--;
            }
            ((LinkedList<Integer>) list).addFirst(K % 10);
        }
        return list;
    }
}
