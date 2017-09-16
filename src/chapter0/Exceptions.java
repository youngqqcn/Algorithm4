package chapter0;

/**
 * Created by yqq on 2017/9/10.
 */
public class Exceptions {

    public static void main(String[] args) throws Exception{

        String [] str1 = new String[100];

        for (int i = 0; i < str1.length; i++) {

            str1[i] = i + "" ;

        }

        try {

            for (int i = 0; i < str1.length + 11; i++) {
                System.out.println(str1[i]);
            }
        }catch (Exception e){
            //e.printStackTrace();

        }

        try{

            System.out.println(999/0);
        }catch (Exception e){
           // e.printStackTrace();
        }


        try {

            //Object obj = new String();
            //Student stu1 = new Student();
            //Dog dog1  = (Dog) stu1;

            //Class.forName("Dog") dog2 = new Class.forName("Dog")();

        }catch (Exception e){
            e.printStackTrace();
        }

        /**
         * java.lang.NoClassDefFoundError  JVM 报错找不到文件
         * java.lang.NoSuchFieldError     找不到属性
         * java.lang.NoSuchFieldException
         * java.lang.NoSuchMethodError
         * java.lang.NoSuchMethodException
         * java.lang.NumberFormatException
         * java.lang.VirtualMachineError
         * java.lang.OutOfMemoryError
         *
         * 再RunConfiguration中的run argument中设置   -Xmx900m    分配900M内存
         *
         */

        /*
        try{
            int i = 1/0;
        }catch(Exception e){
            e.printStackTrace();
        }
        */

        try{
            int i = 1/0;
        }catch(Throwable e){
            e.printStackTrace();
        }



        try{

        }catch(Exception e){
            e.printStackTrace();
        }


//        System.out.println("1");
//        try {
//            System.out.println("2");
//            String s = null;
//            s.toString();
//            System.out.println("3");
//        }catch (NullPointerException e){
//            System.out.println("4");
//        }catch(Exception e){
//            System.out.println("5");
//        }
//        System.out.println("6");


//        System.out.println("1");
//        try {
//            System.out.println("2");
//            String s = "";
//            s.toString();
//            System.out.println("3");
//            int[] i = new int[2];
//            i[2] = 100;
//        }catch (NullPointerException e){
//            System.out.println("4");
//        }catch(Exception e){
//            System.out.println("5");
//        }
//        System.out.println("6");


        System.out.println("1");

        try{
            try{
                try{
                    System.out.println("2");
                    int[] a = new int[12];
                    a[-1] = 100;
                }catch(NullPointerException e){
                    System.out.println("3");
                }
                // 如果发生异常,没有被处理,那么就不会往下执行
                System.out.println("3-1");
            //}catch(Error e){
            }catch(Exception e){
                //e.printStackTrace();
                System.out.println("4");
            }
            System.out.println("4-1");
        }catch(Throwable e){
            System.out.println("5");
        }

        System.out.println("6");









    }

}
