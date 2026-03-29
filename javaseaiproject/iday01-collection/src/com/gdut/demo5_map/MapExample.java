package com.gdut.demo5_map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        //1.创建Map对象
        Map<Integer,String> map = new HashMap<>();

        //2.添加元素,放入键值对（put）
        map.put(1,"张三");
        map.put(2,"李四");
        map.put(3,"王五");

        //根据键取值
        String name = map.get(2);
        System.out.println(name);

        //遍历的常用方法，遍历键集合
        for(int n:map.keySet()){
            System.out.println(n);
        }
        /*
         * 遍历Map的视图方法:
         * | 方法         | 返回内容     | 使用场景                     | 返回类型   |
         * |--------------|-------------|----------------------------|--------|
         * | keySet()     | 所有【键】   | 仅需键，或需二次get值        | Set<K>|
         * | values()     | 所有【值】   | 仅需值，不关心键             | Collection<V> |
         * | entrySet()   | 所有【键值对】| 同时需键和值 (推荐首选)       |Set<Map.Entry<K,V>>
        
         */

        for(String str : map.values()){
            System.out.println(str);
        }

        //遍历键值对集合,既能遍历键也能遍历值，最优遍历方法！
        for( Map.Entry<Integer,String> entry :map.entrySet()/*用于获取所有键值对的集合*/){
            System.out.println(entry.getKey() + entry.getValue());
        }

        //使用迭代器遍历
        Iterator<Map.Entry<Integer,String>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<Integer,String> entry = iterator.next();//直接返回一个该类型变量
            System.out.println(entry.getKey() + entry.getValue());

        }

    }
}
