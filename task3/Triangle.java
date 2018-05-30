/**
 * Triangle
 * <p>
 * Used to work with
 * triangles
 *
 * @author sheremet-vlad
 * @version 1.0
 */

package mainPackage;

public class Triangle {

    /* define is exist triangle or not*/
    public static boolean isExistTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        double ab = findSide(x1, y1, x2, y2);
        double bc = findSide(x2, y2, x3, y3);
        double ac = findSide(x3, y3, x1, y1);

        return  ab + bc > ac &&
                ab + ac > bc &&
                ac + bc > ab;
    }

    /* finds side by points */
    public static double findSide(int x1, int y1, int x2, int y2) {
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }

    /* define is triangle right or not*/
    public static boolean isRightTiangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        double ab = findSide(x1, y1, x2, y2);
        double bc = findSide(x2, y2, x3, y3);
        double ac = findSide(x3, y3, x1, y1);

        return checkPythagorTheorem(ab,bc,ac) ||
                checkPythagorTheorem(ac,bc,ab) ||
                checkPythagorTheorem(bc,ac,ab);
    }

    /* define performed or not Pythagor theorem*/
    public static boolean  checkPythagorTheorem(double c, double a, double b){
        return a * a + b * b == c * c;
    }

}
