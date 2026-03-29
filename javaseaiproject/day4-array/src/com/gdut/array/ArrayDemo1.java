package com.gdut.array;

public class ArrayDemo1
{
      public static void main(String[] args)
    {
        System.out.println("欢迎来到串月的随机生成人物程序\n" +
                "接下来将为ZM同学随机生成周日到周五晚修和同桌的聊天对象");
        for (int i = 0; i < 6; i++)
        {
            name();
        }
    }

    public static void name()
    {

        String[] names = {"yellow ice","qq","NaCl","bigking","NvTong" ,"bigeye"};
                  //索引      0          1     2      3        4        5
        //String names[] = {"yellowice","qq","NaCl","bigking","Mary"};
       //String names[] = new String[]{"yellowice","qq","NaCl","bigking","Mary"};


        //随机获取一个索引值
        //names.length表示索引值的个数
        int index = (int)(Math.random() * names.length);




        //根据索引值获得元素
        String name = names[index];
        System.out.println(name);
    }
}
