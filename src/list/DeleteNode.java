package list;

import entity.ListNode;

/**
 * @author Zhangying
 * @date 2019/7/5
 * leeCode 237
 */
public class DeleteNode {

    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
