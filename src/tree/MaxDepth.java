package tree;

import entity.TreeNode;

/**
 * @author Zhangying
 * @date 2019/7/4
 */
public class MaxDepth {

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }

}
