package Socket;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;
import sun.awt.windows.ThemeReader;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.Arrays;

/**
 * 聊天室服务端
 * @author wm
 *
 * 注意：内部类：可以共同访问外部类属性
 * 内部类分为：成员内部类、方法内部类、匿名内部类、静态嵌套内部类
 */
public class Server {
    /**
     * java.net.ServerSocket
     * 运行在服务端的ServerSocket主要有两个工种
     * 1.向服务端申请服务端口，客户端就是通过这个端口与服务端连接了就会自动创建一个Soc端建立连接的
     * 2.监听服务端口，一旦客户ket实例，
     * 通过该Socket就可以与客户端交互
     */
    private ServerSocket server;

    /**
     * 用来保存所有clientHandler中对应客户端的输出流，以便广播消息使用
     */
    private PrintWriter[] allOut={};
    /**
     * 构造方法，用来初始化服务端
     */
    public Server(){
        try {
            System.out.println("start server ...");
            server=new ServerSocket(8088);
            System.out.println("finished!");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /**
     * 服务端开始工作方法
     */
    public void start(){
        try {
            /**
             * Socket accept()
             * ServerSocket提供的该方法用于等待客户端的连接，一旦一个客户端
             * 建立连接该方法会立刻返回一个Socket实例，通过该Socket就可以
             * 与该客户端交互了
             * 多次调用该方法可以等待多个客户端的连接。
             */
            while (true) {
                System.out.println("waiting for connection");
                Socket socket = server.accept();
                System.out.println("one client connected");
                //创建一个线程处理该客户端交互
                Handlerclient handlerclient=new Handlerclient(socket);
                Thread t1= new Thread(handlerclient);
                t1.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }


        System.out.println("test");


    }

    public static void main(String[] args) {
        Server server=new Server();
        server.start();
    }

    private class Handlerclient implements Runnable{
        private Socket socket;
        private String host;
        public Handlerclient(Socket socket){
            this.socket=socket;
            this.host=socket.getInetAddress().getHostAddress();
        }
        public void run() {
            /**
             * InputStream getInputStream()
             * 通过Socket获取的输入流读取的字节
             * 是远端计算机发送过来的字节
             */
            try {


                InputStream is = socket.getInputStream();
                InputStreamReader isr =
                        new InputStreamReader(is);
                BufferedReader br =
                        new BufferedReader(isr);
                /**
                 * 通过Socket获取输出流，用于给客户端发送消息
                 */
                OutputStream out=socket.getOutputStream();
                OutputStreamWriter osw=
                        new OutputStreamWriter(out,"UTF-8");
                BufferedWriter bw=
                        new BufferedWriter(osw);
                PrintWriter pw=
                        new PrintWriter(bw,true);

                /**
                 * 将该输出流存入到allOut中用于共享
                 */
                //1.数组扩容
                allOut=Arrays.copyOf(allOut,allOut.length+1);
                //2.拷贝pw到
                allOut[allOut.length-1]=pw;
                System.out.println(host+"on line,now have pepole"+allOut.length);


                String message = null;
                /**
                 * 使用BufferedReader 读取客户端发过来的一行字符串
                 * 时，当客户端断开连接，此时客户端的系统不同时，反应
                 * 通常不同：
                 * 当windows的客户端断开连接时，readline方法通常会
                 * 直接抛出SocketException
                 * 当Linux的客户端断开时，readLine方法会返回null值
                 *
                 */
                while ((message = br.readLine()) != null) {

                    if ("exit".equals(message)) {
                        break;
                    }

                    System.out.println("client:"+host+" message is :" + message);
                    //遍历allOut,将消息发送给所有客户端
                    for(int i=0;i<allOut.length;i++) {
                        allOut[i].println(host + "said:" + message);
                    }
                    /*
                    Thread t= Thread.currentThread();
                    System.out.println("current thread is "+t);
                */
                }
            }catch (Exception e){
                e.printStackTrace();
            }finally {
                //删除allOut数组中的输出流


                //处理客户端断开连接后的操作
               try{
                   socket.close();
               }catch (IOException e){
                   e.printStackTrace();
               }

            }
        }


    }

}
