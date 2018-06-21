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
    private static final int ELEMENT_NOT_FOUND = -1;

    public static int findMinValue(int[] array) {

        if (checkArraySize(array)) {
            return ERROR_VALUE;
        }

        int minValue = array[0];

        for (int i = 0; i < array.length; i++) {
            if (minValue > array[i]){
                minValue = array[i];
            }
        }

        return minValue;
    }


    public static int findMaxValue(int[] array) {

        if (checkArraySize(array)) {
            return ERROR_VALUE;
        }

        int maxValue = array[0];

        for (int i = 0; i < array.length; i++) {
            if (maxValue < array[i]){
                maxValue = array[i];
            }
        }

        return maxValue;
    }


    public static double calcAverageArithm(int[] array) {

        if (checkArraySize(array)) {
            return ERROR_VALUE;
        }

        double sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return sum / array.length;
    }


    public static double calcAverageGeom(int[] array) {

        if (checkArraySize(array)) {
            return ERROR_VALUE;
        }

        double result = 1.;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0){
                return ERROR_VALUE;
            }
            result *= array[i];
        }

        return Math.pow(result, 1.0 / array.length);
    }


    public static boolean checkAscending(int[] array) {

        if (checkArraySize(array)) {
            return false;
        }

        int size = array.length - 1;

        for (int i = 0; i < size; i++) {
            if (array[i] > array[i + 1]){
                return false;
            }
        }

        return true;
    }


    public static boolean checkDecrease(int[] array) {

        if (checkArraySize(array)) {
            return false;
        }

        int size = array.length - 1;

        for (int i = 0; i < size; i++) {
            if (array[i] < array[i + 1]){
                return false;
            }
        }

        return true;
    }


    public static int findLocalMinIndex(int[] array) {

        if (checkArraySize(array)) {
            return ERROR_VALUE;
        }

        int size = array.length - 1;

        for (int i = 1; i < size; i++) {
            if (array[i] < array[i-1] && array[i] < array[i+1]) {
                return i;
            }
        }

        return ELEMENT_NOT_FOUND;
    }


    public static int findLocalMaxIndex(int[] array) {

        if (checkArraySize(array)) {
            return ERROR_VALUE;
        }

        int size = array.length - 1;

        for (int i = 1; i < size; i++) {
            if (array[i] > array[i - 1] && array[i] > array[i+1]) {
                return i;
            }
        }

        return ELEMENT_NOT_FOUND;
    }


    public static void reverse(int[] array) {

        if (checkArraySize(array)) {
            return;
        }

        int size = array.length / 2;

        for (int i = 0; i < size; i++) {
            array[i] ^= array[array.length - i - 1];  //minus 1, because first element has index 0
            array[array.length - i - 1] ^= array[i];
            array[i] ^= array[array.length - i - 1];
        }
    }


    public static boolean checkArraySize(int[] array) {
        if (array == null || array.length == 0 ) {
            return true;
        }

        return false;
    }

}
