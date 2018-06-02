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

    public static int defineCountHeads(int age) {
        final int START_COUNT_HEAD = 3;
        final int PLUS_HEADS_YOUNG = 3;
        final int PLUS_HEADS_MIDDLE = 2;
        final int PLUS_HEADS_OLD = 1;
        final int MAX_YEARS_YOUNG = 200;
        final int MAX_YEARS_MIDDLE = 300;
        final int ERROR_AGE = -1;
        final int MIN_AGE = 0;

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

    //method define count if eyes
    public static int defineCountEyes(int width){
        final int COUNT_EYES_ON_HEAD = 2;
        return defineCountHeads(width) * COUNT_EYES_ON_HEAD;
    }
}
