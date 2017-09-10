package chapter0;

/**
 * Created by yqq on 2017/9/9.
 */
public class Dog {

    public static void main(String[] args) {

        Dog dog1 = new Dog();
        Dog dog2 = new Dog();

        dog1.setAge(11);
        dog1.setColor("yellow");
        dog1.setName("wangcai");

        dog2.setAge(11);
        dog2.setColor("yellow");
        dog2.setName("wangcai");

        System.out.println(dog1.equals(dog2));
    }

    private String name;
    private String color;
    private int age;
    //public Dog dog;
    //public Student stu = new Student();  //每次都是一个新student对象了
    public Student stu ;



    /**
     * 重写父类的clone()方法
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {

        Dog dog = new Dog();
        dog.setName(this.name);
        dog.setColor(this.color);
        dog.setAge(this.age);

        /**
         * 浅拷贝, "Student:"我被回收了!!" 只有一个stu对象只被释放一次
         */
        dog.stu  = this.stu;


        /**
         * 深拷贝, stu对象有两个,垃圾回收是会打印两句话
         */
//        dog.stu = new Student();
//        dog.stu.setName(this.stu.getName());
//        dog.stu .setAddress(this.stu.getAddress());

        return dog;
        //return super.clone();
    }

    /**
     * 重写父类Object的equals() 方法
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj) {

        if(this == obj){
            return true;
        }
        if(obj instanceof Dog) {
            Dog dog = (Dog) obj;
            if(dog.name.equals(this.name)){
                if(dog.color.equals(this.color)){
                    if(dog.age == this.age){
                        return true;
                    }
                }
            }

        }

        return false;
    }

    /**
     * 实现父类Object的垃圾回收函数
     * @throws Throwable
     */
    @Override
    protected void finalize() throws Throwable {
        System.out.println(this.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
