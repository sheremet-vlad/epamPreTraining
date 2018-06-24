package mainPackage;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt(200000);
        int pow = random.nextInt(20);
        double value = random.nextInt(500);
        int b = 123456;
        int c = 21;
        int d = 6;
        System.out.println(value);

        System.out.println(Recursion.findDigitSum(a));
        System.out.println(Recursion.calcNumberInPow(value,pow));
        System.out.println(Recursion.equals(b,c));
        System.out.println(Recursion.findFibonacci(d));
        System.out.println(Recursion.numberOfRemoving(7,'a','b','c'));
    }



}
