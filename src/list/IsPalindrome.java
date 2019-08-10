package list;

import entity.ListNode;

/**
 * @author Zhangying
 * @date 2019/8/6
 * leeCode 234
 */
public class IsPalindrome {

    public boolean isPalindrome(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode revers = slow;
        ListNode pre = null;
        while (revers != null){
            ListNode next = revers.next;
            revers.next = pre;
            pre = revers;
            revers = next;
        }

        ListNode tail = pre;
        revers = head;
        boolean flag = true;
        while (tail != null){
            if(tail.val != revers.val){
                flag = false;
                break;
            }
            tail = tail.next;
            revers = revers.next;
        }

        return flag;
    }

}
