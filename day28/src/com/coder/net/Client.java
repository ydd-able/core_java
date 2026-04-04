package com.coder.net;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author N1357
 * @date 2026/4/2
 * @project core_java
 */
public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost",1234);
        System.out.println("连接服务器");
        OutputStream os = socket.getOutputStream();
        PrintWriter pw = new PrintWriter(os);
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入聊天内容：");
        while(true){
            String str = scanner.nextLine();
            pw.println(str);//有缓存。
            pw.flush();
            if("bye".equals(str))
                break;
        }
        pw.close();
        socket.close();


    }
}
