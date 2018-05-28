package mainPackage;

public class FindSquare {
    public static double findRingSquare(double smallRadius, double bigRadius){
        return  findCircleSquare(bigRadius) - findCircleSquare(smallRadius);
    }

    public static double findCircleSquare(double radius){
        return Math.PI * radius * radius;
    }
}
