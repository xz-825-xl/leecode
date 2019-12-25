package tree;

import entity.TreeNode;

/**
 * 描述：572. 另一个树的子树
 *
 * @author zy
 * @date 2019/12/25 9:03
 */
public class IsSubtree {
    public static boolean isSubtree(TreeNode s, TreeNode t) {
        if ((s == null && t != null) || (s != null && t == null)) {
            return false;
        }
        if (s == null && t == null) {
            return true;
        }
        if (s.val == t.val) {
            return isSame(s, t) || isSubtree(s.left, t) || isSubtree(s.right, t);
        } else {
            return isSubtree(s.left, t) || isSubtree(s.right, t);
        }
    }

    private static boolean isSame(TreeNode s, TreeNode t) {
        if (s == null && t == null) {
            return true;
        } else if (s != null && t != null) {
            return s.val == t.val && isSame(s.right, t.right) && isSame(s.left, t.left);
        }
        return false;
    }
}
