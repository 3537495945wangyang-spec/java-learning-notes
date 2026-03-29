package gdgydx.type;

public class typedemo2 {
    public static void main(String[] args) {
        //表达式的自动类型提升
        System.out.println(show(10, 20, 30, 'a'));
        System.out.println(show2((byte) 1, (byte) 2));
        System.out.println(show3((byte) 1, (byte) 2, (byte) 3));
        byte a = 1;
    }

    //接收各种类型的数据运算
    public static double show(int a,int b,double c, char r){
        return a+b+c+r;
    }

    public static int show2(byte a,byte b){
        return a+b;
        //return a+b+c;
    }
    public static byte show3(byte a,byte b,byte c){
        return (byte)(a+b+c);
    }
}
