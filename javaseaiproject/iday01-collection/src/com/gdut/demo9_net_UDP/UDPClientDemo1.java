package com.gdut.demo9_net_UDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPClientDemo1 {
    public static void main(String[] args) throws Exception {
        System.out.println("UDP客户端启动");
        //1.创建发送端对象
        DatagramSocket socket = new DatagramSocket();

        //2.创建数据包对象，封装必要数据
        byte[] bytes = "残疾人没救了".getBytes();

        /**
         * 参数一：发送的数据
         * 参数二：数据长度
         * 参数三：目的地的IP地址
         * 参数四：服务端程序的端口号
         */
        DatagramPacket packet = new DatagramPacket(bytes, bytes.length,
                InetAddress.getLocalHost(),8080);


        //3.让发送端对象发送数据
        socket.send(packet);
    }
}
