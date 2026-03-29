package com.gdut.demo9_net_TCP4;

import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;

public class ServerReader extends Thread{
    private Socket socket;
    public ServerReader(Socket socket){
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            OutputStream os = socket.getOutputStream();
            //包装为打印流
            PrintStream ps = new PrintStream(os);
            //写网页数据
            ps.println("HTTP/1.1 200 OK");
            ps.println("Content-Type:text/html;charset=utf-8");
            ps.println();//必须换一行
            ps.println("<html>");
            ps.println("<head><title>服务器</title></head>");
            ps.println("<body>");
            ps.println("<h1 style='color:red;font-size=20px'>欢迎来到服务器</h1>");
            ps.println("</body>");
            ps.println("</html>");
            System.out.println("服务器客户下线"+socket.getInetAddress().getHostAddress());
            ps.close();

        }catch (Exception e){
            System.out.println("服务器客户下线"+socket.getInetAddress().getHostAddress());
        }
    }

}
