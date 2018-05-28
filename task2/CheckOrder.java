package mainPackage;

public class CheckOrder {
    public static boolean checkIncreasOrderInNumber(int value){
        //find Numerals
        int firstNumeral = value % 10;
        int secondNumeral = (value /= 10) % 10;
        int thirdNumeral = (value /= 10) % 10;
        int forthNumral = (value /= 10) % 10;

        return (firstNumeral > secondNumeral) &&
                (secondNumeral > thirdNumeral) &&
                (thirdNumeral > forthNumral);
    }

    public static boolean checkDecreaseOrderInNumber(int value){
        //find Numerals
        int firstNumeral = value % 10;
        int secondNumeral = (value /= 10) % 10;
        int thirdNumeral = (value /= 10) % 10;
        int forthNumral = (value /= 10) % 10;

        return (firstNumeral < secondNumeral) &&
                (secondNumeral < thirdNumeral) &&
                (thirdNumeral < forthNumral);
    }
}
