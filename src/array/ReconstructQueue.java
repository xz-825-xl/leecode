package array;

/**
 * 描述：406. 根据身高重建队列
 *
 * @author Zhangying
 * @date 2020/11/16 15:13
 */
public class ReconstructQueue {

    public int[][] reconstructQueue(int[][] people) {
        for (int i = 0; i < people.length; i++) {
            for (int j = i + 1; j < people.length; j++) {
               if(people[i][0] < people[j][0] || (people[i][0] == people[j][0] && people[i][1] > people[j][1])) {
                    int[] temp = people[j];
                    people[j] = people[i];
                    people[i] = temp;
               }
            }
        }

        for (int i = 0; i < people.length; i++) {
            int index = i;
            while(people[index][1] < index) {
                int[] temp = people[index];
                people[index] = people[index - 1];
                people[index - 1] = temp;
                index--;
            }
        }

        return people;
    }

    public static void main(String[] args) {
        new ReconstructQueue().reconstructQueue(new int[][]{{7, 0}, {4, 4}, {7, 1}, {5, 0}, {6, 1}, {5, 2}});
    }

}
