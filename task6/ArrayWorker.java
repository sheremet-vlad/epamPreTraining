/**
 * ArrayWorker
 *
 * This array used to
 * different functions
 * with array
 *
 * @version 1.0
 *
 * @author sheremet-vlad
 */
package mainPackage;

public class ArrayWorker {

    private static final int ERROR_VALUE = -1;
    private static final String ELEMENT_NOT_FOUND = "-1";

    public static double findMinValue(double[][] array) {

        if (checkArraySize(array)){
            return ERROR_VALUE;
        }

        double minValue = array[0][0];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (minValue > array[i][j]){
                    minValue = array[i][j];
                }
            }
        }

        return minValue;
    }


    public static double findMaxValue(double[][] array) {

        if (checkArraySize(array)){
            return ERROR_VALUE;
        }

        double maxValue = array[0][0];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (maxValue < array[i][j]){
                    maxValue = array[i][j];
                }
            }

        }

        return maxValue;
    }


    public static double calcAverageArithm(double[][] array) {

        if (checkArraySize(array)){
            return ERROR_VALUE;
        }

        double sum = 0;
        int countElement = 0;

        for (int i = 0; i < array.length; i++) {
            countElement += array[i].length;
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }

        return sum / countElement;
    }


    public static double calcAverageGeom(double[][] array) {

        if (checkArraySize(array)){
            return ERROR_VALUE;
        }

        double result = 1.;
        double countElement = 0;

        for (int i = 0; i < array.length; i++) {
            countElement += array[i].length;
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < 0){
                    return ERROR_VALUE;
                }
                result *= array[i][j];
            }

        }

        return Math.pow(result, 1.0 / countElement);
    }


    public static String findLocalMinIndex(double[][] array) {

        if (checkArraySize(array)){
            return ELEMENT_NOT_FOUND;
        }

        int arrLength = array.length - 1;
        int arrSecondLength;

        for (int i = 1; i < arrLength ; i++) {
            arrSecondLength = array[i].length - 1;
            for (int j = 1; j < arrSecondLength; j++) {
                if (array[i][j] < array[i-1][j] && array[i][j] < array[i+1][j]
                        &&  array[i][j] < array[i][j + 1] && array[i][j] < array[i][j - 1]) {
                    return i + " " + j;
                }
            }
        }

        return ELEMENT_NOT_FOUND;
    }


    public static String findLocalMaxIndex(double[][] array) {

        if (checkArraySize(array)){
            return ELEMENT_NOT_FOUND;
        }

        int arrLength = array.length - 1;
        int arrSecondLength;

        for (int i = 1; i < arrLength ; i++) {
            arrSecondLength = array[i].length - 1;
            for (int j = 1; j < arrSecondLength; j++) {
                if (array[i][j] > array[i-1][j] && array[i][j] > array[i+1][j]
                        &&  array[i][j] > array[i][j + 1] && array[i][j] > array[i][j - 1]) {
                    return i + " " + j;
                }
            }
        }

        return ELEMENT_NOT_FOUND;
    }


    public static double[][] transpose(double[][] arr) {

        if (checkArraySize(arr)){
            return arr;
        }

        double[][] arrT = new double[arr[0].length][arr.length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arrT[j][i] = arr[i][j];
            }
        }

        return arrT;
    }

    public static void transposeSquare(double[][] arr) {

        if (checkArraySize(arr)){
            return;
        }

        if (isNotSquare(arr)) {
            return;
        }


        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr[i].length; j++) {
                if (i != j) {
                    arr[i][j] = arr[i][j] + arr[j][i];
                    arr[j][i] = arr[i][j] - arr[j][i];
                    arr[i][j] = arr[i][j] - arr[j][i];
                }
            }
        }
    }

    public static boolean isNotSquare(double[][] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != array.length){
                return true;
            }
        }

        return false;
    }

    private static boolean checkArraySize(double[][] array) {
        boolean flag = false;
        if (array != null && array.length != 0){
            for (int i = 0; i < array.length; i++) {
                if (array[i] == null || array[i].length != array[1].length){
                    return true;
                }
            }
        }
        else {
            return true;
        }

        return false;
    }

}
