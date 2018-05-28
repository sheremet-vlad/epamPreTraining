package mainPackage;

public class Reverse {

    public static int reverseNumeral(int value){
        //find Numerals
        int firstNumeral = value % 10;
        int secondNumeral = (value /= 10) % 10;
        int thirdNumeral = (value /= 10) % 10;
        int forthNumral = (value /= 10) % 10;
        int fifthNumeral = (value /= 10) % 10;
        int sixthNumeral = (value /= 10) % 10;
        int seventhNumeral = (value /= 10) % 10;

        return seventhNumeral  +
                sixthNumeral * 10 +
                fifthNumeral * 100 +
                forthNumral * 1000 +
                thirdNumeral * 10000 +
                secondNumeral * 100000 +
                firstNumeral * 1000000;
    }


}
