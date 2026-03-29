package gdgydx.operator;

public class OperatorDemo2
{
    public static void main(String[] args)
    {
        print(10);
        print2(12);
        receive(5.5);
        print3(10);
    }
    //设计一个方法接收一个整数。
    public static void print(int a)
    {
        a++;
        ++a;
        System.out.println(a);


    }
    public static void print2(int b)
    {
        int c = ++b;
        int d = c--;
        System.out.println(c);
        System.out.println(d);

    }

    public static void receive(double b)
    {
        double money = 108.5;
        money += money+b;
        System.out.println(money);
    }
    public static void print3(int s)
    {
        s -= 5;
        System.out.println(s);
        s *= 34;
        System.out.println(s);

    }
}

