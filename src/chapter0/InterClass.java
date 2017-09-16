package chapter0;

/**
 * 内部类
 *
 * Created by yqq on 2017/9/10.
 */
public class InterClass {


    public static void main(String[] args) {

        /**
         * 无名类,  继承 InterClass
         */
        InterClass ic1 = new InterClass(){
            @Override
            public String toString() {
                return "This is InterClass";
                //return super.toString();
            }
        };
        System.out.println(ic1);


        /**
         * c3obj 是 一个继承自InterClass.c3类的无名类的对象
         */
        InterClass.c3 c3obj = new InterClass.c3(){

            /**
             * 重写父类InterClass.c3的toString()
             * @return
             */
            @Override
            public String toString() {
                return "This is InterClass.c3 ";
                //return super.toString();
            }
        };

        System.out.println(c3obj);

    }


    abstract class c1{

    }

    class c2{

    }

    static class c3{

    }

    interface c4{

    }

}
