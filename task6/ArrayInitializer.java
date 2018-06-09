package mainPackage;

import java.util.Random;

public class ArrayInitializer {
    public static void rndInit(double[][] array, int min, int max) {
        
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(min + max + 1) + min;
            }

        }
    }
}
