package mainPackage;

public class FindAverageInNumber {

    private static final double COUNT_NUMERALS = 6.0;

    public static double findArithmeticAverage(int value){
        //find Numerals
        int firstNumeral = value % 10;
        int secondNumeral = (value /= 10) % 10;
        int thirdNumeral = (value /= 10) % 10;
        int forthNumral = (value /= 10) % 10;
        int fifthNumeral = (value /= 10) % 10;
        int sixthNumeral = (value /= 10) % 10;

        return (firstNumeral + secondNumeral +
                thirdNumeral + forthNumral +
                fifthNumeral + sixthNumeral) / COUNT_NUMERALS;
    }

    public static double findGeomeetryAverage(int value){
        //find Numerals
        int firstNumeral = value % 10;
        int secondNumeral = (value /= 10) % 10;
        int thirdNumeral = (value /= 10) % 10;
        int forthNumral = (value /= 10) % 10;
        int fifthNumeral = (value /= 10) % 10;
        int sixthNumeral = (value /= 10) % 10;

        return Math.sqrt(firstNumeral * secondNumeral *
                thirdNumeral * forthNumral *
                fifthNumeral * sixthNumeral);
    }
}
