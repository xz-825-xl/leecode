package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 描述：841. 钥匙和房间
 *
 * @author Zhangying
 * @date 2020/8/31 11:16
 */
public class CanVisitAllRooms {
    private boolean[] flag;

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        flag = new boolean[rooms.size()];
        Arrays.fill(flag, false);
        travel(rooms, 0);

        for (int i = 0; i < flag.length; i++) {
            if (!flag[i]) {
                return false;
            }
        }
        return true;
    }

    private void travel(List<List<Integer>> rooms, int i) {
        flag[i] = true;
        List<Integer> list = rooms.get(i);
        if (list.isEmpty()) {
            return;
        }
        for (int j = 0; j < list.size(); j++) {
            if (!flag[list.get(j)]) {
                travel(rooms, list.get(j));
            }
        }
    }

    public static void main(String[] args) {
        //[[1],[2],[3],[]]
        //[[1,3],[3,0,1],[2],[0]]
        List<List<Integer>> rooms = new ArrayList<>();
        List<Integer> room0 = new ArrayList<>();
        List<Integer> room1 = new ArrayList<>();
        List<Integer> room2 = new ArrayList<>();
        List<Integer> room3 = new ArrayList<>();

        room0.add(1);
        room1.add(2);
        room2.add(3);

        rooms.add(room0);
        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);
        System.out.println(new CanVisitAllRooms().canVisitAllRooms(rooms));

        rooms = new ArrayList<>();
        room0 = new ArrayList<>();
        room1 = new ArrayList<>();
        room2 = new ArrayList<>();
        room3 = new ArrayList<>();

        room0.add(1);
        room0.add(3);
        room1.add(3);
        room1.add(0);
        room1.add(1);
        room2.add(2);
        room3.add(0);

        rooms.add(room0);
        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);
        System.out.println(new CanVisitAllRooms().canVisitAllRooms(rooms));
    }
}
