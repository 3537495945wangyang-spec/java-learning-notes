package gdgydx.operator;

public class OperatorDemo4
{
    public static void main(String[] args)
    {
        //目标：认识三元运算符
        print(55);
        System.out.println("最大值为:"+getmax(123,456,876));
    }

    public static void print(int score)
    {
        String result = "";
        result = score >=60 ?"及格":"不及格";
        System.out.println(result);
    }
    public static int  getmax(int a,int b,int c)
    {
        int max = a > b ? a : b;
        max = max > c ?max : c;
        return max ;
    }
}
