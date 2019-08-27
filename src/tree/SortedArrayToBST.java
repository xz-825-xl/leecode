package tree;

import entity.TreeNode;

/**
 * @author Zhangying
 * @date 2019/8/26
 * 108. 将有序数组转换为二叉搜索树
 */
public class SortedArrayToBST {

    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) {
            return null;
        }
        TreeNode node = new TreeNode(nums[0]);
        for (int i = 1; i < nums.length; i++) {

        }
        return node;
    }
}
