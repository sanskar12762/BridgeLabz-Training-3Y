public class CalendarDisplay {

    public static String getMonthName(int month) {
        String[] months={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        return months[month-1];
    }

    public static int getDaysInMonth(int month, int year) {
        int[] days={31,28,31,30,31,30,31,31,30,31,30,31};
        if(month==2 && isLeapYear(year)) return 29;
        return days[month-1];
    }

    public static boolean isLeapYear(int year) {
        return (year%4==0 && year%100!=0) || (year%400==0);
    }

    public static int getFirstDay(int month, int year) {
        // Implement Gregorian Algorithm for day of week (0=Sun,...)
        return 0; // Placeholder
    }

    public static void main(String[] args) {
        // Implement UI and display calendar
    }
}
