package tree;

import entity.Node;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * @author Zhangying
 * @date 2019/8/15
 * leeCode 429
 */
public class LevelOrder2 {

    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> list = new ArrayList<>();
        if(root != null){
            List<Integer> subList = new ArrayList<>();
            subList.add(root.val);
            list.add(subList);
            levelOrder(root.children, list);
        }
        return list;
    }

    public void levelOrder(List<Node> nodes, List<List<Integer>> list){
        if(nodes == null || nodes.isEmpty()){
            return;
        }
        List<Node> subNode = new ArrayList<>();
        List<Integer> subList = new ArrayList<>();
        for(Node node : nodes){
            if(node != null){
                subList.add(node.val);
                subNode.addAll(node.children);
            }
        }
        list.add(subList);
        levelOrder(subNode, list);
    }

    public List<List<Integer>> levelOrder2(Node root) {
        List<List<Integer>> list = new ArrayList<>();
        levelOrder2(root, 0, list);
        return list;
    }

    public void levelOrder2(Node node, int level, List<List<Integer>> list){
        if(node == null){
            return;
        }
        if(level > list.size() - 1){
            list.add(new ArrayList<>());
        }
        list.get(level).add(node.val);
        if(node.children != null){
            for(Node subNode : node.children){
                levelOrder2(subNode, level + 1, list);
            }
        }
    }
}
