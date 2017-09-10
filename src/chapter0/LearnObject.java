package chapter0;

/**
 * Created by yqq on 2017/9/9.
 */
public class LearnObject {

    public static void main(String[] args) {


        /**
         *   == 比较的内存地址
         */
        {
            //System.out.println("abcd" == "abcd"); //true

            String str1 = "abcd";
            String str2 = new String("abcd"); //开辟了一段新内存
            System.out.println(str1 == str2); //false
        }



        /**
         * equals() 比较的是内存
         */
        {
            String str1 = "abcd";
            String str2 = new String("abcd"); //开辟了一段新内存
            System.out.println(str1.equals(str2)); //true
        }




    }


}
