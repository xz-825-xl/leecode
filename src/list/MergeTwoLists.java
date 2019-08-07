package list;

import entity.ListNode;

/**
 * @author Zhangying
 * @date 2019/8/7
 * leeCode 21
 */
public class MergeTwoLists {

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode rs = null;
        ListNode pre = null;
        while (l1 != null && l2 != null) {
            ListNode listNode = new ListNode(Math.min(l1.val, l2.val));
            if (pre == null) {
                rs = listNode;
                pre = rs;
            } else {
                pre.next = listNode;
                pre = pre.next;
            }
            if (l1.val <= l2.val) {
                l1 = l1.next;
            } else {
                l2 = l2.next;
            }
        }

        if (l1 != null) {
            if (pre == null) {
                rs = l1;
            } else {
                pre.next = l1;
            }
        }

        if (l2 != null) {
            if (pre == null) {
                rs = l2;
            } else {
                pre.next = l2;
            }
        }
        return rs;
    }
}
