package io;

import java.io.*;

/**
 * 在流连接中使用PW
 *
 * @author wm
 */
public class PWdemo2 {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        FileOutputStream fos=
                new FileOutputStream("pw2.txt");
        OutputStreamWriter osw=
                new OutputStreamWriter(fos,"utf-8");
        BufferedWriter bw=
                new BufferedWriter(osw);
        PrintWriter pw=
                new PrintWriter(bw);
        pw.println("stream connection test");

        pw.close();
        System.out.println("ok");
    }
}
