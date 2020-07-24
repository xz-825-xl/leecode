package str;

/**
 * 描述：1360. 日期之间隔几天
 *
 * @author zy
 * @date 2020/7/24 9:04
 */
public class DaysBetweenDates {

    private static int[] commonYearMonths = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static int[] leapYearMonths = new int[]{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static int daysBetweenDates(String date1, String date2) {
        int sum = 0;
        String[] date1Array = date1.split("-");
        String[] date2Array = date2.split("-");
        int year1 = Integer.valueOf(date1Array[0]);
        int year2 = Integer.valueOf(date2Array[0]);
        boolean isLeapYear1 = year1 % 400 == 0 || (year1 % 100 != 0 && year1 % 4 == 0);
        boolean isLeapYear2 = year2 % 400 == 0 || (year2 % 100 != 0 && year2 % 4 == 0);;
        while (Math.abs(year1 - year2) > 1) {
            if (year1 > year2) {
                year2++;
                sum += (year2 % 400 == 0 || (year2 % 100 != 0 && year2 % 4 == 0)) ? 366 : 365;
            } else {
                year1++;
                sum += (year1 % 400 == 0 || (year1 % 100 != 0 && year1 % 4 == 0)) ? 366 : 365;
            }
        }

        int month1 = Integer.valueOf(date1Array[1]);
        int month2 = Integer.valueOf(date2Array[1]);
        int day1 = Integer.valueOf(date1Array[2]);
        int day2 = Integer.valueOf(date2Array[2]);
        if (year1 < year2) {
            sum += diffYearDays(month1, month2, day1, day2, isLeapYear1, isLeapYear2);
        } else if (year2 < year1) {
            sum += diffYearDays(month2, month1, day2, day1, isLeapYear2, isLeapYear1);
        } else {
            if (month1 > month2) {
                sum += commonYearDays(month2, month1, day2, day1, isLeapYear1);
            } else if (month1 < month2) {
                sum += commonYearDays(month1, month2, day1, day2, isLeapYear1);
            } else {
                sum += Math.abs(day1 - day2);
            }
        }
        return sum;
    }

    private static int diffYearDays(int month1, int month2, int day1, int day2, boolean isLeapYear1, boolean isLeapYear2) {
        int sum = (isLeapYear1 ? leapYearMonths[month1 - 1] : commonYearMonths[month1 - 1]) - day1;
        for (int i = month1; i < 12; i++) {
            sum += isLeapYear1 ? leapYearMonths[i] : commonYearMonths[i];
        }
        for (int i = 0; i < month2 - 1; i++) {
            sum += isLeapYear2 ? leapYearMonths[i] : commonYearMonths[i];
        }
        sum += day2;
        return sum;
    }

    private static int commonYearDays(int month1, int month2, int day1, int day2, boolean isLeapYear) {
        int sum = (isLeapYear ? leapYearMonths[month1 - 1] : commonYearMonths[month1 - 1]) - day1;
        for (int i = month1; i < month2; i++) {
            sum += isLeapYear ? leapYearMonths[i] : commonYearMonths[i];
        }
        sum += day2;
        return sum;
    }

    public static void main(String[] args) {
        //System.out.println(daysBetweenDates("2019-06-29", "2019-06-30"));
        //System.out.println(daysBetweenDates("2020-01-15", "2019-12-31"));
        //System.out.println(daysBetweenDates("1971-06-29", "2010-09-23"));
        //System.out.println(daysBetweenDates("2085-05-10", "1993-07-14"));
        System.out.println(daysBetweenDates("2100-09-22", "1991-03-12"));
    }
}
