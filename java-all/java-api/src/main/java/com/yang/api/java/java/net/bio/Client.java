package com.yang.api.java.java.net.bio;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * Created by yanglaichang1 on 2017/6/23.
 */
public class Client extends Thread {

    public static void main(String[] args) {
        new Client().start();
    }


    @Override
    public void run() {
        Socket socket = null;
        try {
            socket = new Socket("localhost", 5330);
            OutputStream outputStream = socket.getOutputStream();
            InputStream InputStream = socket.getInputStream();
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);
            bufferedOutputStream.write("ping".getBytes());
            bufferedOutputStream.flush();
            System.out.println("客户端发出请求。。。");
            byte[] bt =  new byte[1024];
            InputStream.read(bt);
            System.out.println("客户端接收返回参数。。。" + new String(bt));

           /* outputStream.close();*/
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
