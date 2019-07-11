package tree;

import entity.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Zhangying
 * @date 2019/7/11
 * leeCode 102
 */
public class LevelOrder {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        levelOrder(root, list, 0);
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
