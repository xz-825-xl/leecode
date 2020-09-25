package tree;

import entity.TreeNode;

import java.util.Arrays;

/**
 * 描述：106. 从中序与后序遍历序列构造二叉树
 *
 * @author Zhangying
 * @date 2020/9/25 14:43
 */
public class BuildTree {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return dfs(inorder, postorder);
    }

    private TreeNode dfs(int[] inorder, int[] postorder) {
        int inLength = inorder.length;
        int postLength = postorder.length;
        TreeNode node = null;
        int root;
        if (inLength == 0) {
            return null;
        } else if (inLength == 1) {
            return new TreeNode(inorder[0]);
        }
        for (int i = postLength - 1; i >= 0; i--) {
            boolean flag = false;
            for (int j = 0; j < inLength; j++) {
                if (inorder[j] == postorder[i]) {
                    root = postorder[i];
                    node = new TreeNode(root);
                    if (j < inLength - 1) {
                        postorder = Arrays.copyOfRange(postorder, 0, postLength - 1);
                        postLength--;
                        node.right = dfs(Arrays.copyOfRange(inorder, j + 1, inLength), postorder);
                    }
                    if (j - 1 >= 0) {
                        postorder = Arrays.copyOfRange(postorder, 0, postLength - 1);
                        node.left = dfs(Arrays.copyOf(inorder, j), postorder);
                    }

                    flag = true;
                    break;
                }
            }
            if (flag) {
                break;
            }
        }
        return node;
    }

    public static void main(String[] args) {
        System.out.println(new BuildTree().buildTree(new int[]{9, 3, 15, 20, 7}, new int[]{9, 15, 7, 20, 3}));
    }
}
