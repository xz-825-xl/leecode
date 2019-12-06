package tree;

import entity.TreeNode;

/**
 * 描述：563. 二叉树的坡度
 *
 * @author zy
 * @date 2019/12/6 8:54
 */
public class FindTilt {

    int count = 0;

    public int findTilt(TreeNode root) {
        countTilt(root);
        return count;
    }

    public int countTilt(TreeNode root) {
         if(root == null){
             return 0;
         }
         int right = countTilt(root.right);
         int left = countTilt(root.left);
         count += Math.abs(right - left);
         return root.val + right + left;
    }
}
