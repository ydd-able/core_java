package com.coder.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author N1357
 * @date 2026/4/2
 * @project core_java
 */
public class Server {
    public static void main(String[] args) throws IOException {
        //创建了一个ServerSocket
        ServerSocket server = new ServerSocket(1234);//开启服务端监听：绑定端口1234。
        System.out.println("等待连接。。。");
        Socket client = server.accept();
        InetAddress address = client.getInetAddress();
        System.out.println(address.getHostAddress());
        System.out.println(address.getHostName());
        System.out.println("已经有客户端连接");
        InputStream inputstream = client.getInputStream();//获取输出流
        InputStreamReader isr = new InputStreamReader(inputstream);//把字节流转为字符流。
        BufferedReader reader = new BufferedReader(isr);
        while(true){
            String str = reader.readLine();
            if(str.equals("bye")){
               break;
            }
            System.out.println("【客户端】"+str);
        }


        reader.close();
        client.close();
        server.close();



    }
}
