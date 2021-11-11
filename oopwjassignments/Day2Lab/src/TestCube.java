import java.util.Scanner;

public class TestCube {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Side of cube : ");
        Cube c1;
        c1 = new Cube(sc.nextDouble());
        System.out.println(c1.getCube());
        sc.close();
    }
}
