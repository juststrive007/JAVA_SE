package raf;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 修改用户昵称
 * 程序启动后要求用户输入用户名和新昵称
 * 然后将user.dat文件中该用户的昵称修改
 * @author wm
 */
public class UpdateDemo {
    public static void main(String[] args) throws IOException {
        RandomAccessFile raf=
                new RandomAccessFile("./user.dat","rw");

        Scanner scanner=new Scanner(System.in);
        System.out.println("name:");
        String name=scanner.nextLine();
        System.out.println("newnc:");
        String nc = scanner.nextLine();

        byte[] data=nc.getBytes("utf-8");
        data = Arrays.copyOf(data,32);
        long pos=raf.getFilePointer();
        boolean update=false;//是否修改过
        for(int i=0;i<(raf.length()/100);i++){

            //获取名字
            byte[] namedate=new byte[32];
            raf.read(namedate);
            String nameread=new String(namedate,"utf-8").trim();

            //判断名字
            if(nameread.equals(name)){
                long p=raf.getFilePointer();
                raf.seek(p+32);//i*100+64
                raf.write(data);
                update = true;
                break;
            }
            raf.seek((i+1)*100);
        }

        if(!update){
            System.out.println("no this person!");
        }else {

            System.out.println("ok");
        }
        raf.close();
    }

}
