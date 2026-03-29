package gdgydx.method;

public class methoddemo1 {
    public static void main(String[] args) {
        int sum = getSum(10,20);
        System.out.println("和是" + sum);

        System.out.println("--------------------");

        int sum1 = getSum(100,200);
        System.out.println("和是" + sum1);
        System.out.println("--------------------");

        printHelloWorld();

        System.out.println("--------------------");
        System.out.println(getVerifyCode(5));


    }
    //定义一个方法求两个数的和并且返回
    public static int getSum(int a,int b){
        int sum = a + b;
        return sum;

    }
    //打印三行Hello World
    public static void printHelloWorld() {
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
    }
    //获取一个指定位数的验证码返回
    public static String getVerifyCode(int n) {
        String code = "";
        for (int i = 0; i < n; i++) {
            int number = (int) (Math.random() * 10);
            code += number;

        }
        return code;

    }
}
