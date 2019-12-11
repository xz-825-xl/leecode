package tree;

import entity.TreeNode;

/**
 * 描述：872. 叶子相似的树
 *
 * @author zy
 * @date 2019/12/11 8:53
 */
public class LeafSimilar {
    public static boolean leafSimilar(TreeNode root1, TreeNode root2) {
        String s1 = travel(root1, "");
        String s2 = travel(root2, "");
        return s1.equals(s2);
    }

    private static String travel(TreeNode root, String s) {
        if (root == null) {
            return s;
        }
        if (root.left == null && root.right == null) {
            s = s + root.val;
        }
        s = travel(root.left, s);
        s = travel(root.right, s);
        return s;
    }
}
