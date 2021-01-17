package Socket;

import java.io.*;
import java.net.Socket;
import java.rmi.MarshalException;
import java.util.Scanner;

/**
 * 聊天室客户端
 * @author wm
 */
public class Client {
    /**
     * java.net.Socket 套接字
     * Socket封装了TCP通讯的细节，使得我们使用TCP
     * 协议在两台计算机（客户端程序与服务端程序）之间通讯
     * 以流的读写操作完成。
     *
     */
    private Socket socket;

    /**
     * 构造方法，用来初始化客户端
     */
    public Client(){
        try {
            /**
             * 实例化Socket的过程就是与服务端建立
             * 连接的过程。
             * 这里需要传入的两个参数：
             * 1.服务器端IP地址
             * 2.服务器端打开的端口号
             * 我们通过IP可以找到网络上的服务端所在的
             * 计算机，通过端口可以找到运行在该机器上
             * 的服务器端应用程序。
             */
            System.out.println("staring connecting");
            socket=new Socket("localhost",8088);
            System.out.println("conneted!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 客户端开始工作的方法
     */
    public void start(){
        try{

            //首先启动读取服务端消息的线程
            ServerHandler handler=new ServerHandler();
            Thread t=new Thread(handler);
            t.start();

            /**
             * Outputstream getOutputStream()
             * 通过Socket获取一个输出流，通过这个输出流写出的字节会
             * 发送给远端计算机
             */
            OutputStream out=socket.getOutputStream();
            OutputStreamWriter osw=
                    new OutputStreamWriter(out);
            BufferedWriter bw=
                    new BufferedWriter(osw);
            PrintWriter pw=
                    new PrintWriter(bw,true);

            //输出消息
            //pw.println("hello ,server!");

            Scanner scanner=new Scanner(System.in);


            while(true){
                String line=scanner.nextLine();
                pw.println(line);




                if("exit".equals(line)){
                    break;
                }
            }

        }
        catch (Exception e){
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        Client client = new Client();
        client.start();
    }



    private class ServerHandler implements Runnable {
        @Override
        public void run() {
            try {
                /**
                 * 通过socket获取输入流，读取服务端发送过来的消息
                 */
                InputStream is=socket.getInputStream();
                InputStreamReader isr=new InputStreamReader(is);
                BufferedReader br=new BufferedReader(isr);
                //从服务器读一行
                String message=null;
                while((message=br.readLine())!=null){
                    System.out.println("host:"+ message);
                }

            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

}
