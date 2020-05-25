package queue;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/**
 * 描述：146. LRU缓存机制
 *
 * @author zy
 * @date 2020/5/25 13:57
 */
public class LRUCache {

    private int capacity;

    private Queue<Integer> keyQueue;

    private Map<Integer, Integer> map;

    public LRUCache(int capacity) {
        keyQueue = new LinkedList<>();
        map = new HashMap<>(capacity);
        this.capacity = capacity;
    }

    public int get(int key) {
        if (map.containsKey(key)) {
            keyQueue.remove(key);
            keyQueue.offer(key);
        }
        return map.getOrDefault(key, -1);
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            keyQueue.remove(key);
            keyQueue.offer(key);
            map.put(key, value);
        } else {
            if (keyQueue.size() == capacity) {
                Integer removeKey = keyQueue.poll();
                map.remove(removeKey);
            }
            keyQueue.offer(key);
            map.put(key, value);
        }
    }

    // 1,-1,-1,3,4
    public static void main(String[] args) {
        LRUCache lruCache = new LRUCache(2);
//        lruCache.put(1, 1);
//        lruCache.put(2, 2);
//        System.out.println(lruCache.get(1));
//        lruCache.put(3, 3);
//        System.out.println(lruCache.get(2));
//        lruCache.put(4, 4);
//        System.out.println(lruCache.get(1));
//        System.out.println(lruCache.get(3));
//        System.out.println(lruCache.get(4));
        lruCache.put(2, 1);
        lruCache.put(1, 1);
        lruCache.put(2, 3);
        lruCache.put(4, 1);
        System.out.println(lruCache.get(1));
        System.out.println(lruCache.get(2));
    }
}
