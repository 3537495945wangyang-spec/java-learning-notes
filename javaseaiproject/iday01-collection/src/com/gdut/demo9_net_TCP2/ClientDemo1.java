package com.gdut.demo9_net_TCP2;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientDemo1 {
    public static void main(String[] args) throws Exception {

        System.out.println("客户端启动了");
        //1.创建socket对象，请求与服务器连接
        Socket socket = new Socket("127.0.0.1",3434);

        //2.从socket对象中获取输出流，读取数据
        OutputStream os = socket.getOutputStream();

        //3.特殊数据流
        DataOutputStream dos = new DataOutputStream(os);

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("请输入要发送的数据：");
            String data = sc.nextLine();

            if(data.equals("exit")){
                System.out.println("退出成功！");
                socket.close();
                break;
            }
            dos.writeUTF(data);
            dos.flush();//刷新
        }

    }
}
