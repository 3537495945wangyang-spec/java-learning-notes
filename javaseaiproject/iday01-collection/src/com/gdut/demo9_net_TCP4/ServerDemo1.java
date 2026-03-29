package com.gdut.demo9_net_TCP4;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.*;

public class ServerDemo1 {
    public static void main(String[] args) throws Exception {

        System.out.println("服务端启动了");
        //1.创建ServerSocket对象，注册端口
        ServerSocket ss = new ServerSocket(8080);


        ExecutorService pool = new ThreadPoolExecutor(3,5,10, TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(100), Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.DiscardOldestPolicy());

        while (true) {
            //2.调用accept方法，阻塞、等待客户端连接
            Socket socket = ss.accept();

            pool.execute(new ServerReader(socket));

        }

    }
}
