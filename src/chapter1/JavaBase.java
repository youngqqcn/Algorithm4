package chapter1;

/**
 * Created by yqq on 2017/9/1.
 */
public class JavaBase {


    /**
     * 欧几里得算法
     * @param p
     * @param q
     * @return
     */
    public static int Gcd(int p, int q){
        if(0 == q)
            return p;
        return Gcd(q, p % q);
    }

    public static void main(String []args){
        //System.out.print("hello world");


        int a = 48;
        int b = 64;

        System.out.println(a +" " + b +"的最大公约数:" + Gcd(a, b));
    }
}


