package mainPackage;

public class Main {
    public static void main(String[] args) {
        //task 1
        int a = 4;
        int b = 4;
        int c = 5;
        boolean compare = CompareValue.compareThreeValue(a,b,c);
        System.out.println("task1");
        System.out.println(compare ? "equals" : "not equals");

        //task2 - conversion wight of dinosaur
        int weight = 200;
        double weightInTon =
                ConversionValue.conversionKgToTon(weight);
        int weightInGram =
                ConversionValue.conversionToGram(weight);
        long weightInMilliGram =
                ConversionValue.conversionToMilligram(weight);
        System.out.println("\ntask2");
        System.out.printf("weight: in ton - %.2f, in gram - %d, in milligram - %d\n",
                          weightInTon,weightInGram,weightInMilliGram);

        //task3
        double bigRadius = 2.5;
        double smallRadius = 1.2;
        double ringSquare =
                findSquare.findRingSquare(smallRadius,bigRadius);
        System.out.println("\ntask3");
        System.out.printf("ring square - %.3f\n",ringSquare);

        //task4
        int valueToOrder = 1564;
        boolean orderInNumeral =
                CheckOrder.checkOrderInNumber(valueToOrder);
        System.out.println("\ntask4");
        System.out.println(orderInNumeral ? "contains" : "not contains");

        //task5
        int valueToAverage = 651322;
        double arithmeticAverage =
                findAverageInNumber.findArithmeticAverage(valueToAverage);
        double geometryAverage =
                findAverageInNumber.findGeomeetryAverage(valueToAverage);
        System.out.println("\ntask5");
        System.out.printf("arithmetic - %.3f, geometry - %.3f\n",
                            arithmeticAverage,geometryAverage);

        //task6
        int valueToReverse = 1523267;
        int reverseValue = Reverse.reverseNumeral(valueToReverse);
        System.out.println("\ntask 6");
        System.out.printf("reverse - %d\n", reverseValue);

        //task7
        int value1 = 3;
        int value2 = 5;
        System.out.println("task7");
        ChangeValue.changeeTwoValues(value1,value2);
    }
}
