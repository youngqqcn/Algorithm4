package chapter0;

/**
 *
 * 学习Object.toString()方法
 * Created by yqq on 2017/9/10.
 */
public class ToString {


    public static void main(String[] args) {


        Student stu1 = new Student();
        Student stu2 = new Student();

        stu1.setAddress("China");
        stu1.setName("yqq");

        stu2.setAddress("Japan");
        stu2.setName("Jim");

        System.out.println(stu1.toString());
        System.out.println("--------------");
        System.out.println(stu2.toString());

    }


}
