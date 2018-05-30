/**
 * RandomValue
 *
 * Used to random
 * value for define mood
 *
 * @author sheremet-vlad
 * @version 1.0
 */


package mainPackage;

import java.util.Random;

public class RandomValue {
    public static int randomMood(int maxValue){
        return new Random().nextInt(maxValue);
    }
}
