import jdk.net.Sockets;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;

/**
 * @Author: YanL
 * @Time: 23:43 2019/12/10
 * @Email: imyanl.dt@gmail.com
 * @Description:
 */
public class SerDemo {
    public static void main(String[] args) throws IOException {
        System.out.println("服务端 启动，等待连接....");
        //创建ServerSocket对象
        ServerSocket server = new ServerSocket(8888);
        while (true) {
            Socket socket = server.accept();
            new Thread(new Web(socket)).start();
        }
    }

    static class Web implements Runnable {
        private Socket socket;
        public Web(Socket socket){
            this.socket = socket;
        }

        @Override
        public void run() {
            try{

                //转换流读取浏览器的请求信息
                BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                //取出请求资源的路径
                String request = reader.readLine();
                System.out.println(request);
                //取出请求资源的路径
                String[] strArr = request.split(" ");
                System.out.println(Arrays.toString(strArr));
                String path = strArr[1].substring(1);
                System.out.println(path);
                //读取客户端请求的资源文件
                FileInputStream fis = new FileInputStream(path);
                byte[] bytes = new byte[1024];
                int len = 0;

                OutputStream out = socket.getOutputStream();
                //写入HTTP响应头，固定写法
                out.write("HTTP/1.1 200 OK\r\n".getBytes());
                out.write("Content-Type:text/html\r\n".getBytes());
                //必须要写入空行，否则浏览器不解析
                out.write("\r\n".getBytes());
                while ((len = fis.read(bytes)) != -1) {
                    out.write(bytes, 0, len);
                }

                fis.close();
                out.close();
                reader.close();
                socket.close();
            }catch (IOException e){
                e.printStackTrace();
            }

        }

    }
}
