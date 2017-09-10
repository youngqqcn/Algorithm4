package chapter0;

/**
 * 学习垃圾回收提示函数 Object.finalize()方法
 * Created by yqq on 2017/9/9.
 */
public class Finalize {

    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.setName("wangcai");
        dog1.setColor("black");
        dog1.setAge(32);

        Dog dog2 = new Dog();
        dog2.setAge(43);
        dog2.setColor("red");
        dog2.setName("xiaoqiang");

        //dog1.dog = dog2;
        dog1 = null;
        //dog2 = null;

        System.gc();
        System.gc();

    }







}
