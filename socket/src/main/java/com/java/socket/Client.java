package com.java.socket;

import java.io.*;
import java.net.Socket;

/**
 * @ClassName Client
 * @Description TODO
 * @Author oldghoast
 * @date 2021/12/21 15:46
 * @Version 1.0
 */
public class Client {

    public static void main(String[] args) throws IOException {
        //1、创建客户端Socket，指定服务器地址和端口
        Socket socket = new Socket("127.0.0.1", 10086);
        //2、获取输出流，向服务器端发送信息
        OutputStream os = socket.getOutputStream();//字节输出流
        PrintWriter pw = new PrintWriter(os);//将输出流包装成打印流
        pw.write("用户名：admin；密码：admin");
        pw.flush();
        socket.shutdownOutput();
        //3、获取输入流，并读取服务器端的响应信息
        InputStream is = socket.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        String info = null;
        while ((info = br.readLine()) != null) {
            System.out.println("我是客户端，服务端说：" + info);
        }
        //4、关闭资源
        br.close();
        is.close();
        pw.close();
        os.close();
        socket.close();
    }

}
