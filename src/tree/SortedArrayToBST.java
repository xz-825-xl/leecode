package tree;

import entity.TreeNode;

/**
 * @author Zhangying
 * @date 2019/8/26
 * 108. 将有序数组转换为二叉搜索树
 */
public class SortedArrayToBST {

    public static TreeNode sortedArrayToBST(int[] nums) {
        return nums.length == 0 ? null : toTree(nums, 0, nums.length - 1);
    }

    private static TreeNode toTree(int[] nums, Integer l, Integer r) {
        if (l > r) {
            return null;
        }
        int index = (r + l) / 2;
        TreeNode node = new TreeNode(nums[index]);
        node.left = toTree(nums, l, index - 1);
        node.right = toTree(nums, index + 1, r);
        return node;
    }
}
