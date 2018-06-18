/**
 * tossCoin
 *
 * Class used to count
 * number of tails and heads
 * when tossing a coin
 *
 * @version 1.0
 *
 * @author sheremet-vlad
 */
package mainPackage;

import java.util.Random;

public class Coin {

    public static String tossCoin(int tossCount) {
        final int MAX_VALUE = 2;
        final int TAIL_VALUE = 1;

        int tails = 0;
        int heads = 0;

        Random random = new Random();

        for (int i = 0; i < tossCount; i++) {
            if (random.nextBoolean()) {
                tails++;
            }
        }

        return "решек - " + tails + ", орел -" + (tossCount - tails);
    }
}
