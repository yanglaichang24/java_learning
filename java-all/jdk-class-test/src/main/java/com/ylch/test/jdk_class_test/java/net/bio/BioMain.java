package com.ylch.test.jdk_class_test.java.net.bio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by yanglaichang1 on 2017/6/23.
 */
public class BioMain {

    public static void main(String[] args) throws IOException, InterruptedException {
        new Thread(new Runnable() {
            public void run() {
                int port = 5330;
                ServerSocket server = null;
                try {
                    server = new ServerSocket();
                    server.bind(new InetSocketAddress("localhost",5330));
                    System.out.println("服务端初始化");
                    Socket accept = server.accept();
                    System.out.println("服务端接收请求");
                    new Server().new ServiceHander(accept).start();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        Thread.sleep(5000L);
        System.out.println("客户端开始初始化");
        new Client().start();
    }

}
