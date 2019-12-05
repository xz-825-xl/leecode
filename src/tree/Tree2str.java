package tree;

import entity.TreeNode;

/**
 * 描述：606. 根据二叉树创建字符串
 *
 * @author zy
 * @date 2019/12/5 9:11
 */
public class Tree2str {
    public static String tree2str(TreeNode t) {
        StringBuilder builder = new StringBuilder();
        if (t != null) {
            builder.append(t.val);
            getStr(t, builder);
        }
        return builder.toString();
    }

    public static void getStr(TreeNode node, StringBuilder builder) {
        if (node.left == null && node.right != null) {
            builder.append("()");
        }
        if (node.left != null) {
           builder.append("(");
           builder.append(node.left.val);
           getStr(node.left, builder);
           builder.append(")");
        }
        if (node.right != null) {
            builder.append("(");
            builder.append(node.right.val);
            getStr(node.right, builder);
            builder.append(")");
        }
    }
}
