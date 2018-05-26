package mainPackage;

public class CheckOrder {
    public static boolean checkOrderInNumber(int value){
        int firstNumeral = value % 10;
        value /= 10;
        int secondNumeral = value % 10;
        value /= 10;
        int thirdNumeral = value % 10;
        value /= 10;
        int forthNumral = value;
        boolean orderOrNot = ((firstNumeral > secondNumeral) &&
                                (secondNumeral > thirdNumeral) &&
                                (thirdNumeral > forthNumral)) ||
                            ((firstNumeral < secondNumeral) &&
                                (secondNumeral < thirdNumeral) &&
                                (thirdNumeral < forthNumral));
        return orderOrNot;
    }
}
