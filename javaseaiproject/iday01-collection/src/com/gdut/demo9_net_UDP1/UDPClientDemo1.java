package com.gdut.demo9_net_UDP1;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class UDPClientDemo1 {
    public static void main(String[] args) throws Exception {
        System.out.println("UDP客户端启动");
        //1.创建发送端对象
        DatagramSocket socket = new DatagramSocket();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("请输入要发送的数据：");
            String data = scanner.nextLine();
            if(data.equals("exit")){
                socket.close();
                break;
            }
            //2.创建数据包对象，封装必要数据2re
            byte[] bytes = data.getBytes();
            DatagramPacket packet = new DatagramPacket(bytes, bytes.length,
                    InetAddress.getLocalHost(),8080);


            //3.让发送端对象发送数据
            socket.send(packet);
        }
    }
}
