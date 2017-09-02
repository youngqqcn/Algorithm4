package chapter1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by yqq on 2017/9/2.
 */
public class FileIO {

    public static void main(String[] args) throws IOException{

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

}
