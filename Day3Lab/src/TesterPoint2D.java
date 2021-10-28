import java.util.Scanner;

public class TesterPoint2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter X and Y for point 1");
        Point2D p1 = new Point2D(sc.nextInt(), sc.nextInt());

        System.out.println("Enter X and Y for point 2");
        Point2D p2 = new Point2D(sc.nextInt(), sc.nextInt());

        System.out.println("Point 1: " + p1.getDetails());sys
        System.out.println("Point 2: " + p2.getDetails());

        if (p1.isEqual(p2)) {
            System.out.println("Points are equal");
        } else {
            System.out.println("Points are not equal");
        }

        System.out.println("Distance between both points is " + p1.calcDistance(p2));
        sc.close();
    }
}
