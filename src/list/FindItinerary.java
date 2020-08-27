package list;

import java.util.*;

/**
 * 描述：332. 重新安排行程
 *
 * @author Zhangying
 * @date 2020/8/27 9:48
 */
public class FindItinerary {
    public List<String> findItinerary(List<List<String>> tickets) {
        List<String> list = new ArrayList<>();
        Map<String, PriorityQueue<String>> map = new HashMap<>();
        for (List<String> ticket : tickets) {
            if (!map.containsKey(ticket.get(0))) {
                map.put(ticket.get(0), new PriorityQueue<>());
            }
            map.get(ticket.get(0)).add(ticket.get(1));
        }
        dfs(list, map, "JFK");
        Collections.reverse(list);
        return list;
    }

    private void dfs(List<String> list, Map<String, PriorityQueue<String>> map, String key) {
        while (map.containsKey(key) && map.get(key).size() > 0) {
            String tmp = map.get(key).poll();
            dfs(list, map, tmp);
        }
        list.add(key);
    }

    public static void main(String[] args) {
        List<List<String>> list = new ArrayList<>();
        List<String> sub1 = new ArrayList<>();
        sub1.add("MUC");
        sub1.add("LHR");
        list.add(sub1);

        List<String> sub2 = new ArrayList<>();
        sub2.add("JFK");
        sub2.add("MUC");
        list.add(sub2);

        List<String> sub3 = new ArrayList<>();
        sub3.add("SFO");
        sub3.add("SJC");
        list.add(sub3);

        List<String> sub4 = new ArrayList<>();
        sub4.add("LHR");
        sub4.add("SFO");
        list.add(sub4);

//        List<String> sub5 = new ArrayList<>();
//        sub5.add("");
//        sub5.add("");
//        list.add(sub5);

        new FindItinerary().findItinerary(list);
    }
}
