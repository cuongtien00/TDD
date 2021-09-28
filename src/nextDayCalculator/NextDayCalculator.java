package nextDayCalculator;

public class NextDayCalculator {

    public static final int FISTOFMONTH = 1;

    public static String nextDayCalculator(int day, int month, int year) {
        String connect = "/";
        int lastOfMonth = getLastOfMonth(month);
        if (day == lastOfMonth) {
            day = FISTOFMONTH;
            month++;
        }
        else {
            day++;
        }
      return day + connect + month + connect + year;
    }

    private static int getLastOfMonth(int month) {
        int lastOfMonth = 0;
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                lastOfMonth = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                lastOfMonth = 30;
                break;
            case 2:
                lastOfMonth = 29;
                break;
        }
        return lastOfMonth;
    }
}
