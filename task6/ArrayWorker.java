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

    public static double getMinValue(double[][] array) {

        checkArraySize(array);

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


    public static double getMaxValue(double[][] array) {

        checkArraySize(array);

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


    public static double getAverageArithmetic(double[][] array) {

        checkArraySize(array);

        double sum = 0;
        int countElement = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
                countElement++;
            }
        }

        return sum / countElement;
    }


    public static double getAverageGeometry(double[][] array) {

        checkArraySize(array);

        double result = 1.;
        double countElemnt = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < 0){
                    return ERROR_VALUE;
                }
                result *= array[i][j];
                countElemnt++;
            }

        }

        return Math.pow(result, 1.0 / countElemnt);
    }


    public static boolean checkAscending(double[][] array) {

        checkArraySize(array);

        int arrLength = array.length - 1;

        for (int i = 0; i < arrLength; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > array[i][j + 1]){
                    return false;
                }
            }
        }

        return true;
    }


    public static boolean checkDecrease(double[][] array) {

        checkArraySize(array);

        int arrLength = array.length - 1;

        for (int i = 0; i < arrLength; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < array[i][j + 1]){
                    return false;
                }
            }
        }

        return true;
    }


    public static String getLocalMinIndex(double[][] array) {

        checkArraySize(array);

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


    public static String getLocalMaxIndex(double[][] array) {

        checkArraySize(array);

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


    public static double[][] reverseNotSquare(double[][] arr) {

        checkArraySize(arr);

        if (checkArrToSquare(arr)){
            return new double[0][0];
        }

        double[][] arrT = new double[arr[0].length][arr.length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arrT[j][i] = arr[i][j];
            }
        }

        return arrT;
    }

    public static void reverseSquare(double[][] arr) {

        checkArraySize(arr);

        if (!checkArrToSquare(arr)) {
            throw new IllegalArgumentException("Not a square matrix");
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr[i].length; j++) {
                if (i != j) {
                    arr[i][j] = arr[i][j] + arr[j][i];
                    arr[j][i] = arr[j][i] - arr[i][j];
                    arr[i][j] = arr[i][j] - arr[j][i];
                }
            }
        }
    }

    public static boolean checkArrToSquare(double[][] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != array.length){
                return false;
            }
        }

        return true;
    }

    public static void checkArraySize(double[][] array) {
        if (array.length == 0 ) {
            throw new IndexOutOfBoundsException("incorrect array size");
        }
    }

}
