package mainPackage;

public class Vowel {
    public static final char A = 'a';
    public static final char E = 'e';
    public static final char U = 'u';
    public static final char O = 'o';
    public static final char I = 'i';
    public static final char Y = 'y';
    public static final char BIG_A = 'A';
    public static final char BIG_E = 'E';
    public static final char BIG_U = 'U';
    public static final char BIG_O = 'O';
    public static final char BIG_I = 'I';
    public static final char BIG_Y = 'Y';
    
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

}
