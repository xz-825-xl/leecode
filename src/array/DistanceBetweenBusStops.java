package array;

/**
 * 描述：1184. 公交站间的距离
 *
 * @author zy
 * @date 2019/10/15 8:54
 */
public class DistanceBetweenBusStops {
    public static int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int count1 = 0;
        int count2 = 0;
        int clockIndex = start;
        int unClockIndex = destination;
        while (clockIndex != destination || unClockIndex != start) {
            if (clockIndex != destination) {
                count1 += distance[clockIndex];
                clockIndex = (clockIndex + 1) % distance.length;
            } else if (count1 <= count2) {
                return count1;
            }
            if (unClockIndex != start) {
                count2 += distance[unClockIndex];
                unClockIndex = (unClockIndex + 1) % distance.length;
            } else if (count2 <= count1) {
                return count2;
            }
        }
        return Math.min(count1, count2);
    }
}
