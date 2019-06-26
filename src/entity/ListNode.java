package entity;

/**
 * @author Zhangying
 * @date 2019/6/24
 */
public class ListNode {

    public int val;

    public ListNode next;

    public ListNode(int x) { val = x; }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append(val);
        builder.append(",");
        ListNode temp = next;
        while (temp != null){
            builder.append(temp.val);
            builder.append(",");
            temp = temp.next;
        }
        return builder.toString();
    }

    public static ListNode creatListNode(){
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);
        ListNode node7 = new ListNode(7);
        ListNode node8 = new ListNode(8);
        ListNode node9 = new ListNode(9);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = node8;
        node8.next = node9;
        return node1;
    }
}
