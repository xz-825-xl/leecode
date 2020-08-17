package array;

/**
 * 描述：1346. 检查整数及其两倍数是否存在
 *
 * @author Zhangying
 * @date 2020/8/17 10:08
 */
public class CheckIfExist {

    public boolean checkIfExist(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j] * 2) {
                    return true;
                }
            }
        }
        return false;
    }

}
