package mainPackage;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        //task 5
        int[] array = new int[20];
        ArrayInitializer.rndInit(array,1,20);
        System.out.println(ArrayWorker.findMinValue(array));
        System.out.println(ArrayWorker.findMaxValue(array));
        System.out.printf("%.2f\n", ArrayWorker.calcAverageArithm(array));
        System.out.printf("%.2f\n", ArrayWorker.calcAverageGeom(array));
        System.out.println(ArrayWorker.checkAscending(array));
        System.out.println(ArrayWorker.checkDecrease(array));
        System.out.println(ArrayWorker.findLocalMinIndex(array));
        System.out.println(ArrayWorker.findLocalMaxIndex(array));
        ArrayWorker.reverse(array);
        System.out.println(Arrays.toString(array));
    }


}
