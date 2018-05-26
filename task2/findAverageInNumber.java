package mainPackage;

public class findAverageInNumber {
    private static int firstNumeral,secondNumeral,
                        thirdNumeral,forthNumral,
                        fifthNumeral,sixthNumeral;
    private static void findNumerals(int value){
        firstNumeral = value % 10;
        value /= 10;
        secondNumeral = value % 10;
        value /= 10;
        thirdNumeral = value % 10;
        value /= 10;
        forthNumral = value % 10;
        value /= 10;
        fifthNumeral = value % 10;
        value /= 10;
        sixthNumeral = value;
    }

    public static double findArithmeticAverage(int value){
        findNumerals(value);
        int sum = firstNumeral + secondNumeral +
                    thirdNumeral + forthNumral +
                    fifthNumeral + sixthNumeral;
        return sum/6.0;
    }

    public static double findGeomeetryAverage(int value){
        findNumerals(value);
        int multiply = firstNumeral * secondNumeral *
                        thirdNumeral * forthNumral *
                        fifthNumeral * sixthNumeral;
        return Math.sqrt(multiply);
    }
}
