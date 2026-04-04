package com.coder.net;

import java.io.IOException;
import java.net.*;
import java.nio.charset.StandardCharsets;

/**
 * @author N1357
 * @date 2026/4/3
 * @project core_java
 */
public class UDPSocket1 {
    public static void main(String[] args) throws IOException {
        //创建一个socket
        DatagramSocket socket = new DatagramSocket(2222);
        String msg = "有内鬼，终止交易";
        //将字符串转成byte数组
        byte[] bytes = msg.getBytes(StandardCharsets.UTF_8);
        //创建一个数据包。
        DatagramPacket packet  = new DatagramPacket(bytes,0,bytes.length,InetAddress.getByName("localhost"),3333);
        //调用send发送
        socket.send(packet);


    }
}
