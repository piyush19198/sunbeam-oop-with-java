import java.util.Scanner;

public class TestColVol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Box Dimentions : w d h c");
        ColVol b1 = new ColVol(sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.next());

        System.out.println("Enter Second Box Dimentions : w d h c");
        ColVol b2 = new ColVol(sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.next());

        b1.getBoxVolume();
        b2.getBoxVolume();

        System.out.println(b1.getColor(b1, b2));
        sc.close();
    }
}
