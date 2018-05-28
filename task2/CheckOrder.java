package mainPackage;

public class CheckOrder {
    private static int firstNumeral,
                        secondNumeral,
                        thirdNumeral,
                        forthNumral;

    private static void findNumrals(int value){
        firstNumeral = value % 10;
        value /= 10;
        secondNumeral = value % 10;
        value /= 10;
        thirdNumeral = value % 10;
        value /= 10;
        forthNumral = value;
    }
    public static boolean checkOrderInNumber(int value){
        findNumrals(value);
        boolean orderOrNot = ((firstNumeral > secondNumeral) &&
                                (secondNumeral > thirdNumeral) &&
                                (thirdNumeral > forthNumral)) ||
                            ((firstNumeral < secondNumeral) &&
                                (secondNumeral < thirdNumeral) &&
                                (thirdNumeral < forthNumral));
        return orderOrNot;
    }
}
