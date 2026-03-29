package gdgydx.type;

public class typedemo1 {
    public static void main(String[] args) {
        //自动类型转换，强制类型转换。
        byte a = 10;
        test1(a);//自动类型转换
        test2(a);

        System .out.println("--------------------");
        int i=20;

        byte s = (byte) i;
        test3(s);

        System.out.println("--------------------");
        double k = 3.14;
        int m = (int) k;
        System.out.println(m);
    }
    public static void test1(int b){
        System.out.println(b);
    }

    public static void test2(double c) {
        System.out.println(c);

    }
    public static void test3(byte s) {
        System.out.println(s);
    }
}
