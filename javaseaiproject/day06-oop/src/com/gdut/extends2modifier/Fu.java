package com.gdut.extends2modifier;

public class Fu {
    //private:只能当前类中访问
    private void privateMethod(){
        System.out.println("privateMethod()");
    }

   //缺省：当前类、同一个包下其他类中
    void method(){
        System.out.println("method");
    }

    //protected:当前类、同一个包下其他类、不同包下子孙类中
    protected void protectedMethod(){
        System.out.println("protectedMethod()");
    }
    //public:任何类中都可以访问
    public void publicMethod(){
        System.out.println("publicMethod()");
    }

    public static void main(String[] args) {
        Fu fu = new Fu();
        fu.privateMethod();
        fu.method();
        fu.protectedMethod();
        fu.publicMethod();
    }
}

