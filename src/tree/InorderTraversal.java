package tree;

import entity.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Zhangying
 * @date 2019/7/2
 *
 * leeCode 94
 */
public class InorderTraversal {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inorder(list, root);
        return list;
    }

    private void inorder(List<Integer> list, TreeNode root) {
        if (root == null) {
            return;
        }
        inorder(list, root.left);
        list.add(root.val);
        inorder(list, root.right);
    }
}
