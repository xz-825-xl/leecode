package list;

/**
 * @author Zhangying
 * @date 2019/8/5
 * leeCode 707
 */
public class MyLinkedList {

    private class MyNode {
        private int val;
        private MyNode next;

        MyNode() {

        }

        MyNode(int val) {
            this.val = val;
        }
    }

    private MyNode node;

    private int length = 0;

    /**
     * Initialize your data structure here.
     */
    public MyLinkedList() {
        node = new MyNode();
    }

    /**
     * Get the value of the index-th node in the linked list. If the index is invalid, return -1.
     */
    public int get(int index) {
        if (index < 0 || index > length - 1) {
            return -1;
        }
        MyNode cur = node;
        int i = 0;
        while (i <= index) {
            if (i == index) {
                break;
            }
            i++;
            cur = cur.next;
        }
        return cur.val;
    }

    /**
     * Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list.
     */
    public void addAtHead(int val) {
        MyNode head = new MyNode(val);
        if (length == 0) {
            node = head;
        } else {
            head.next = node;
            node = head;
        }
        length++;
    }

    /**
     * Append a node of value val to the last element of the linked list.
     */
    public void addAtTail(int val) {
        MyNode tail = new MyNode(val);
        if (length == 0) {
            node = tail;
        } else {
            MyNode cur = node;
            while (cur != null && cur.next != null) {
                cur = cur.next;
            }
            cur.next = tail;
        }
        length++;
    }

    /**
     * Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted.
     */
    public void addAtIndex(int index, int val) {
        if (index > length) {
            return;
        }
        if(index == length){
            addAtTail(val);
            return;
        }
        if (index <= 0) {
            addAtHead(val);
            return;
        }
        MyNode next = node;
        int i = 0;
        while (i <= index) {
            if (i == index - 1) {
                MyNode temp = new MyNode(val);
                temp.next = next.next;
                next.next = temp;
                length++;
                return;
            }
            next = next.next;
            i++;
        }
    }

    /**
     * Delete the index-th node in the linked list, if the index is valid.
     */
    public void deleteAtIndex(int index) {

        if (index > length - 1) {
            return;
        }

        MyNode next = node;
        int i = 0;
        while (i <= index) {
            if (i == index || i == index - 1) {
                if (index == 0) {
                    node = node.next;
                } else {
                    next.next = next.next.next;
                }
                length--;
                return;
            }
            next = next.next;
            i++;
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        MyNode next = node;
        while (next != null) {
            builder.append(next.val);
            builder.append(",");
            next = next.next;
        }
        return builder.toString();
    }
}
