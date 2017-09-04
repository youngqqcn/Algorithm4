package chapter1;

import java.io.*;

/**
 * Created by yqq on 2017/9/2.
 */
public class FileIO {

    /**
     *  用来读写文件
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException{

        //Write();

        //Read1();
        //Read2();

        FileCopyDemo();
    }

    /**
     * 文件复制demo
     */
    private static void FileCopyDemo() throws IOException {

        //File srcFile = new File("./doc/tempdir/test.txt");
        //File dstFile = new File("./doc/tempdir/test_bak.txt");

        File srcFile = new File("./doc/tempdir/ChinaMap.jpg");
        File dstFile = new File("./doc/tempdir/ChinaMap_bak.jpg");

        FileInputStream ifs = new FileInputStream(srcFile);
        FileOutputStream ofs = new FileOutputStream(dstFile);


        int len = 0;
        byte[] buf = new byte[4096];


        //利用缓冲区读写,效率高
        while((len = ifs.read(buf)) != -1){
            ofs.write(buf, 0, len); //读多少写多少
        }

        //挨个字节读写,效率低
        /*
        int ch = 0;
        while((ch = ifs.read()) != -1){
            ofs.write(ch);
        }
        */

        //一次获取文件大小
        /*
        byte[] buf2 = new byte[ifs.available()]; //获取文件的大小
        ifs.read(buf2);
        //System.out.println(buf2.toString());
        ofs.write(buf2);
        */

        //关闭流
        ifs.close();
        ofs.close();
    }

    private static void Read2() throws IOException {


        File file = new File("./doc/tempdir/test.txt");

        FileInputStream ifs = new FileInputStream(file);

        int len = 0;
        byte [] buf = new byte[1024];
        while((len = ifs.read(buf)) != -1){
            System.out.println(new String(buf, 0, len));
        }
    }


    public static void Write() throws IOException {
        //创建临时目录
        File tmpDir = new File("./doc/tempdir");
        if(!tmpDir.exists()){
            tmpDir.mkdir(); //不存在,则创建
        }

        //创建文件
        //File outFile = new File("test.txt");
        File outFile = new File(tmpDir,"test.txt");

        //创建一个输出流
        FileOutputStream ofs = new FileOutputStream(outFile);

        //写数据
        byte[]  tmpData = "Hello Java".getBytes();
        ofs.write(tmpData);

        //关闭输出流
        ofs.close();
    }


    private static void Read1() throws IOException {

        //创建文件对象
        File inFile = new File("./doc/tempdir/test.txt");

        //创建一个文件输入流对象
        FileInputStream ifs = new FileInputStream(inFile);

        //循环读取
        int tmp = -1;
        while(-1 != (tmp = ifs.read())){
            System.out.println((char)tmp);
        }

    }


}
