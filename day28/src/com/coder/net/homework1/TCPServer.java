package com.coder.net.homework1;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author N1357
 * @date 2026/4/3
 * @project core_java
 */
public class TCPServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);//监听9999端口
        Socket socket = serverSocket.accept();//等待客户端连接。
        BufferedReader br= new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter pw = new PrintWriter(socket.getOutputStream(),true);
        Scanner sc = new Scanner(System.in);

        String fileName = br.readLine();
        System.out.println("客户端的上传文件");

        System.out.println("是否接收该文件？（y/n):");
        String s = sc.next();
        if("n".equalsIgnoreCase(s)){
            pw.println("拒绝接收");
            socket.close();
            serverSocket.close();
            System.out.println("已经拒绝，流程结束");
        }

        String saveDir;
        File dir;
        while(true){
            System.out.println("请输入文件保存目录：");
            saveDir = sc.next();
            dir = new File(saveDir);
            if(dir.exists()){
                System.out.println("目录存在，可以使用");
                break;
            }
            boolean mk = dir.mkdirs();
            if(mk){
                System.out.println("目录创建成功");
                break;
            }else {
                System.out.println("目录创建失败，请重新输入");
            }
        }
            pw.println("同意接收，可以上传");

        File targetFile = new File(dir,fileName);
        InputStream is = socket.getInputStream();
        FileOutputStream fos = new FileOutputStream(targetFile);
        byte[] buf = new byte[1024] ;
        int len;
        while((len = is.read())!=-1){
            fos.write(buf,0,len);

        }
        fos.close();
        sc.close();
        socket.close();
        serverSocket.close();


        System.out.println("上传文件失败");


    }
}
