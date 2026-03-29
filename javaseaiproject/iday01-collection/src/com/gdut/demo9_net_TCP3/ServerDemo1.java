package com.gdut.demo9_net_TCP3;

import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo1 {
    public static void main(String[] args) throws Exception {

        System.out.println("服务端启动了");
        //1.创建ServerSocket对象，注册端口
        ServerSocket ss = new ServerSocket(3434);

        while (true) {
            //2.调用accept方法，阻塞、等待客户端连接
            Socket socket = ss.accept();

            new ServerReader(socket).start();

        }

    }
}
