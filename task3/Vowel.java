package mainPackage;

public class Vowel {
    private static final char A = 'a';
    private static final char E = 'e';
    private static final char U = 'u';
    private static final char O = 'o';
    private static final char I = 'i';
    private static final char Y = 'y';
    private static final char BIG_A = 'A';
    private static final char BIG_E = 'E';
    private static final char BIG_U = 'U';
    private static final char BIG_O = 'O';
    private static final char BIG_I = 'I';
    private static final char BIG_Y = 'Y';
    private static final int ERR = -1;
    
    public static boolean isVowelByChar(char value){
        if (value == A || value == E || value == U || value == Y || value == O ||
                value == I || value == BIG_A || value == BIG_E || value == BIG_U ||
                value == BIG_O || value == BIG_I || value == BIG_Y) {
            return true;
        }
        return false;
    }

    public static boolean isVowelByChar2(char value){
        switch (value){
            case A:
            case E:
            case Y:
            case U:
            case I:
            case O:
            case BIG_A:
            case BIG_E:
            case BIG_I:
            case BIG_Y:
            case BIG_O:
            case BIG_U: return true;
            default: return false;
        }
    }

    public static boolean isVowelByCode(int value){
        if (value == A || value == E || value == U || value == Y || value == O ||
                value == I || value == BIG_A || value == BIG_E || value == BIG_U ||
                value == BIG_O || value == BIG_I || value == BIG_Y) {
            return true;
        }
        return false;
    }

    public static boolean isVowelByCode2(int value){
        switch (value){
            case A:
            case E:
            case Y:
            case U:
            case I:
            case O:
            case BIG_A:
            case BIG_E:
            case BIG_I:
            case BIG_Y:
            case BIG_O:
            case BIG_U: return true;
            default: return false;
        }
    }

    public static boolean isVowelByString(char value){
        String stringOfVowels = "aAuUiIeEoOyY";
        if (stringOfVowels.contains(value+"")){
            return true;
        }
        return false;
    }

    public static boolean isVowelByString2(char value){
        String stringOfVowels = "aAuUiIeEoOyY";
        if (stringOfVowels.indexOf(value) != ERR){
            return true;
        }
        return false;
    }


}
