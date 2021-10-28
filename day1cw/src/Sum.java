// add 2 cmd line arguments. add the same and display the result
public class Sum {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        System.out.println("Result : " + (num1 + num2));
    }
}