package queue;

import java.util.Stack;

/**
 * 描述：剑指 Offer 09. 用两个栈实现队列
 *
 * @author zy
 * @date 2020/6/30 9:23
 */
public class CQueue {

    private Stack<Integer> stack1;

    private Stack<Integer> stack2;

    public CQueue() {
        this.stack1 = new Stack<>();
        this.stack2 = new Stack<>();
    }

    public void appendTail(int value) {
        stack1.push(value);
    }

    public int deleteHead() {
        if (stack1.isEmpty() && stack2.isEmpty()) {
            return -1;
        } else {
            if(stack2.isEmpty() && !stack1.isEmpty()) {
                while (!stack1.isEmpty()) {
                    stack2.push(stack1.pop());
                }
            }
            int cur = stack2.pop();
            return cur;
        }
    }
}
