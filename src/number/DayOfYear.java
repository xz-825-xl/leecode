package number;

/**
 * 描述：1154. 一年中的第几天
 *
 * @author zy
 * @date 2019/10/16 10:41
 */
public class DayOfYear {

    private static int[] days1 = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static int[] days2 = new int[]{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static int dayOfYear(String date) {
        int count = 0;
        String[] array = date.split("-");
        int year = Integer.valueOf(array[0]);
        int month = Integer.valueOf(array[1]);
        int days = Integer.valueOf(array[2]);
        boolean falg = ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0);
        for (int i = 0; i < month - 1; i++) {
            count += (falg ? days2[i] : days1[i]);
        }
        count += days;
        return count;
    }

}
