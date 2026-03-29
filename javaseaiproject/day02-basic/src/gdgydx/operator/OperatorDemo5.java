package gdgydx.operator;

public class OperatorDemo5
{
    public static void main(String[] args)
    {
        //目标：认识逻辑运算符
        System.out.println (ismatch(165,45,'女'));
        System.out.println(ismatch2(165,2000000000));
        ismatch3(true);
        ismatch4();
        print();
    }
    public static boolean ismatch(int height,int weight,char sex)
    {
        boolean result = height > 160 && weight >40 && weight< 60 &&  sex == '女';
        return result;
    }
    public static boolean ismatch2(int height,int income)
    {
        boolean result2 = height >=180 || income >=1000000;
        return result2;
    }
    public static void ismatch3(boolean flag)
    {
        System.out.println(!flag);
    }
    public static void ismatch4()
    {
        System.out.println("^^^");
        System.out.println(true^true);//^ 异或
        System.out.println(true^false);
        System.out.println(false^false);



    }
    public static void print()
    {
        int a = 100;
        int b = 23;

        System.out.println( a >= 100 || ++b>1 );
        System.out.println(b);
    }
}
