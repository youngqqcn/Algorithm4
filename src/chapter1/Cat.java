package chapter1;
import com.sun.media.jfxmediaimpl.platform.ios.IOSMediaPlayer;

import java.io.*;

//import static sun.java2d.cmm.ColorTransform.In;

/**
 * Created by yqq on 2017/9/2.
 */
public class Cat {
    public static void main(String args[]) {

        System.out.print("hello world!!!!");


        //for (int i = 0; i < args.length - 1; i++) {
            //File file = new File("C:\\Users\\yqq\\IdeaProjects\\Algorithm4\\doc", "test.txt");
            //File file = new File("..\\..\\doc\\test.txt");  //error
            File file = new File("./doc/test.txt"); //ok
            //String filePath = file.getAbsolutePath(); //结论: 是项目Algorithm4目录下,而不是源文件所在目录
            //System.out.print(filePath);
            try {
                file.createNewFile();
            }catch(IOException e){
                e.printStackTrace();
            }

            String str1 = "测试";
            byte bt[] = str1.getBytes();
            try{

                FileOutputStream out = new FileOutputStream(file);
                try {
                    out.write(bt); //写文件
                    out.close();
                    System.out.print("file write success!");
                }catch (IOException e){
                    e.printStackTrace();
                }
            }catch(IOException e){
                e.printStackTrace();
            }


        //}
    }
}
