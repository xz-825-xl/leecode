package list;

import entity.ListNode;

/**
 * @author Zhangying
 * @date 2019/8/7
 * leeCode 21
 */
public class MergeTwoLists {

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode rs = new ListNode(0);
        ListNode pre = rs;
        while (l1 != null && l2 != null) {
            ListNode listNode;
            if (l1.val <= l2.val) {
                listNode = new ListNode(l1.val);
                l1 = l1.next;
            } else {
                listNode = new ListNode(l2.val);
                l2 = l2.next;
            }
            pre.next = listNode;
            pre = pre.next;
        }

        if (l1 != null) {
            pre.next = l1;
        }

        if (l2 != null) {
            pre.next = l2;
        }
        return rs.next;
    }
}
