package tree;

import entity.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Zhangying
 * @date 2019/7/2
 *
 * leeCode 144
 */
public class PreorderTraversal {

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        preorder(list, root);
        return list;
    }

    private void preorder(List<Integer> list, TreeNode root) {
        if (root == null) {
            return;
        }
        list.add(root.val);
        preorder(list, root.left);
        preorder(list, root.right);
    }
}
