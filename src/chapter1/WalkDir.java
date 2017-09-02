package chapter1;

import java.io.*;
import java.util.LinkedList;

/**
 * Created by yqq on 2017/9/2.
 */
public class WalkDir {

    /**
     *  以字节为单位读写,
     * @param outFilePath 输出文件路径
     * @param contenStr 输出内容
     */
    public void WriteFile1(String outFilePath , String contenStr){
        File outFile = new File(outFilePath);
        InputStream in = null;
        try{
            in = new FileInputStream(outFile);
            int tmp;
            while((tmp = in.read()) != -1){
                System.out.print(tmp);
            }
        }catch (IOException e){
            e.printStackTrace();
            return;
        }


        try{
            byte []bt = new byte[1024];
            in = new FileInputStream(outFile);
            //TODO

        }catch (IOException e){
            e.printStackTrace();
            return;
        }

    }

    public  static void ToWalkDir(File file)
    {
        if(file.isFile())
        {
            System.out.println(file.getName());
        }

        if (file.isDirectory())
        {
            System.out.println(file.getName() + "/");
            for(File _file : file.listFiles())
            {
                ToWalkDir(_file);
            }
        }
    }

    /**
     * 使用递归遍历目录
     */
    public static void RecursionWalkDir(){

        File dir = new File(".");
        File [] files = dir.listFiles();

        for(File file : files){
            ToWalkDir(file);
        }
    }

    /**
     * 非递归遍历目录
     * 数据结构: 使用队列的方式, 将目录存起来
     */
    public static void NonRecursionWalkDir(){

        LinkedList<File> dirList = new LinkedList<File>();

        File curDir = new File(".");
        File[] files = curDir.listFiles();

        for(File file : files){
            if(file.isFile()){
                System.out.println(file.getName());
            }else{
                System.out.println(file.getName() + "\n---------");
                dirList.addLast(file); //在队尾插入
            }
        }

        while(!dirList.isEmpty()){

            File tmpDir = dirList.removeFirst();  //队头出队
            System.out.println(tmpDir.getName() + "\n-------");

            File[] subFiles = tmpDir.listFiles();
            for(File eachSubFile  : subFiles){
                if (eachSubFile.isFile()){
                    System.out.println(eachSubFile.getName());
                }else{
                    dirList.addLast(eachSubFile); //在队尾插入
                }
            }
        }



    }


    public static void main(String []args){

        RecursionWalkDir(); //递归遍历目录

        //NonRecursionWalkDir(); //非递归遍历目录


    }
}
