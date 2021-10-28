import java.util.Scanner;

public class TestEqBox {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Box Dimentions : w d h");
        EqBox b1;
        b1 = new EqBox(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());

        System.out.println("Enter Second Box Dimentions : w d h");
        EqBox b2;
        b2 = new EqBox(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());

        if (b1.isEqual(b2)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }

        sc.close();
    }
}
