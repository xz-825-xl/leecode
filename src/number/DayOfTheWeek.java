package number;

/**
 * 描述：1185. 一周中的第几天
 *
 * @author zy
 * @date 2019/9/26 8:28
 */
public class DayOfTheWeek {

    private static String[] array = {"Thursday", "Friday", "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday"};
    private static int[] days1 = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static int[] days2 = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static String dayOfTheWeek(int day, int month, int year) {
        int days = 0;
        for (int i = 1971; i < year; i++) {
            if (i % 4 == 0) {
                days += 366;
            } else {
                days += 365;
            }
        }
        for (int i = 1; i < month; i++) {
            if (year % 4 == 0) {
                days += days2[i];
            } else {
                days += days1[i];
            }
        }
        days += day;
        int n = days % 7;
        return array[n];
    }

}
