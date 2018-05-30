/**
 * GregorianCalendar
 *
 * Used to define
 * date of next day
 *
 * @author sheremet-vlad
 * @version 1.0
 */


package mainPackage;

public class GregorianCalendar {
    private static final int AUGUST = 8;
    private static final int DECEMBER = 12;
    private static final int MAX_DAY_FOR_FEBRUARY = 29;
    private static final int MAX_DAY_TO_SHORT_MONTH = 31; //short - moths, which consist of 30 days
    private static final int MAX_DAY_TO_LONG_MONTH = 32;  //short - moths, which consist of 31 days

    public static String defineNextDate(int dd, int mm, int yyyy){
        dd++;

        if (dd == MAX_DAY_FOR_FEBRUARY){
            if (!isBissextileYear(yyyy)) {
                dd = 1;
                mm++;
            }
        } else if (dd == MAX_DAY_TO_SHORT_MONTH){
            if ((dd >= AUGUST && dd % 2 == 1) ||
                    (dd < AUGUST && dd % 2 == 0)) {
                dd = 1;
                mm++;
            }
        } else if (dd == MAX_DAY_TO_LONG_MONTH){
            if (mm == DECEMBER){
                yyyy++;
                mm =1;
            } else {
                mm++;
            }
            dd = 1;
        }

        return dd + "." + mm + "."+ yyyy;
    }

    public static boolean isBissextileYear(int yyyy){
        boolean check = false;
        if (yyyy % 4 == 0){
            if (yyyy % 100 == 0){
                if (yyyy % 400 == 0){
                    check = true;
                } else {
                    check = false;
                }
            }
            check = true;
        }

        return check;
    }

}
