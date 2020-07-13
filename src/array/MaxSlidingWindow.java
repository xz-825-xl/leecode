package array;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;

/**
 * 描述：剑指 Offer 59 - I. 滑动窗口的最大值
 *
 * @author zy
 * @date 2020/7/7 8:56
 */
public class MaxSlidingWindow {

    public static int[] maxSlidingWindow(int[] nums, int k) {
        if (k == 0) {
            return new int[]{};
        }
        int[] rs = new int[nums.length - k + 1];
        Deque<Integer> queue = new LinkedList<>();
        int index = 0;
        for (int i = 0; i < k; i++) {
            while (!queue.isEmpty() && queue.getLast() < nums[i]) {
                queue.removeLast();
            }
            queue.addLast(nums[i]);
        }
        if (!queue.isEmpty()) {
            rs[index] = queue.getFirst();
            index++;
        }
        for (int i = k; i < nums.length; i++) {
            if (!queue.isEmpty() && nums[i - k] == queue.getFirst()) {
                queue.removeFirst();
            }
            while (!queue.isEmpty() && queue.getLast() < nums[i]) {
                queue.removeLast();
            }
            queue.addLast(nums[i]);
            rs[index] = queue.getFirst();
            index++;
        }
        return rs;
    }

    public static void main(String[] args) {
        //maxSlidingWindow(new int[]{}, 0);
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.offer(1);
        queue.offer(3);
        queue.offer(10);
        queue.offer(5);
        queue.offer(12);
        queue.offer(7);
        queue.offer(8);
        queue.offer(9);
        queue.offer(2);

        queue.remove(3);
        queue.remove(9);
    }
}
