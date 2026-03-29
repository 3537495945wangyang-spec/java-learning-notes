package gdgydx.method;

public class methoddemo3 {
    public static void main(String[] args) {
        divide(10,2);
    }
    //设计一个除法功能
    public static void divide(int a,int b){
        if(b==0){
            System.out.println("除数不能为0");
            return;//提前结束方法
        }
        System.out.println(a/b);
    }
}
