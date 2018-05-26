package mainPackage;

public class Reverse {
    private static int firstNumeral,secondNumeral,
            thirdNumeral,forthNumral,
            fifthNumeral,sixthNumeral,
            seventhNumeral;
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
        sixthNumeral = value % 10;
        value /= 10;
        seventhNumeral = value;
    }

    public static int reverseNumeral(int value){
        findNumerals(value);
        int reverseValue = seventhNumeral  +
                            sixthNumeral * 10 +
                            fifthNumeral * 100 +
                            forthNumral * 1000 +
                            thirdNumeral * 10000 +
                            secondNumeral * 100000 +
                            firstNumeral * 1000000;
        return reverseValue;
    }


}
