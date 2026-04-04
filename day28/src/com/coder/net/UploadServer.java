package com.coder.net;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author N1357
 * @date 2026/4/3
 * @project core_java
 */
public class UploadServer {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(8888);
        Socket client = server.accept();//等客户端来连接'
        System.out.println("连接成功");
        InputStream inputStream = client.getInputStream();
        BufferedInputStream bis = new BufferedInputStream(inputStream);
        FileOutputStream fos = new FileOutputStream("d/aa/z.mps");
        BufferedOutputStream bos  = new BufferedOutputStream(fos);
        byte[] b= new byte[1024];
        int x =0;
        while((x= bis.read(b))!=-1){
            bos.write(b,0,x);
        }
        bis.close();
        bos.close();
        System.out.println("接收成功");
        client.close();
        server.close();





    }
}
