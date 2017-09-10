package chapter0;

/**
 * 学习Object.hashCode()方法
 * Created by yqq on 2017/9/10.
 */
public class HashCode {

    public static void main(String[] args) {
//        Dog dog = new Dog();
//        Dog dog2 = dog;
//        System.out.println(dog.hashCode());
//        System.out.println(dog2.hashCode());


//        Dog dog1 = new Dog();
//        dog1.setName("wangcai");
//        dog1.setColor("black");
//        dog1.setAge(99);
//
//        Dog dog2 = new Dog();
//        dog2.setName("wangcai");
//        dog2.setColor("black");
//        dog2.setAge(99);

//        System.out.println(dog1.hashCode());
//        System.out.println(dog2.hashCode());


        Student stu1 = new Student();
        stu1.setName("yqq");
        stu1.setAddress("China");


        Student stu2 = new Student();
        stu2.setName("yqq");
        stu2.setAddress("China");

        System.out.println(stu1.hashCode());
        System.out.println(stu2.hashCode());





    }






}
