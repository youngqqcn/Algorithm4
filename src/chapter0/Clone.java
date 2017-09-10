package chapter0;

/**
 * 学习深浅拷贝 --> Object.clone()
 * Created by yqq on 2017/9/10.
 */
public class Clone {

    public static void main(String[] args) throws CloneNotSupportedException {

        Dog dog1 = new Dog();
        dog1.setAge(77);
        dog1.setColor("red");
        dog1.setName("Tom");

        dog1.stu = new Student();
        dog1.stu.setAddress("China");
        dog1.stu.setName("yqq");


        Dog dog2 = (Dog)dog1.clone();
        System.out.println(dog2.getAge());
        System.out.println(dog2.getName());
        System.out.println(dog2.getColor());

        System.out.println("stu:");
        System.out.println(dog2.stu.getAddress());
        System.out.println(dog2.stu.getName());

        dog1.stu = null;
        dog2.stu = null;

        System.gc();//促进垃圾回收
        System.gc();//促进垃圾回收

    }


}
