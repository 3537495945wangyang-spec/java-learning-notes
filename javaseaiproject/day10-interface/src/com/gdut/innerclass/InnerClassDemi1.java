package com.gdut.innerclass;

public class InnerClassDemi1 {

    public static void main(String[] args) {
        //搞清楚成员内部类的语法
        //成为内部类创建对象的格式
        //外部类名.内部类名 对象 = new 外部类名().new 内部类名();
        Outer.Inner oi = new Outer().new Inner();
        oi.show();

        //成员内部类访问外部类成员的特点
        //1.成员内部类可以直接访问外部类的静态成员，静态方法，
        // 也可以直接访问外部类的实例成员
        //2.可以直接拿到寄生的外部类对象
        People.Heart heart = new People().new Heart();
        heart.show();

        //静态内部类
        //创建格式：无需创建外部类的实例
        // 外部类名.静态内部类名 静态内部类对象 = new 外部类名.静态内部类名();
        Outer.StaticInner si = new Outer.StaticInner();
        si.show();
        //1.静态内部类不能直接访问外部类的实例成员，只能访问外部类的静态成员
    }
}
class People{
    private int HeartBeat = 100;
    public class Heart{
        private int HeartBeat = 80;
        public void show(){
            int HeartBeat = 90;
            System.out.println(HeartBeat);//90
            System.out.println(this.HeartBeat);//80
            System.out.println(People.this.HeartBeat);//100
        }
    }
}
