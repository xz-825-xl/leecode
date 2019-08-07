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
        ListNode node4 = new ListNode(4);
        node1.next = node2;
        node2.next = node4;
        return node1;
    }

    public static ListNode creatListNode2(){
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        node1.next = node2;
        node2.next = node4;
        return node1;
    }
}
