package mainPackage;

public class findSquare {
    public static double findRingSquare(double smallRadius, double bigRadius){
        double squareOfBigCircle = Math.PI * Math.pow(bigRadius,2);
        double squareIfSmallCircle = Math.PI * Math.pow(smallRadius,2);
        return  squareOfBigCircle - squareIfSmallCircle;
    }
}
