package mainPackage;

public class Task4 {
    public static void main(String[] args) {
        //task1
        System.out.println("task01");
        int countOfTosses = 1000;
        System.out.println(Coin.tossCoin(countOfTosses));

        //task2
        System.out.println("\ntask02");
        int number = 127544;
        int number1 = 21;
        int number2 = 14;
        System.out.println(NaturalNumbers.getMaxDigit(number));
        System.out.println(NaturalNumbers.isPalindrome(number) ?
                            "palindrome" : "not palindrome");
        System.out.println(NaturalNumbers.isSimple(number) ?
                            "simple" : "not simple");
        System.out.println(NaturalNumbers.getSimpleDivisors(number));
        System.out.println("GCD -" + NaturalNumbers.getGCD(number1,number2));
        System.out.println("LCM -" + NaturalNumbers.getLCM(number,number2));
        System.out.println("different " + NaturalNumbers.getCountOfDifDigit(number));

        //task4
        System.out.println("\ntask03");
        int number3 = 8128;
        System.out.println(PerfectNumbers.isPerfect(number3) ?
                            "perfect" : "not perfect");
    }
}
