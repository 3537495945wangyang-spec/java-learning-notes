package com.gdut.demo9_net_inetaddress;

import java.net.InetAddress;

public class InetAddressDemo {
    public static void main (String[] args) {
        //使用InetAddress类 获取本机对象和对方对象
        try {
            //获取本机ip
            InetAddress local = InetAddress.getLocalHost();
            System.out.println(local);
            System.out.println(local.getHostName());
            System.out.println(local.getHostAddress());

            //获取对方ip
            InetAddress remote = InetAddress.getByName("www.baidu.com");
            System.out.println(remote.getHostName());
            System.out.println(remote.getHostAddress());

            InetAddress gdut = InetAddress.getByName("www.gdut.edu.cn");
            System.out.println(gdut.getHostName());
            System.out.println(gdut.getHostAddress());

            //判断本机是否与其他主机互通‘
            System.out.println(gdut.isReachable(5000));
            System.out.println(remote.isReachable(5000));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

