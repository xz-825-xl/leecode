package tree;

import entity.TreeNode;

import java.util.Stack;

/**
 * leeCode 101
 *
 * @author Zhangying
 * @date 2019/6/27
 */
public class IsSymmetric {

    private static Stack<Integer> stack = new Stack<>();

    public static boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return false;
        }
        traverse(root.left);
        traverse(root.right);

        return stack.empty();
    }

    private static void traverse(TreeNode node) {
        if (node == null) {
            return;
        }
        if (!stack.empty() && node.left != null && node.left.val == stack.peek()) {
            stack.pop();
            if (!stack.empty() && node.right != null && node.right.val == stack.peek()) {
                stack.pop();
            }
        } else {
            stack.push(node.left == null ? null : node.left.val);
            stack.push(node.right == null ? null : node.right.val);
        }
        traverse(node.left);
        traverse(node.right);
    }
}
