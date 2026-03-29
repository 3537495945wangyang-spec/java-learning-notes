package gdgydx.scanner;
//导包，告诉我们的程序去JDK哪里找Scanner类

public class scannerdemo1
{
    public  static void main(String[] args)
    {
        printUserInfo();
    }
    //请帮我设计一个程序可以让用户输入他的用户名和密码，并打印出来
    public static void printUserInfo()
    {
       //创建对象得到一个Scanner表达器
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("请输入用户名：");
        String username = sc.next();//让程序在这一行暂停，等待用户输入字符串名称，再把变量交给username变量
        System.out.println("请输入密码：");
        String password = sc.next();//让程序在这一行暂停，等待用户输入字符串名称，再把变量交给password变量
        System.out.println("用户名："+username+" 密码："+password);
        sc.close();

    }
}

