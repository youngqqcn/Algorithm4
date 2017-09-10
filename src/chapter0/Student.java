package chapter0;


/**
 * 学习Object的equals() 方法
 *
 * Created by yqq on 2017/9/9.
 */
public class Student {

    public static void main(String[] args) {

        Student stu1 = new Student();
        stu1.setAddress("China");
        stu1.setName("Yqq");

        Student stu2 = new Student();
        stu2.setAddress("Japan");
        stu2.setName("YoKoSaMa");


        Student stu3 = new Student();
        stu3.setAddress("China");
        stu3.setName("Yqq");

        //比较
        System.out.println(stu1.equals(stu2)); //false
        System.out.println(stu1.equals(stu3)); //true

    }

    private String name;
    private String address;


    /**
     * 重写父类的hashCode()方法
     * @return
     */
    @Override
    public int hashCode() {

        return name.hashCode() + address.hashCode();

        //return super.hashCode();
    }

    /**
     * 重写父类的toString()方法
     * @return
     */
    @Override
    public String toString() {

        return name + "  " + address;

        //return super.toString();
    }

    /**
     * 重写回收提醒方法,以区别深浅拷贝
     * @throws Throwable
     */
    @Override
    protected void finalize() throws Throwable {

        System.out.println("Student:\"我被回收了!!\"");

        //super.finalize();
    }

    /**
     *  重写父类Object的equals()
     * @param obj
     * @return 如果属性相等则返回true, 否则返回false
     */
    @Override
    public boolean equals(Object obj) {
        //return super.equals(obj);

        if(this == obj){
            return true;
        }
        if(obj instanceof  Student){
            Student stu = (Student) obj;
            if(stu.name.equals(this.name) && stu.address.equals(this.address)){
                return true;
            }
        }

        return false;
    }





    /**
     * 获取学生名字
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置学生名字
     * @param name  name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取地址
     * @return
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置地址
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }
}
