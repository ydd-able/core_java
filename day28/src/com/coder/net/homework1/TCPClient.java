package com.coder.net.homework1;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author N1357
 * @date 2026/4/3
 * @project core_java
 */
public class TCPClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost",9999);
        Scanner sc = new Scanner(System.in);
        File file;
        while(true){
            System.out.println("请输入文件名");
            String filePath = sc.next();
            file = new File(filePath);
            if(file.exists()&&file.isFile()){
                System.out.println("文件存在");
                break;
            }else{
                System.out.println("文件不存在");
            }
        }
        PrintWriter pw = new PrintWriter(socket.getOutputStream(),true);
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        pw.println(file.getName());


        String r = br.readLine();
        if(r.equals("拒绝接收")){
            System.out.println("服务端拒绝接收，上传终止");
            socket.close();
            sc.close();
        }
        if(r.equals("同意接收，可以上传")){
            FileInputStream fis = new FileInputStream(file);
            OutputStream os = socket.getOutputStream();
            byte[] buf = new byte[1024];
            int len;
            while((len = fis.read(buf))!=-1){
                os.write(buf,0,len);
            }
            fis.close();
        }
        socket.close();
        sc.close();
        System.out.println("上传文件成功");
    }
}
