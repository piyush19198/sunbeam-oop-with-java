public class TestConversions {
    public static void main(String[] args) {
        byte b1 = 10;
        byte b2 = 20;
        byte b3 = (byte) (b1 + b2);
        b1 += b2;// b1 =(byte) (b1+b2);
        short s1 = 1234;
        // short s2=b1+s1;//javac err
        long l1 = 12345678;// int ---> long
        float f1 = l1;// long ---> float
        long l2 = (long) f1;// no javac err : after explicit narrowing conversion
        char ch = 'A';
        ch = 65;
        // boolean flag = 1;// incompatible types !!!!
        double d1 = f1;// float ---> double
        d1 = 1234.56F;// float ---> double
        // float f2 = 2456.67;// double ---X--->float

    }
}
