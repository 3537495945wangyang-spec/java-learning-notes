package gdgydx.method;

public class methoddemo2 {
    public static void main(String[] args) {
        //掌握方法重载
        print("2");
    }
    //定义一个方法，打印一个整数
    public static void print(int a){
        System.out.println(a);
    }
    //定义一个重载方法
    public static void print(String a){
        System.out.println(a);
    }
    //定义一个重载方法
    public static void print(double a){
        System.out.println(a);


    }
    public static double print(){
        return 0;
    }
    //需求：发射导弹
    public static void fire(int a){
        System.out.println("发射"+a+"枚导弹");
    }
    public static void fire(String a){
        System.out.println("发射"+a+"枚导弹");
    }
    public static void fire(double a){
        System.out.println("发射"+a+"枚导弹");
    }
}
