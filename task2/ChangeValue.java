package mainPackage;

public class ChangeValue {
    public static String changeeTwoValues(int value1, int value2){
        value1 = value1 + value2;
        value2 = value1 - value2;
        value1 = value1 - value2;
        return "value 1 - " + value1 + ", value2 - " + value2;
    }
}
