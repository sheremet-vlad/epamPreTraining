package mainPackage;

public class ConversionValue {
    public static double conversionKgToTon(int weight){
        return weight/1000.0;
    }

    public static int conversionToGram(int weight){
        return weight*1_000_000;
    }

    public static long conversionToMilligram(int weight){
        return weight * 1_000_000_000L;
    }
}
