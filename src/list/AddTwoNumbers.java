package list;

import entity.ListNode;

import java.util.Objects;

/** leeCode 2
 * @author Zhangying
 * @date 2019/6/25
 */
public class AddTwoNumbers {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp = null;
        int num = 0;
        while (l1 != null || l2 != null) {
            int val = (Objects.isNull(l1) ? 0 : l1.val) + (Objects.isNull(l2) ? 0 : l2.val) + num;
            if (val >= 10) {
                val = val - 10;
                num = 1;
            } else {
                num = 0;
            }
            ListNode node = new ListNode(val);
            node.next = temp;
            temp = node;
            l1 = Objects.isNull(l1) ? null : l1.next;
            l2 = Objects.isNull(l2) ? null : l2.next;
        }
        if (num > 0) {
            ListNode node = new ListNode(1);
            node.next = temp;
            temp = node;
        }
        ListNode pre = null;
        ListNode cur = temp;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }

    public static void main(String[] args) {
        ListNode l1 = ListNode.creatListNode();
        ListNode l2 = ListNode.creatListNode();
        System.out.println(addTwoNumbers(l1, l2));
    }
}
