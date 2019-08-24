package tree;

import entity.TreeNode;

/**
 * Created by Mmn on 2019/8/24.
 * To be a happy coder!
 * 437. 路径总和 III
 */
public class PathSum {

    private int count = 0;

    public int pathSum(TreeNode root, int sum) {

        if (root == null) {
            return 0;
        }

        return paths(root, sum)
                + pathSum(root.left, sum)
                + pathSum(root.right, sum);
    }

    private int paths(TreeNode root, int sum) {

        if (root == null) {
            return 0;
        }

        int res = 0;
        if (root.val == sum) {
            res += 1;
        }

        res += paths(root.left, sum - root.val);
        res += paths(root.right, sum - root.val);

        return res;
    }

}
