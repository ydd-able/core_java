package com.coder.net;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author N1357
 * @date 2026/4/3
 * @project core_java
 */
public class UploadClient{
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1",8888);
        FileInputStream fis = new FileInputStream("d:/aa/x.mp3");
        BufferedInputStream bis = new BufferedInputStream(fis);//包装一下。
        OutputStream oos = socket.getOutputStream();
        BufferedOutputStream bos = new BufferedOutputStream(oos);
        byte[] b= new byte[1024];
        int x =0;
        while((x= bis.read(b))!=-1){
            bos.write(b,0,x);

        }
        bis.close();
        bos.close();
        System.out.println("上传成功");
        socket.close();




    }
}
