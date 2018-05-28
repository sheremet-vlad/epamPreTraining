package mainPackage;

public class Main {
    public static void main(String[] args) {
        //task 1
        int a = 4;
        int b = 4;
        int c = 5;
        System.out.println("task1");
        System.out.println(CompareValue.compareThreeValue(a,b,c) ?
                            "equals" : "not equals");

        //task2 - conversion wight of dinosaur
        int weight = 200;
        System.out.println("\ntask2");
        System.out.printf("weight: in ton - %.2f, in gram - %.0f, in milligram - %.0f\n",
                            ConversionValue.conversionKgToTon(weight),
                            ConversionValue.conversionToGram(weight),
                            ConversionValue.conversionToMilligram(weight));

        //task3
        double bigRadius = 2.5;
        double smallRadius = 1.2;
        System.out.println("\ntask3");
        System.out.printf("ring square - %.3f\n",
                            FindSquare.findRingSquare(smallRadius,bigRadius));

        //task4
        int valueToOrder = 1564;
        System.out.println("\ntask4");
        System.out.println(CheckOrder.checkDecreaseOrderInNumber(valueToOrder) ?
                            "contains decrease" : "not contains decrease");
        System.out.println(CheckOrder.checkIncreasOrderInNumber(valueToOrder) ?
                            "contains increase" : "not contains increase");

        //task5
        int valueToAverage = 651322;
        System.out.println("\ntask5");
        System.out.printf("arithmetic - %.3f, geometry - %.3f\n",
                            FindAverageInNumber.findArithmeticAverage(valueToAverage),
                            FindAverageInNumber.findGeomeetryAverage(valueToAverage));

        //task6
        int valueToReverse = 1523267;
        System.out.println("\ntask 6");
        System.out.printf("reverse - %d\n", Reverse.reverseNumeral(valueToReverse));

        //task7
        int value1 = 3;
        int value2 = 5;
        System.out.println("\ntask7");
        System.out.println(ChangeValue.changeeTwoValues(value1,value2));
    }
}
