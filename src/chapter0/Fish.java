package chapter0;

/**
 * Created by yqq on 2017/9/16.
 */
public class Fish {

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        //this.age = age;
        if(age <= 0 || age >= 116){
            throw new AgeException("Age is illegal");
        }
        this.age = age;
    }

    public static void main(String[] args) {

        Fish fish = new Fish();

        fish.setAge(3432);
    }


}
