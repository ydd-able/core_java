package com.coder.net.homework;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

/**
 * @author N1357
 * @date 2026/4/3
 * @project core_java
 */
public class GuessServer {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(8888);
        Socket accept = server.accept();
        int i = new Random().nextInt(100)+1;
        boolean b= true;
        InputStreamReader isr = new InputStreamReader(accept.getInputStream());
        BufferedReader br = new BufferedReader(isr);
        PrintWriter pw = new PrintWriter(accept.getOutputStream());//把难用的字节流变成能直接写文字的流。
        while(b){
            String str = br.readLine();//读取客户端发送的舒徐。
            int j = Integer.parseInt(str);
            if(i==j){
                pw.print("猜对了");
                pw.flush();
                break;
            }else if(i>j){
                pw.println("猜小了");
            }else{
                pw.println("猜大了");
            }
            pw.flush();
        }
        br.close();
        pw.close();

    }
}
