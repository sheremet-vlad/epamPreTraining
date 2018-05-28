package mainPackage;

public class ConversionValue {
    private static final double TO_TON = 1000.0;
    private static final double TO_GRAM = 1_000_000.0;
    private static final double TO_MILLIGRAM = 1_000_000.0;


    public static double conversionKgToTon(int weight){
        return weight / TO_TON;
    }

    public static double conversionToGram(int weight){
        return weight * TO_GRAM;
    }

    public static double conversionToMilligram(int weight){
        return weight * TO_MILLIGRAM;
    }
}
