import java.util.Scanner;

class TestBox {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter box dims : w d h");
        Box b1;
        b1 = new Box(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        System.out.println(b1.getBoxDimensions());
        System.out.println("Volume " + b1.getBoxVolume());
        sc.close();
    }
}
