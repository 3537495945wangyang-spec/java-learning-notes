package com.gdut.demo9_net_UDP1;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPServerDemo1 {
    public static void main(String[] args) throws  Exception{
        System.out.println("服务端启动了");

        //1.创建接收端对象，注册端口
        DatagramSocket socket = new DatagramSocket(8080);

        //2.创建数据包对象，接受数据
        byte[] buf = new byte[1024 * 64];
        DatagramPacket packet = new DatagramPacket(buf,buf.length);

        while (true) {
            //3.接收数据，将数据封装到数据包
            socket.receive(packet);//阻塞等待接受数据

            //4.获取数据
            //获取当前收到的数据长度
            int length = packet.getLength();
            String data = new String(buf,0,length);
            System.out.println(data);
            //获取对方的ip和端口
            String hostAddress = packet.getAddress().getHostAddress();
            int port = packet.getPort();
            System.out.println("对方ip"+hostAddress+":"+port);
        }
    }
}
