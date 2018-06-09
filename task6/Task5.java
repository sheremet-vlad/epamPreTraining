package mainPackage;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        //task 5
        int n = 15;
        int m = 10;
        double[][] array = new double[n][m];
        ArrayInitializer.rndInit(array,1,20);
        System.out.println(ArrayWorker.getMinValue(array));
        System.out.println(ArrayWorker.getMaxValue(array));
        System.out.printf("%.2f\n", ArrayWorker.getAverageArithmetic(array));
        System.out.printf("%.2f\n", ArrayWorker.getAverageGeometry(array));
        System.out.println(ArrayWorker.checkAscending(array));
        System.out.println(ArrayWorker.checkDecrease(array));
        System.out.println(ArrayWorker.getLocalMinIndex(array));
        System.out.println(ArrayWorker.getLocalMaxIndex(array));
        array = ArrayWorker.reverseNotSquare(array);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }

        double[][] arr = new double[4][4];
        ArrayInitializer.rndInit(arr,1,20);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }


}
