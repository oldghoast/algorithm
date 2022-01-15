package com.java.socket;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @ClassName SocketTest
 * @Description TODO
 * @Author oldghoast
 * @date 2021/12/21 16:27
 * @Version 1.0
 */
public class SocketTest {

    public static void main(String[] args){
        try {
            Socket socket = new Socket("www.baidu.com", 80);
            OutputStream out = socket.getOutputStream();
            StringBuffer sb = new StringBuffer();
            sb.append("GET / HTTP/1.1\r\n");
//			sb.append("Host: www.baidu.com\r\n");
            sb.append("Connection: close\r\n");
//			sb.append("User-agent: Mozilla/5.0\r\n");
//			sb.append("Accept-language: zh-cn\r\n");
            sb.append("\r\n");

            out.write(sb.toString().getBytes());
            out.flush();
            InputStream in = socket.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(in));
            String tmp = "";
            System.out.println("response:\r\n");
            while ((tmp = reader.readLine()) != null) {
                System.out.println(tmp);
            }

            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
