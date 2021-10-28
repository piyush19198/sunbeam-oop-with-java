import java.util.Scanner;

public class TestModBox {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Box Dimentions : w d h");
        ModBox b1;
        b1 = new ModBox(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        System.out.println("Enter Required Updates : w d h");
        System.out.println(b1.getNewBox(sc.nextDouble(), sc.nextDouble(), sc.nextDouble()));

        sc.close();
    }
}
