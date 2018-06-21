package mainPackage;

import java.util.Random;

/**
 * This find different
 * characteristics by
 * recursive algorithms
 *
 * @author Sheremet-vlad
 *
 * @version 1.0
 */

public class Recursion {
    private static final int RADIX = 10;
    private static final int FIRST_INDEX_FIB = 1;
    private static final int FIRST_NUM_FIB = 1;
    private static final int SECOND_INDEX_FIB = 2;
    private static final int SECOND_NUM_FIB = 1;

    public static int findDigitSum(int n) {
        n = n > 0 ? n : -n;
        return recSumDigit(n);
    }

    public static int recSumDigit(int n) {
        if (n == 0) {
            return 0;
        }
        return (n % RADIX) + findDigitSum(n / RADIX);
    }

    public static double calcNumberInPow(double num, int pow) {
        if (pow < 0) {
            return 0;
        }
        return recNumberPow(num, pow);
    }

    private static double recNumberPow(double num, int pow) {
        if (pow == 0) {
            return 1;
        }
        return num * recNumberPow(num, pow - 1);
    }


    public static boolean equals(int num, int s) {
        if (num < 0 || s < 0) {
            return false;
        }
        return recEquals(num, s);
    }

    private static boolean recEquals(int num, int s) {
        if (num == 0) {
            if (s == 0) {
                return true;
            } else {
                return false;
            }
        } else {
            return recEquals(num / RADIX, s - num % RADIX);
        }
    }

    public static long findFibonacci(int num) {
        if (num < 1) {
            return -1;
        }
        return recFindFibonacci(num);
    }

    private static long recFindFibonacci(int num) {
        if (num == FIRST_INDEX_FIB) {
            return FIRST_NUM_FIB;
        }
        if (num == SECOND_INDEX_FIB) {
            return SECOND_NUM_FIB;
        }
        return recFindFibonacci(num - 1) + recFindFibonacci(num - 2);
    }
}
