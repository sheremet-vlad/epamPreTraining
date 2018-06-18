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

    public static int getMinValue(int[] array) {

        checkArraySize(array);

        int minValue = array[0];

        for (int i = 0; i < array.length; i++) {
            if (minValue > array[i]){
                minValue = array[i];
            }
        }

        return minValue;
    }


    public static int getMaxValue(int[] array) {

        checkArraySize(array);

        int maxValue = array[0];

        for (int i = 0; i < array.length; i++) {
            if (maxValue < array[i]){
                maxValue = array[i];
            }
        }

        return maxValue;
    }


    public static double getAverageArithmetic(int[] array) {

        checkArraySize(array);

        double sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return sum / array.length;
    }


    public static double getAverageGeometry(int[] array) {

        checkArraySize(array);

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

        checkArraySize(array);

        int size = array.length - 1;

        for (int i = 0; i < size; i++) {
            if (array[i] > array[i + 1]){
                return false;
            }
        }

        return true;
    }


    public static boolean checkDecrease(int[] array) {

        checkArraySize(array);

        int size = array.length - 1;

        for (int i = 0; i < size; i++) {
            if (array[i] < array[i + 1]){
                return false;
            }
        }

        return true;
    }


    public static int getLocalMinIndex(int[] array) {

        checkArraySize(array);

        int size = array.length - 1;

        for (int i = 1; i < size; i++) {
            if (array[i] < array[i-1] && array[i] < array[i+1]) {
                return i;
            }
        }

        return ELEMENT_NOT_FOUND;
    }


    public static int getLocalMaxIndex(int[] array) {

        checkArraySize(array);

        int size = array.length - 1;

        for (int i = 1; i < size; i++) {
            if (array[i] > array[i - 1] && array[i] > array[i+1]) {
                return i;
            }
        }

        return ELEMENT_NOT_FOUND;
    }


    public static void reverse(int[] array) {

        checkArraySize(array);

        int size = array.length / 2;

        for (int i = 0; i < size; i++) {
            array[i] ^= array[array.length - i - 1];  //minus 1, because first element has index 0
            array[array.length - i - 1] ^= array[i];
            array[i] ^= array[array.length - i - 1];
        }
    }


    public static void checkArraySize(int[] array) {
        if (array.length == 0 ) {
            throw new IndexOutOfBoundsException("incorrect array size");
        }
    }

}
