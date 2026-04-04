package com.coder.net;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.nio.charset.StandardCharsets;

/**
 * @author N1357
 * @date 2026/4/3
 * @project core_java
 */
public class UDPSocket2 {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket(3333);
        byte[] b = new byte[1024];
        DatagramPacket packet = new DatagramPacket(b,b.length);
        socket.receive(packet);
        String s = new String(b, 0, packet.getLength(), StandardCharsets.UTF_8);
        System.out.println(s);


    }
}
