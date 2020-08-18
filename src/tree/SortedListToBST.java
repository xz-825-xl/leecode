package tree;

import entity.ListNode;
import entity.TreeNode;

import java.util.List;

/**
 * 描述：109. 有序链表转换二叉搜索树
 *
 * @author Zhangying
 * @date 2020/8/18 9:54
 */
public class SortedListToBST {

    public TreeNode sortedListToBST(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return new TreeNode(head.val);
        }
        ListNode fast = head;
        ListNode low = head;
        ListNode pre = null;
        while (fast != null && fast.next != null) {
            pre = low;
            low = low.next;
            fast = fast.next.next;
        }
        pre.next = null;

        TreeNode treeNode = new TreeNode(low.val);
        treeNode.right = sortedListToBST(low.next);
        treeNode.left = sortedListToBST(head);
        return treeNode;
    }

    public TreeNode sortedListToBST2(ListNode head) {
        //边界条件的判断
        if (head == null)
            return null;
        if (head.next == null)
            return new TreeNode(head.val);
        //这里通过快慢指针找到链表的中间结点slow，pre就是中间
        //结点slow的前一个结点
        ListNode slow = head, fast = head, pre = null;
        while (fast != null && fast.next != null) {
            pre = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        //链表断开为两部分，一部分是node的左子节点，一部分是node
        //的右子节点
        pre.next = null;
        //node就是当前节点
        TreeNode node = new TreeNode(slow.val);
        //从head节点到pre节点是node左子树的节点
        node.left = sortedListToBST(head);
        //从slow.next到链表的末尾是node的右子树的结点
        node.right = sortedListToBST(slow.next);
        return node;
    }
}
