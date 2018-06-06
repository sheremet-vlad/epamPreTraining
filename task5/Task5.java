package mainPackage;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        //task 5
        int[] array = new int[20];
        ArrayInitializer.rndInit(array,1,20);
        System.out.println(ArrayWorker.getMinValue(array));
        System.out.println(ArrayWorker.getMaxValue(array));
        System.out.printf("%.2f\n", ArrayWorker.getAverageArithmetic(array));
        System.out.printf("%.2f\n", ArrayWorker.getAverageGeometry(array));
        System.out.println(ArrayWorker.checkAscending(array));
        System.out.println(ArrayWorker.checkDecrease(array));
        System.out.println(ArrayWorker.getLocalMinIndex(array));
        System.out.println(ArrayWorker.getLocalMaxIndex(array));
        ArrayWorker.reverse(array);
        System.out.println(Arrays.toString(array));
    }


}
