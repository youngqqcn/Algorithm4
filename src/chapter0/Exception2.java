package chapter0;

/**
 * 自定义异常
 * Created by yqq on 2017/9/16.
 */
public class Exception2 {

    public static void method() throws NullPointerException , ClassNotFoundException{
        throw new NullPointerException();
    }



    public static void main(String[] args) throws ClassNotFoundException {

//        try {
//            try {
//                try {
//                    System.out.println("1");
//                    String s = null;
//                    s.toString();
//                    System.out.println("2");
//                } finally {
//                    System.out.println("3");
//                }
//                System.out.println("4");
//            } catch (NumberFormatException e) {
//                System.out.println("5");
//            } finally {
//                System.out.println("6");
//            }
//            System.out.println("7");
//        }catch (ArithmeticException e) {
//            System.out.println("8");
//        }finally {
//            System.out.println("9");
//        }
//        System.out.println("10");



        /*
        try{
            throw new NullPointerException();
        }catch(NullPointerException e){
            System.out.println("deal: " + e);
        }
        */

//        try{
//            method();
//        }catch(Exception e){
//            System.out.printf("" + e);
//        }

        method();




        // 直接继承Exception或Error的类, 必须实现try-catch或者方法抛出异常
        // RuntimeException 不是必须抛出的


    }

}








