package mainPackage;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        int a[][] = new int[4][];
        System.out.println(a[2].length);
        //task 5
        int n = 15;
        int m = 10;
        double[][] array = new double[n][m];
        ArrayInitializer.rndInit(array,1,20);
        System.out.println(ArrayWorker.findMinValue(array));
        System.out.println(ArrayWorker.findMaxValue(array));
        System.out.printf("%.2f\n", ArrayWorker.calcAverageArithm(array));
        System.out.printf("%.2f\n", ArrayWorker.calcAverageGeom(array));
        System.out.println(ArrayWorker.findLocalMinIndex(array));
        System.out.println(ArrayWorker.findLocalMaxIndex(array));
        array = ArrayWorker.transpose(array);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println();

        double[][] arr = new double[4][4];
        ArrayInitializer.rndInit(arr,1,20);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        ArrayWorker.transposeSquare(arr);
        System.out.println("hi");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }


}
