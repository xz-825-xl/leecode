package list;

import java.util.ArrayList;
import java.util.List;

/**
 * 描述：77. 组合
 *
 * @author Zhangying
 * @date 2020/9/8 9:11
 */
public class Combine {

    private List<List<Integer>> rs = new ArrayList<>();

    public List<List<Integer>> combine(int n, int k) {
        if (n <= 0|| k<= 0||k>n){
            return rs;
        }
        getList(1, n, k, new ArrayList<>());
        return rs;
    }

    private void getList(int i, int n, int k, List<Integer> list) {
        if (list.size() + (n - i + 1) < k) {
            return;
        } else if (list.size() == k) {
            rs.add(new ArrayList<>(list));
            return;
        } else if (i > n) {
            return;
        } else {
            list.add(i);
            getList(i + 1, n, k, new ArrayList<>(list));
            list.remove(list.size() - 1);
            getList(i + 1, n, k, new ArrayList<>(list));
        }
    }

    public static void main(String[] args) {
        new Combine().combine(4, 2);
    }
}
