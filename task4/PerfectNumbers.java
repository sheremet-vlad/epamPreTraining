/**
 * PerfectNumbers
 *
 * Class used to
 * find perfect numbers
 *
 * @version 1.0
 *
 * @author sheremet-vlad
 */

package mainPackage;

public class PerfectNumbers {
    public static boolean isPerfect(int number){
        int sum = 1;
        int maxDivisors = number / 2;

        for (int i = 2; i < maxDivisors; i++) {
            if (number % i == 0){
                sum += i;
            }
        }

        return sum == number;
    }
}
