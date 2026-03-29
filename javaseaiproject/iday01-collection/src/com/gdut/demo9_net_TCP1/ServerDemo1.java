package com.gdut.demo9_net_TCP1;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo1 {
    public static void main(String[] args) throws Exception {

        System.out.println("服务端启动了");
        //1.创建ServerSocket对象，注册端口
        ServerSocket ss = new ServerSocket(3434);

        //2.调用accept方法，阻塞、等待客户端连接
        Socket socket = ss.accept();

        //3.获取输入流，读取数据
        InputStream is = socket.getInputStream();

        //4.把字节输入流转换为特殊数据输入流
        DataInputStream dis = new DataInputStream(is);

        //5.读取数据
        int id = dis.readInt();
        String name = dis.readUTF();
        System.out.println("id:" + id + " name:" + name);

        //6.客户端的信息以及端口
        System.out.println("客户端的ip:" + socket.getInetAddress().getHostAddress());
        System.out.println("客户端的端口:" + socket.getPort());
    }
}
