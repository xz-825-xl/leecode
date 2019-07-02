package tree;

import entity.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Zhangying
 * @date 2019/7/2
 *
 * leeCode 145
 */
public class PostorderTraversal {

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        postorder(list, root);
        return list;
    }

    private void postorder(List<Integer> list, TreeNode root) {
        if (root == null) {
            return;
        }
        postorder(list, root.left);
        postorder(list, root.right);
        list.add(root.val);
    }
}
