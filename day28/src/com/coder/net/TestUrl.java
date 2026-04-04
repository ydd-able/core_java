package com.coder.net;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * @author N1357
 * @date 2026/4/3
 * @project core_java
 */
public class TestUrl {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://img-s.msn.cn/tenant/amp/entityid/AA205uYV.img?w=768&h=369&m=6&x=38&y=44&s=944&d=117");
       /* String protocol = url.getProtocol();//获得协议
        String host = url.getHost();//获得主机
        int port = url.getPort();//获得端口号
        String file = url.getFile();
        System.out.println("protocol = " + protocol);
        System.out.println("host = " + host);
        System.out.println("port = " + port);
        System.out.println("file = " + file);*/
        URLConnection urlConnection = url.openConnection();
        InputStream is = urlConnection.getInputStream();
        FileOutputStream fos = new FileOutputStream("d:/aa/qq.jpg");
        byte[] b = new byte[1024];
        int x;
        while((x = is.read())!=-1){
            fos.write(b,0,x);
        }
        is.close();
        fos.close();


    }


}
