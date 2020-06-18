package tree;

import entity.TreeNode;
import java.util.ArrayList;
import java.util.List;

/**
 * 描述：1028. 从先序遍历还原二叉树
 *
 * @author zy
 * @date 2020/6/18 9:01
 */
public class RecoverFromPreorder {

    public static TreeNode recoverFromPreorder(String S) {
        List<String> list = new ArrayList<>();
        while (S.length() != 0) {
            int level = getLevel(S);
            S = S.substring(level);
            list.add(level + "-" + (S.indexOf("-") == -1 ? S : S.substring(0, S.indexOf("-"))));
            S = S.indexOf("-") == -1 ? "" : S.substring(S.indexOf("-"));
        }
        return creatTree(list, 0);
    }

    private static TreeNode creatTree(List<String> list, int i) {
        if (list.isEmpty()) {
            return null;
        }
        String[] array = list.get(0).split("-");
        int level = Integer.valueOf(array[0]);
        if (level < i) {
            return null;
        }
        TreeNode node = new TreeNode(Integer.valueOf(array[1]));
        list.remove(0);
        i++;
        node.left = creatTree(list, i);
        node.right = creatTree(list, i);
        return node;
    }

    private static int getLevel(String S) {
        int level = 0;
        while (S.startsWith("-")) {
            level++;
            S = S.substring(1);
        }
        return level;
    }

    public static void main(String[] args) {
        System.out.println(recoverFromPreorder("1-2--3--4-5--6--7"));
    }
}
