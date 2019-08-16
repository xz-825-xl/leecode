package array;

import java.util.PriorityQueue;

/**
 * @author Zhangying
 * @date 2019/8/16
 * leeCode 703
 */
public class KthLargest {

    private int k;

    private PriorityQueue<Integer> queue;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        this.queue = new PriorityQueue<>(k);
        for (int num : nums) {
            add(num);
        }
    }

    public int add(int val) {
        if (this.queue.size() < k) {
            queue.offer(val);
        } else if (this.queue.peek() < val) {
            this.queue.poll();
            this.queue.offer(val);
        }
        return queue.peek();
    }
}
