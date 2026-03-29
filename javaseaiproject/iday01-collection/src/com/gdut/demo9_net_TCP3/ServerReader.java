package com.gdut.demo9_net_TCP3;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.Socket;

public class ServerReader extends Thread{
    private Socket socket;
    public ServerReader(Socket socket){
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            //3.获取输入流，读取数据
            InputStream is = socket.getInputStream();

            //4.把字节输入流转换为特殊数据输入流
            DataInputStream dis = new DataInputStream(is);

            while (true) {
                //5.读取数据
                String name = dis.readUTF();
                System.out.println(  " name:" + name);

                //6.客户端的信息以及端口
                System.out.println("客户端的ip:" + socket.getInetAddress().getHostAddress());
                System.out.println("客户端的端口:" + socket.getPort());
            }
        } catch (Exception e) {
            System.out.println("服务器客户下线"+socket.getInetAddress().getHostAddress());

        }
    }

}
