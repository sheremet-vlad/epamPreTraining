/**
 * Dragon
 *
 * Used to count heads
 * and eyes at the dragon
 *
 * @author sheremet-vlad
 * @version 1.0
 */

package mainPackage;

public class Dragon {
    private static final int START_COUNT_HEAD = 3;
    private static final int PLUS_HEADS_YOUNG = 3;
    private static final int PLUS_HEADS_MIDDLE = 2;
    private static final int PLUS_HEADS_OLD = 1;
    private static final int MAX_YEARS_YOUNG = 200;
    private static final int MAX_YEARS_MIDDLE = 300;
    private static final int COUNT_EYES_ON_HEAD = 2;
    private static final int ERROR_AGE = -1;
    private static final int MIN_AGE = 0;

    public static int defineCountHeads(int age) {
        int grewHeadsCount;

        if (age < MIN_AGE) {
            return ERROR_AGE;
        }

        if (age < MAX_YEARS_YOUNG) {
            grewHeadsCount = age * PLUS_HEADS_YOUNG;
        } else if (age < MAX_YEARS_MIDDLE) {
            grewHeadsCount = MAX_YEARS_YOUNG * PLUS_HEADS_YOUNG +
                    (age - MAX_YEARS_YOUNG) * PLUS_HEADS_MIDDLE;
        } else {
            grewHeadsCount = MAX_YEARS_YOUNG * PLUS_HEADS_YOUNG +
                    (MAX_YEARS_MIDDLE - MAX_YEARS_YOUNG) * PLUS_HEADS_MIDDLE +
                    (age - MAX_YEARS_MIDDLE) * PLUS_HEADS_OLD;
        }

        return grewHeadsCount + START_COUNT_HEAD;
    }

    public static int defineCountEyes(int age){
        if (age < MIN_AGE) {
            return ERROR_AGE;
        }
        return defineCountHeads(age) * COUNT_EYES_ON_HEAD;
    }
}
