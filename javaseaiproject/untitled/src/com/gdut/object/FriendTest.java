package com.gdut.object;

public class FriendTest {
    //创建对象
    public static void main(String[] args) {
        Friend f1 = new Friend();
        f1.name = "张铭";
        f1.university = "snut";
        f1.age = 19;
        f1.height = 1.64;
        f1.weight = 55.0;
        f1.print();

        Friend f2 = new Friend();
        f2.name = "兰浪";
        f2.university = "喀什大学";
        f2.age = 19;
        f2.height = 1.58;
        f2.weight = 65.0;
        f2.print();
    }
}
