package tree;

import entity.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Zhangying
 * @date 2019/7/2
 * leeCode 107
 */
public class LevelOrderBottom {

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        levelOrder(root, list, 0);
        Collections.reverse(list);
        return list;
    }

    public void levelOrder(TreeNode root, List<List<Integer>> list, int level){
        if(root != null){
            if(level > list.size() - 1){
                List<Integer> nodes = new ArrayList<>();
                list.add(nodes);
            }
            list.get(level).add(root.val);
            levelOrder(root.left, list, level + 1);
            levelOrder(root.right, list, level + 1);
        }
    }
}
