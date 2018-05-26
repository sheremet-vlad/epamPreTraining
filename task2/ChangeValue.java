package mainPackage;

public class ChangeValue {
    public static void changeeTwoValues(int value1, int value2){
        value1 = value1 + value2;
        value2 = value1 - value2;
        value1 = value1 - value2;
        System.out.printf("value 1 - %d, value2 - %d",value1,value2);
    }
}
