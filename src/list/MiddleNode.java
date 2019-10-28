package list;

import entity.ListNode;

/**
 * 描述：876. 链表的中间结点
 *
 * @author zy
 * @date 2019/10/28 10:02
 */
public class MiddleNode {

    public static ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}
