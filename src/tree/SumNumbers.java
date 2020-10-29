package tree;

import entity.TreeNode;

/**
 * 描述：129. 求根到叶子节点数字之和
 *
 * @author Zhangying
 * @date 2020/10/29 9:02
 */
public class SumNumbers {

    public int sumNumbers(TreeNode root) {
        return getNum(root, 0);
    }

    public int getNum(TreeNode root, int num) {
        if (root == null) {
            return 0;
        }
        num = num * 10 + root.val;
        if (root.left == null & root.right == null) {
            return num;
        }
        return getNum(root.left, num) + getNum(root.right, num);
    }

    public static void main(String[] args) {
        System.out.println(new SumNumbers().sumNumbers(TreeNode.createTreeNodes()));
    }
}
