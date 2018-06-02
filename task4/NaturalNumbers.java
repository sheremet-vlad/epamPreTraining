/**
 * NaturalNumbers
 *
 * Class used to
 *  get different
 *  numbers characteristics
 *
 *  @version 1.0
 *
 *  @author sheremet-vlad
 */
package mainPackage;

import java.util.Random;

public class NaturalNumbers {
    private static final int RADIX = 10;
    public static int getMaxDigit(int value) {
        int maxDigit = 0;
        int temp;

        while (value != 0) {
            if ((temp = value % RADIX) > maxDigit) {
                maxDigit = temp;
            }
            value /= RADIX;
        }

        return maxDigit;
    }

    //method check number for palindrome
    public static boolean isPalindrome(int number){
        int reverse = 0;
        int lastDigit = 0;
        int temp = number;

        while (temp != 0){
            lastDigit = temp % RADIX;
            reverse = reverse * RADIX + lastDigit;
            temp /= RADIX;
        }

        return reverse == number;
    }

    //method check simple numbers
    public static boolean isSimple(int number){
        for (int i = 2; i < number; i++) {
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }

    //method find all simple divisors
    public static String getSimpleDivisors(int number){
        StringBuffer result = new StringBuffer("");

        for (int i = 2; i < number; i++) {
            if (number % i == 0){
                if (isSimple(i)){
                    result.append(i+" ");
                }
            }
        }

        return result+"";
    }

    //method find GCD of two numbers
    public static int getGCD(int number1, int number2){
        while (number1 != 0 && number2 != 0){
            if (number1 > number2){
                number1 %= number2;
            } else {
                number2 %= number1;
            }
        }

        return number1 + number2;
    }

    //method find LCM of two numbers
    public static int getLCM(int number1, int number2) {
        return number1 / getGCD(number1,number2) * number2;
    }

    //method find count of different digits
    public static int getCountOfDifDigit(int num) {
        int count = 0;
        int temp;

        for (int i = 0; i < RADIX; i++) {
            temp = num;
            while (temp > 0) {
                if (temp % RADIX == i) {
                    count++;
                    break;
                }
                temp /= RADIX;
            }
        }

        return count;
    }
}
